package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
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
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import java.util.ArrayList;
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
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFragment;
import org.telegram.ui.VoIPPermissionActivity;

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

        @Override
        public long getCallDuration() {
            return VoIPServiceState.CC.$default$getCallDuration(this);
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
        public boolean isConference() {
            return false;
        }

        @Override
        public boolean isOutgoing() {
            return false;
        }

        public State(int i, long j, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i;
            this.userId = j;
            this.call = phoneCall;
        }

        @Override
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.userId));
        }

        @Override
        public int getCallState() {
            return this.destroyed ? 11 : 15;
        }

        @Override
        public TL_phone.PhoneCall getPrivateCall() {
            return this.call;
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
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(ApplicationLoader.applicationContext);
        }

        @Override
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(ApplicationLoader.applicationContext, 1);
        }

        @Override
        public void stopRinging() {
            VoIPPreNotificationService.stopRinging();
        }

        public void destroy() {
            if (this.destroyed) {
                return;
            }
            this.destroyed = true;
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().onStateChanged(getCallState());
            }
        }
    }

    public static State getState() {
        return currentState;
    }

    private static Notification makeNotification(Context context, int i, long j, long j2, boolean z) {
        boolean z2;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 33) {
            return null;
        }
        TLRPC.User user = MessagesController.getInstance(i).getUser(Long.valueOf(j));
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent action = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip");
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(z ? R.string.VoipInVideoCallBranding : R.string.VoipInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, action, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i4 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i4);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i4);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i4);
        if (notificationChannel3 == null) {
            z2 = true;
        } else if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i4);
            i4++;
            globalNotificationsSettings.edit().putInt("calls_notification_channel", i4).commit();
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            NotificationChannel notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m("incoming_calls4" + i4, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
            try {
                notificationChannelM.setSound(null, audioAttributesBuild);
            } catch (Exception e) {
                FileLog.e(e);
            }
            notificationChannelM.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
            notificationChannelM.enableVibration(false);
            notificationChannelM.enableLights(false);
            notificationChannelM.setBypassDnd(true);
            try {
                notificationManager.createNotificationChannel(notificationChannelM);
            } catch (Exception e2) {
                FileLog.e(e2);
                return null;
            }
        }
        contentIntent.setChannelId("incoming_calls4" + i4);
        Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent.putExtra("call_id", j2);
        String string = LocaleController.getString(R.string.VoipDeclineCall);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 24 || i5 >= 31) {
            i2 = 0;
        } else {
            SpannableString spannableString = new SpannableString(string);
            i2 = 0;
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i2, intent, 301989888);
        Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent2.putExtra("call_id", j2);
        String string2 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i5 < 24 || i5 >= 31) {
            i3 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(string2);
            i3 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
        }
        PendingIntent activity = PendingIntent.getActivity(context, i3, new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip_answer"), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i3);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i3]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i3, action, 33554432), true);
        if (user != null && !TextUtils.isEmpty(user.phone)) {
            contentIntent.addPerson("tel:" + user.phone);
        }
        Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(context.getPackageName() + ".HIDE_CALL");
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160));
        Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, user);
        String name = ContactsController.formatName(user);
        if (TextUtils.isEmpty(name)) {
            name = "___";
        }
        contentIntent.setStyle(Notification.CallStyle.forIncomingCall(VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
        return contentIntent.build();
    }

    public static void startRinging(Context context, int i, long j) {
        int i2;
        long j2;
        String string;
        Uri defaultUri;
        boolean z;
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        boolean z2 = audioManager.getRingerMode() != 0;
        boolean zIsWiredHeadsetOn = audioManager.isWiredHeadsetOn();
        if (z2 && ringtonePlayer == null) {
            synchronized (sync) {
                try {
                    if (ringtonePlayer != null) {
                        return;
                    }
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    ringtonePlayer = mediaPlayer;
                    mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public final void onPrepared(MediaPlayer mediaPlayer2) {
                            VoIPPreNotificationService.$r8$lambda$8xuOUE_SZMGh3Mddxb6Oo8iQDH4(mediaPlayer2);
                        }
                    });
                    ringtonePlayer.setLooping(true);
                    if (zIsWiredHeadsetOn) {
                        ringtonePlayer.setAudioStreamType(0);
                    } else {
                        ringtonePlayer.setAudioStreamType(2);
                    }
                    try {
                        if (notificationsSettings.getBoolean("custom_" + j, false)) {
                            string = notificationsSettings.getString("ringtone_path_" + j, null);
                        } else {
                            string = notificationsSettings.getString("CallsRingtonePath", null);
                        }
                        if (string == null) {
                            defaultUri = RingtoneManager.getDefaultUri(1);
                        } else {
                            Uri uri = Settings.System.DEFAULT_RINGTONE_URI;
                            if (uri != null && string.equalsIgnoreCase(uri.getPath())) {
                                defaultUri = RingtoneManager.getDefaultUri(1);
                            } else {
                                defaultUri = Uri.parse(string);
                                z = false;
                            }
                            FileLog.d("start ringtone with " + z + " " + defaultUri);
                            ringtonePlayer.setDataSource(context, defaultUri);
                            ringtonePlayer.prepareAsync();
                            if (notificationsSettings.getBoolean("custom_" + j, false)) {
                                i2 = notificationsSettings.getInt("calls_vibrate_" + j, 0);
                            } else {
                                i2 = notificationsSettings.getInt("vibrate_calls", 0);
                            }
                            if ((i2 == 2 && i2 != 4 && (audioManager.getRingerMode() == 1 || audioManager.getRingerMode() == 2)) || (i2 == 4 && audioManager.getRingerMode() == 1)) {
                                Vibrator vibrator2 = (Vibrator) context.getSystemService("vibrator");
                                vibrator = vibrator2;
                                if (i2 == 1) {
                                    j2 = 350;
                                } else if (i2 == 3) {
                                    j2 = 1400;
                                } else {
                                    j2 = 700;
                                }
                                vibrator2.vibrate(new long[]{0, j2, 500}, 0);
                            }
                        }
                        z = true;
                        FileLog.d("start ringtone with " + z + " " + defaultUri);
                        ringtonePlayer.setDataSource(context, defaultUri);
                        ringtonePlayer.prepareAsync();
                    } catch (Exception e) {
                        FileLog.e(e);
                        MediaPlayer mediaPlayer2 = ringtonePlayer;
                        if (mediaPlayer2 != null) {
                            mediaPlayer2.release();
                            ringtonePlayer = null;
                        }
                    }
                    if (notificationsSettings.getBoolean("custom_" + j, false)) {
                        i2 = notificationsSettings.getInt("calls_vibrate_" + j, 0);
                    } else {
                        i2 = notificationsSettings.getInt("vibrate_calls", 0);
                    }
                    if (i2 == 2) {
                        Vibrator vibrator3 = (Vibrator) context.getSystemService("vibrator");
                        vibrator = vibrator3;
                        if (i2 == 1) {
                            j2 = 350;
                        } else if (i2 == 3) {
                            j2 = 1400;
                        } else {
                            j2 = 700;
                        }
                        vibrator3.vibrate(new long[]{0, j2, 500}, 0);
                    } else {
                        Vibrator vibrator4 = (Vibrator) context.getSystemService("vibrator");
                        vibrator = vibrator4;
                        if (i2 == 1) {
                            j2 = 350;
                        } else if (i2 == 3) {
                            j2 = 1400;
                        } else {
                            j2 = 700;
                        }
                        vibrator4.vibrate(new long[]{0, j2, 500}, 0);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void $r8$lambda$8xuOUE_SZMGh3Mddxb6Oo8iQDH4(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            FileLog.e(th);
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

    public static void show(final Context context, final Intent intent, final TL_phone.PhoneCall phoneCall) {
        FileLog.d("VoIPPreNotification.show()");
        if (phoneCall == null || intent == null) {
            dismiss(context, false);
            FileLog.d("VoIPPreNotification.show(): call or intent is null");
            return;
        }
        TL_phone.PhoneCall phoneCall2 = pendingCall;
        if (phoneCall2 == null || phoneCall2.id != phoneCall.id) {
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
            final long longExtra = intent.getLongExtra("user_id", 0L);
            final boolean z = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new Runnable() {
                @Override
                public final void run() {
                    VoIPPreNotificationService.$r8$lambda$lDZeK9o170qagGUvU23zy7BTSdM(intent, phoneCall, context, intExtra, longExtra, z);
                }
            });
        }
    }

    public static void $r8$lambda$lDZeK9o170qagGUvU23zy7BTSdM(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i, j, phoneCall.id, z));
        startRinging(context, i, j);
    }

    private static void acknowledge(final Context context, int i, TL_phone.PhoneCall phoneCall, final Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.w("Call " + phoneCall.id + " was discarded before the voip pre notification started, stopping");
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
        if (XiaomiUtilities.isMIUI() && !XiaomiUtilities.isCustomPermissionGranted(10020) && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state2 = currentState;
            if (state2 != null) {
                state2.destroy();
                return;
            }
            return;
        }
        TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        receivedcall.peer = tL_inputPhoneCall;
        tL_inputPhoneCall.id = phoneCall.id;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        ConnectionsManager.getInstance(i).sendRequest(receivedcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        VoIPPreNotificationService.$r8$lambda$FKGlbdAziKn85Rug4hrUyX7sDaA(tLObject, tL_error, context, runnable);
                    }
                });
            }
        }, 2);
    }

    public static void $r8$lambda$FKGlbdAziKn85Rug4hrUyX7sDaA(TLObject tLObject, TLRPC.TL_error tL_error, Context context, Runnable runnable) {
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

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        return intent != null && intent.getBooleanExtra("video", false);
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
            if (!PermissionRequest.hasPermission("android.permission.RECORD_AUDIO") || (isVideo() && !PermissionRequest.hasPermission("android.permission.CAMERA"))) {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, (Class<?>) VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e("Error starting permission activity", e);
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

    public static void decline(Context context, int i) {
        FileLog.d("VoIPPreNotification.decline(" + i + ")");
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            FileLog.d("VoIPPreNotification.decline(" + i + "): pending intent or call is not found");
            return;
        }
        final int intExtra = intent.getIntExtra("account", UserConfig.selectedAccount);
        TL_phone.discardCall discardcall = new TL_phone.discardCall();
        TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
        discardcall.peer = tL_inputPhoneCall;
        TL_phone.PhoneCall phoneCall = pendingCall;
        tL_inputPhoneCall.access_hash = phoneCall.access_hash;
        tL_inputPhoneCall.id = phoneCall.id;
        discardcall.duration = 0;
        discardcall.connection_id = 0L;
        if (i == 2) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
        } else if (i == 3) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
        } else if (i == 4) {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
        } else {
            discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
        }
        FileLog.e("discardCall " + discardcall.reason);
        ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPPreNotificationService.m1170$r8$lambda$xd9f9h0l8PWlBVsXRSKfIBo_k(intExtra, tLObject, tL_error);
            }
        }, 2);
        dismiss(context, false);
    }

    public static void m1170$r8$lambda$xd9f9h0l8PWlBVsXRSKfIBo_k(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.e("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.TL_updates) tLObject, false);
        }
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void dismiss(Context context, boolean z) {
        FileLog.d("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (z) {
            return;
        }
        for (int i = 0; i < 4; i++) {
            MessagesController.getInstance(i).ignoreSetOnline = false;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPPreNotificationService.$r8$lambda$_XVfSiPmqqB3fzeto3OEFrjZsNA();
            }
        });
    }

    public static void $r8$lambda$_XVfSiPmqqB3fzeto3OEFrjZsNA() {
        LaunchActivity launchActivity = LaunchActivity.instance;
        if (launchActivity != null && launchActivity.voipLaunchedInBackground && VoIPService.getSharedInstance() == null) {
            launchActivity.voipLaunchedInBackground = false;
            VoIPFragment voIPFragment = VoIPFragment.getInstance();
            if (voIPFragment != null) {
                voIPFragment.finish();
            }
            launchActivity.moveTaskToBack(true);
        }
    }
}
