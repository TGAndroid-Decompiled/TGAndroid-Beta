package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Vibrator;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import nh.j2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.pd0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.lh1;

public class VoIPPreNotificationService {
    public static State currentState;
    public static TL_phone.PhoneCall pendingCall;
    public static Intent pendingVoIP;
    private static MediaPlayer ringtonePlayer;
    private static final Object sync = new Object();
    private static Vibrator vibrator;

    public static final class State implements VoIPServiceState {
        private final TL_phone.PhoneCall call;
        private final int currentAccount;
        private boolean destroyed;
        private final long userId;

        public State(int i10, long j10, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i10;
            this.userId = j10;
            this.call = phoneCall;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(ApplicationLoader.applicationContext);
        }

        @Override
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(ApplicationLoader.applicationContext, 1);
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            lh1 lh1Var = lh1.f40088j1;
            if (lh1Var != null) {
                lh1Var.onStateChanged(getCallState());
            }
        }

        @Override
        public final long getCallDuration() {
            return v0.a(this);
        }

        @Override
        public int getCallState() {
            return this.destroyed ? 11 : 15;
        }

        @Override
        public TLRPC.GroupCall getGroupCall() {
            return null;
        }

        @Override
        public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
            return null;
        }

        @Override
        public TL_phone.PhoneCall getPrivateCall() {
            return this.call;
        }

        @Override
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.userId));
        }

        @Override
        public boolean isCallingVideo() {
            TL_phone.PhoneCall phoneCall = this.call;
            if (phoneCall != null) {
                return phoneCall.video;
            }
            return false;
        }

        @Override
        public boolean isConference() {
            return false;
        }

        @Override
        public boolean isOutgoing() {
            return false;
        }

        @Override
        public void stopRinging() {
            VoIPPreNotificationService.stopRinging();
        }
    }

    private static void acknowledge(Context context, int i10, TL_phone.PhoneCall phoneCall, Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call " + phoneCall.f22606id + " was discarded before the voip pre notification started, stopping");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state = currentState;
            if (state != null) {
                state.destroy();
                return;
            }
            return;
        }
        if (!XiaomiUtilities.isMIUI() || XiaomiUtilities.isCustomPermissionGranted(10020) || !((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.f22445id = phoneCall.f22606id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            ConnectionsManager.getInstance(i10).sendRequest(receivedcall, new cg.g0(20, context, runnable), 2);
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
        }
        pendingVoIP = null;
        pendingCall = null;
        State state2 = currentState;
        if (state2 != null) {
            state2.destroy();
        }
    }

    public static void answer(Context context) {
        FileLog.d("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            FileLog.d("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", UserConfig.selectedAccount);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (!pd0.f("android.permission.RECORD_AUDIO") || (isVideo() && !pd0.f("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                    return;
                } catch (Exception e9) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error starting permission activity", e9);
                        return;
                    }
                    return;
                }
            }
            if (Build.VERSION.SDK_INT >= 26) {
                context.startForegroundService(pendingVoIP);
            } else {
                context.startService(pendingVoIP);
            }
            pendingVoIP = null;
        }
        dismiss(context, true);
    }

    public static void decline(Context context, int i10) {
        FileLog.d("VoIPPreNotification.decline(" + i10 + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            FileLog.d("VoIPPreNotification.decline(" + i10 + "): pending intent or call is not found");
            return;
        }
        int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = pendingCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.f22445id = phoneCall.f22606id;
        discardcall.duration = 0;
        discardcall.connection_id = 0L;
        if (i10 == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i10 == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i10 != 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        }
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new j2(intExtra, 2), 2);
        dismiss(context, false);
    }

    public static void dismiss(Context context, boolean z10) {
        FileLog.d("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (z10) {
            return;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            MessagesController.getInstance(i10).ignoreSetOnline = false;
        }
        AndroidUtilities.runOnUIThread(new i(2));
    }

    public static State getState() {
        return currentState;
    }

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        return intent != null && intent.getBooleanExtra("video", false);
    }

    public static void lambda$acknowledge$2(TLObject tLObject, TLRPC.TL_error tL_error, Context context, Runnable runnable) {
        if (BuildVars.LOGS_ENABLED) {
            FileLog.w("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error == null) {
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.e("error on receivedCall: " + tL_error);
        }
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        dismiss(context, false);
    }

    public static void lambda$acknowledge$3(Context context, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new k(tLObject, tL_error, context, runnable, 2));
    }

    public static void lambda$decline$4(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(i10).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.f35506d1 && VoIPService.getSharedInstance() == null) {
            launchActivity.f35506d1 = false;
            lh1 lh1Var = lh1.f40088j1;
            if (lh1Var != null) {
                lh1Var.n();
            }
            launchActivity.moveTaskToBack(true);
        }
    }

    public static void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i10, j10, phoneCall.f22606id, z10));
        startRinging(context, i10, j10);
    }

    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
        }
    }

    private static Notification makeNotification(Context context, int i10, long j10, long j11, boolean z10) {
        boolean z11;
        int i11;
        int i12;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(z10 ? R.string.VoipInVideoCallBranding : R.string.VoipInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, action, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i13 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i13);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i13);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i13);
        if (notificationChannel3 == null) {
            z11 = true;
        } else if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i13);
            i13++;
            globalNotificationsSettings.edit().putInt("calls_notification_channel", i13).commit();
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
            NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i13, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
            try {
                notificationChannel4.setSound(null, audioAttributesBuild);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
            notificationChannel4.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
            notificationChannel4.enableVibration(false);
            notificationChannel4.enableLights(false);
            notificationChannel4.setBypassDnd(true);
            try {
                notificationManager.createNotificationChannel(notificationChannel4);
            } catch (Exception e10) {
                FileLog.e(e10);
                return null;
            }
        }
        contentIntent.setChannelId("incoming_calls4" + i13);
        Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent.putExtra("call_id", j11);
        String string = LocaleController.getString(R.string.VoipDeclineCall);
        int i14 = Build.VERSION.SDK_INT;
        if (i14 < 24 || i14 >= 31) {
            i11 = 0;
        } else {
            SpannableString spannableString = new SpannableString(string);
            i11 = 0;
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i11, intent, 301989888);
        Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent2.putExtra("call_id", j11);
        String string2 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i14 < 24 || i14 >= 31) {
            i12 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(string2);
            i12 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
        }
        PendingIntent activity = PendingIntent.getActivity(context, i12, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer"), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i12);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i12]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i12, action, 33554432), true);
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            contentIntent.addPerson("tel:" + user.phone);
        }
        Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(context.getPackageName() + ".HIDE_CALL");
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160));
        Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i10, user);
        String name = ContactsController.formatName(user);
        if (TextUtils.isEmpty(name)) {
            name = "___";
        }
        contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
        return contentIntent.build();
    }

    public static boolean open(Context context) {
        if (VoIPService.getSharedInstance() != null) {
            return true;
        }
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            return false;
        }
        intent.getIntExtra("account", UserConfig.selectedAccount);
        pendingVoIP.putExtra("openFragment", true);
        pendingVoIP.putExtra("accept", false);
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(pendingVoIP);
        } else {
            context.startService(pendingVoIP);
        }
        pendingVoIP = null;
        dismiss(context, true);
        return true;
    }

    public static void show(final Context context, final Intent intent, final TL_phone.PhoneCall phoneCall) {
        FileLog.d("VoIPPreNotification.show()");
        if (phoneCall == null || intent == null) {
            dismiss(context, false);
            FileLog.d("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TL_phone.PhoneCall phoneCall2 = pendingCall;
        if (phoneCall2 == null || phoneCall2.f22606id != phoneCall.f22606id) {
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
            final long longExtra = intent.getLongExtra("user_id", 0L);
            final boolean z10 = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new Runnable() {
                @Override
                public final void run() {
                    VoIPPreNotificationService.lambda$show$1(intent, phoneCall, context, intExtra, longExtra, z10);
                }
            });
        }
    }

    public static void startRinging(Context context, int i10, long j10) {
        int i11;
        long j11;
        String string;
        Uri defaultUri;
        boolean z10;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i10);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        boolean z11 = audioManager.getRingerMode() != 0;
        boolean zIsWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (z11 && ringtonePlayer == null) {
            synchronized (sync) {
                try {
                    if (ringtonePlayer != null) {
                        return;
                    }
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    ringtonePlayer = mediaPlayer;
                    mediaPlayer.setOnPreparedListener(new p());
                    ringtonePlayer.setLooping(true);
                    if (zIsWiredHeadsetOn) {
                        ringtonePlayer.setAudioStreamType(0);
                    } else {
                        ringtonePlayer.setAudioStreamType(2);
                    }
                    try {
                        if (notificationsSettings.getBoolean("custom_" + j10, false)) {
                            string = notificationsSettings.getString("ringtone_path_" + j10, null);
                        } else {
                            string = notificationsSettings.getString("CallsRingtonePath", null);
                        }
                        if (string != null) {
                            Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                            if (uri == null || !string.equalsIgnoreCase(uri.getPath())) {
                                defaultUri = Uri.parse(string);
                                z10 = false;
                            } else {
                                defaultUri = RingtoneManager.getDefaultUri(1);
                            }
                            FileLog.d("start ringtone with " + z10 + " " + defaultUri);
                            ringtonePlayer.setDataSource(context, defaultUri);
                            ringtonePlayer.prepareAsync();
                            if (notificationsSettings.getBoolean("custom_" + j10, false)) {
                                i11 = notificationsSettings.getInt("calls_vibrate_" + j10, 0);
                            } else {
                                i11 = notificationsSettings.getInt("vibrate_calls", 0);
                            }
                            if ((i11 == 2 && i11 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i11 == 4 && audioManager.getRingerMode() == 1)) {
                                Vibrator vibrator2 = (Vibrator) context.getSystemService("vibrator");
                                vibrator = vibrator2;
                                if (i11 == 1) {
                                    j11 = 350;
                                } else if (i11 == 3) {
                                    j11 = 1400;
                                } else {
                                    j11 = 700;
                                }
                                vibrator2.vibrate(new long[]{0, j11, 500}, 0);
                            }
                        }
                        defaultUri = RingtoneManager.getDefaultUri(1);
                        z10 = true;
                        FileLog.d("start ringtone with " + z10 + " " + defaultUri);
                        ringtonePlayer.setDataSource(context, defaultUri);
                        ringtonePlayer.prepareAsync();
                    } catch (Exception e9) {
                        FileLog.e(e9);
                        MediaPlayer mediaPlayer2 = ringtonePlayer;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                            ringtonePlayer = null;
                        }
                    }
                    if (notificationsSettings.getBoolean("custom_" + j10, false)) {
                        i11 = notificationsSettings.getInt("calls_vibrate_" + j10, 0);
                    } else {
                        i11 = notificationsSettings.getInt("vibrate_calls", 0);
                    }
                    if (i11 == 2) {
                        Vibrator vibrator3 = (Vibrator) context.getSystemService("vibrator");
                        vibrator = vibrator3;
                        if (i11 == 1) {
                            j11 = 350;
                        } else if (i11 == 3) {
                            j11 = 1400;
                        } else {
                            j11 = 700;
                        }
                        vibrator3.vibrate(new long[]{0, j11, 500}, 0);
                    } else {
                        Vibrator vibrator4 = (Vibrator) context.getSystemService("vibrator");
                        vibrator = vibrator4;
                        if (i11 == 1) {
                            j11 = 350;
                        } else if (i11 == 3) {
                            j11 = 1400;
                        } else {
                            j11 = 700;
                        }
                        vibrator4.vibrate(new long[]{0, j11, 500}, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void stopRinging() {
        synchronized (sync) {
            try {
                MediaPlayer mediaPlayer = ringtonePlayer;
                if (mediaPlayer != null) {
                    mediaPlayer.stop();
                    ringtonePlayer.release();
                    ringtonePlayer = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }
}
