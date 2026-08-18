package org.telegram.messenger.voip;

import android.app.Activity;
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
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.android.gms.cast.framework.media.internal.zzo$$ExternalSyntheticApiModelOutline2;
import com.google.android.search.verification.client.SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPFragment;

public class VoIPGroupNotification {
    public static long currentCallId;
    public static State currentState;
    private static HashSet<Integer> ignoreCalls;
    private static Runnable missRunnable;

    public static final class State implements VoIPServiceState {
        public final long call_id;
        private final int currentAccount;
        private boolean destroyed;
        public final long dialogId;
        private final TLRPC.GroupCall groupCall;
        private final TLRPC.InputGroupCall inputGroupCall;
        public final int msg_id;
        private final ArrayList<TLRPC.GroupCallParticipant> participants;
        private final boolean video;

        @Override
        public long getCallDuration() {
            return VoIPServiceState.CC.$default$getCallDuration(this);
        }

        @Override
        public TL_phone.PhoneCall getPrivateCall() {
            return null;
        }

        @Override
        public boolean isConference() {
            return true;
        }

        @Override
        public boolean isOutgoing() {
            return false;
        }

        public State(int i, long j, long j2, int i2, boolean z, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i;
            this.dialogId = j;
            this.call_id = j2;
            this.msg_id = i2;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i2;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z;
        }

        @Override
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        }

        @Override
        public int getCallState() {
            return this.destroyed ? 11 : 15;
        }

        @Override
        public boolean isCallingVideo() {
            return this.video;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
        }

        @Override
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
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

        @Override
        public TLRPC.GroupCall getGroupCall() {
            return this.groupCall;
        }

        @Override
        public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
            return this.participants;
        }
    }

    public static void request(final Context context, final int i, final long j, final String str, final long j2, final int i2, final boolean z) {
        if (Build.VERSION.SDK_INT < 26 || currentCallId == j2) {
            return;
        }
        State state = currentState;
        if (state == null || state.call_id != j2) {
            if (VoIPService.getSharedInstance() != null) {
                if (currentState != null) {
                    hide(context);
                }
            } else {
                if (MessagesController.getInstance(i).callRequestsDisabled) {
                    return;
                }
                HashSet<Integer> hashSet = ignoreCalls;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i2))) {
                    currentCallId = j2;
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    tL_inputGroupCallInviteMessage.msg_id = i2;
                    getgroupcall.limit = 3;
                    ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            VoIPGroupNotification.lambda$request$1(i, j, j2, i2, z, context, str, tLObject, tL_error);
                        }
                    });
                }
            }
        }
    }

    public static void lambda$request$1(final int i, final long j, final long j2, final int i2, final boolean z, final Context context, final String str, final TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                VoIPGroupNotification.lambda$request$0(tLObject, i, j, j2, i2, z, context, str);
            }
        });
    }

    public static void lambda$request$0(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i).putUsers(groupcall.users, false);
            MessagesController.getInstance(i).putChats(groupcall.chats, false);
            currentState = new State(i, j, j2, i2, z, groupcall.call, groupcall.participants);
            showNotification(context, i, j2, i2, j, str);
            return;
        }
        if (ignoreCalls == null) {
            ignoreCalls = new HashSet<>();
        }
        ignoreCalls.add(Integer.valueOf(i2));
    }

    private static void showNotification(final Context context, final int i, long j, final int i2, long j2, String str) {
        Class cls;
        boolean z;
        int i3;
        int i4;
        PendingIntent broadcast;
        int i5;
        PendingIntent activity;
        TLObject userOrChat;
        Bitmap roundAvatarBitmap;
        String name;
        Runnable runnable;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent intentPutExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(R.string.VoipGroupInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, intentPutExtra, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i6 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i6);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i6);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i6);
        if (notificationChannel3 != null) {
            cls = LaunchActivity.class;
            if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
                }
                notificationManager.deleteNotificationChannel("incoming_calls4" + i6);
                i6++;
                globalNotificationsSettings.edit().putInt("calls_notification_channel", i6).commit();
            } else {
                z = false;
            }
            if (z) {
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
                SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
                NotificationChannel notificationChannelM = zzo$$ExternalSyntheticApiModelOutline2.m("incoming_calls4" + i6, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
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
                }
            }
            contentIntent.setChannelId("incoming_calls4" + i6);
            Intent intent = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
            intent.setAction(context.getPackageName() + ".DECLINE_CALL");
            intent.putExtra("call_id", j);
            intent.putExtra("group_call_invite_msg_id", i2);
            intent.putExtra("currentAccount", i);
            String string = LocaleController.getString(R.string.VoipDeclineCall);
            i3 = Build.VERSION.SDK_INT;
            if (i3 >= 24 || i3 >= 31) {
                i4 = 0;
            } else {
                SpannableString spannableString = new SpannableString(string);
                i4 = 0;
                spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
            }
            broadcast = PendingIntent.getBroadcast(context, i4, intent, 301989888);
            Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
            intent2.setAction(context.getPackageName() + ".ANSWER_CALL");
            intent2.putExtra("call_id", j);
            intent2.putExtra("group_call_invite_msg_id", i2);
            intent2.putExtra("currentAccount", i);
            String string2 = LocaleController.getString(R.string.VoipAnswerCall);
            if (i3 >= 24 || i3 >= 31) {
                i5 = 0;
            } else {
                SpannableString spannableString2 = new SpannableString(string2);
                i5 = 0;
                spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
            }
            activity = PendingIntent.getActivity(context, i5, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i), 301989888);
            contentIntent.setPriority(2);
            contentIntent.setShowWhen(i5);
            contentIntent.setColor(-13851168);
            contentIntent.setVibrate(new long[i5]);
            contentIntent.setCategory("call");
            contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i5, intentPutExtra, 33554432), true);
            Intent intent3 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
            intent3.setAction(context.getPackageName() + ".HIDE_CALL");
            intent3.putExtra("group_call_invite_msg_id", i2);
            intent3.putExtra("currentAccount", i);
            contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent3, 167772160));
            userOrChat = MessagesController.getInstance(i).getUserOrChat(j2);
            roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, userOrChat);
            if (TextUtils.isEmpty(str)) {
                name = ContactsController.formatName(userOrChat);
            } else {
                name = str;
            }
            if (TextUtils.isEmpty(name)) {
                name = "___";
            }
            if (i3 >= 31) {
                contentIntent.setStyle(Notification.CallStyle.forIncomingCall(VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
            }
            notificationManager.notify(203, contentIntent.build());
            VoIPPreNotificationService.startRinging(context, i, j2);
            runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    VoIPGroupNotification.decline(context, i, i2);
                }
            };
            missRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, MessagesController.getInstance(i).callRingTimeout);
        }
        cls = LaunchActivity.class;
        z = true;
        if (z) {
            AudioAttributes audioAttributesBuild2 = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
            SearchActionVerificationClientService$$ExternalSyntheticApiModelOutline2.m();
            NotificationChannel notificationChannelM2 = zzo$$ExternalSyntheticApiModelOutline2.m("incoming_calls4" + i6, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
            notificationChannelM2.setSound(null, audioAttributesBuild2);
            notificationChannelM2.setDescription(LocaleController.getString(R.string.IncomingCallsSystemSettingDescription));
            notificationChannelM2.enableVibration(false);
            notificationChannelM2.enableLights(false);
            notificationChannelM2.setBypassDnd(true);
            notificationManager.createNotificationChannel(notificationChannelM2);
        }
        contentIntent.setChannelId("incoming_calls4" + i6);
        Intent intent4 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent4.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent4.putExtra("call_id", j);
        intent4.putExtra("group_call_invite_msg_id", i2);
        intent4.putExtra("currentAccount", i);
        String string3 = LocaleController.getString(R.string.VoipDeclineCall);
        i3 = Build.VERSION.SDK_INT;
        if (i3 >= 24) {
            i4 = 0;
        } else {
            i4 = 0;
        }
        broadcast = PendingIntent.getBroadcast(context, i4, intent4, 301989888);
        Intent intent5 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent5.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent5.putExtra("call_id", j);
        intent5.putExtra("group_call_invite_msg_id", i2);
        intent5.putExtra("currentAccount", i);
        String string4 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i3 >= 24) {
            i5 = 0;
        } else {
            i5 = 0;
        }
        activity = PendingIntent.getActivity(context, i5, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("group_call_invite_msg_id", i2).putExtra("currentAccount", i), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i5);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i5]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i5, intentPutExtra, 33554432), true);
        Intent intent6 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent6.setAction(context.getPackageName() + ".HIDE_CALL");
        intent6.putExtra("group_call_invite_msg_id", i2);
        intent6.putExtra("currentAccount", i);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent6, 167772160));
        userOrChat = MessagesController.getInstance(i).getUserOrChat(j2);
        roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i, userOrChat);
        if (TextUtils.isEmpty(str)) {
            name = str;
        } else {
            name = ContactsController.formatName(userOrChat);
        }
        if (TextUtils.isEmpty(name)) {
            name = "___";
        }
        if (i3 >= 31) {
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(VoIPGroupNotification$$ExternalSyntheticApiModelOutline7.m().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
        }
        notificationManager.notify(203, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i, j2);
        runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        Runnable runnable3 = new Runnable() {
            @Override
            public final void run() {
                VoIPGroupNotification.decline(context, i, i2);
            }
        };
        missRunnable = runnable3;
        AndroidUtilities.runOnUIThread(runnable3, MessagesController.getInstance(i).callRingTimeout);
    }

    public static void open(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i2) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        if (activityFindActivity == null) {
            activityFindActivity = LaunchActivity.instance;
        }
        if (activityFindActivity != null) {
            VoIPFragment.show(activityFindActivity, i);
        }
    }

    public static void answer(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i2) {
            return;
        }
        TLRPC.GroupCall groupCall = state.groupCall;
        boolean zIsCallingVideo = currentState.isCallingVideo();
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i2;
        VoIPHelper.joinConference(LaunchActivity.instance, i, tL_inputGroupCallInviteMessage, zIsCallingVideo, groupCall);
    }

    public static void decline(Context context, final int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i2;
        ConnectionsManager.getInstance(i).sendRequest(declineconferencecallinvite, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                VoIPGroupNotification.lambda$decline$3(i, tLObject, tL_error);
            }
        });
        if (VoIPFragment.getInstance() != null) {
            VoIPFragment.getInstance().finish();
        }
    }

    public static void lambda$decline$3(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hide(Context context, int i, int i2) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.msg_id == i2) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().finish();
            }
        }
    }

    public static void hideByCallId(Context context, int i, long j) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.call_id == j) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            if (VoIPFragment.getInstance() != null) {
                VoIPFragment.getInstance().finish();
            }
        }
    }
}
