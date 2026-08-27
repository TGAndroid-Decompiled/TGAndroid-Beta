package org.telegram.messenger.voip;

import android.app.Activity;
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
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import java.util.ArrayList;
import java.util.HashSet;
import nh.j2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.ib;
import org.telegram.messenger.tb;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.e2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.lh1;

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

        public State(int i10, long j10, long j11, int i11, boolean z10, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i10;
            this.dialogId = j10;
            this.call_id = j11;
            this.msg_id = i11;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i11;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z10;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
        }

        @Override
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(ApplicationLoader.applicationContext, this.currentAccount, this.msg_id);
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
            return this.groupCall;
        }

        @Override
        public ArrayList<TLRPC.GroupCallParticipant> getGroupParticipants() {
            return this.participants;
        }

        @Override
        public TL_phone.PhoneCall getPrivateCall() {
            return null;
        }

        @Override
        public TLRPC.User getUser() {
            return MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(this.dialogId));
        }

        @Override
        public boolean isCallingVideo() {
            return this.video;
        }

        @Override
        public boolean isConference() {
            return true;
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

    public static void answer(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i11) {
            return;
        }
        TLRPC.GroupCall groupCall = state.groupCall;
        boolean zIsCallingVideo = currentState.isCallingVideo();
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
        tL_inputGroupCallInviteMessage.msg_id = i11;
        e2.h(LaunchActivity.C1, i10, tL_inputGroupCallInviteMessage, zIsCallingVideo, groupCall, null);
    }

    public static void decline(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i11;
        ConnectionsManager.getInstance(i10).sendRequest(declineconferencecallinvite, new j2(i10, 1));
        lh1 lh1Var = lh1.f40088j1;
        if (lh1Var != null) {
            lh1Var.n();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i10, long j10) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.call_id == j10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            lh1 lh1Var = lh1.f40088j1;
            if (lh1Var != null) {
                lh1Var.n();
            }
        }
    }

    public static void lambda$decline$3(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$request$0(TLObject tLObject, int i10, long j10, long j11, int i11, boolean z10, Context context, String str) {
        if (!(tLObject instanceof TL_phone.groupCall)) {
            if (ignoreCalls == null) {
                ignoreCalls = new HashSet<>();
            }
            ignoreCalls.add(Integer.valueOf(i11));
        } else {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            currentState = new State(i10, j10, j11, i11, z10, groupcall.call, groupcall.participants);
            showNotification(context, i10, j11, i11, j10, str);
        }
    }

    public static void lambda$request$1(int i10, long j10, long j11, int i11, boolean z10, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ib(tLObject, i10, j10, j11, i11, z10, context, str));
    }

    public static void open(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state == null || state.msg_id != i11) {
            return;
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        Activity activityFindActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
        if (activityFindActivity == null) {
            activityFindActivity = LaunchActivity.C1;
        }
        if (activityFindActivity != null) {
            lh1.w(activityFindActivity, i10);
        }
    }

    public static void request(Context context, int i10, long j10, String str, long j11, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT < 26 || currentCallId == j11) {
            return;
        }
        State state = currentState;
        if (state == null || state.call_id != j11) {
            if (VoIPService.getSharedInstance() != null) {
                if (currentState != null) {
                    hide(context);
                }
            } else {
                if (MessagesController.getInstance(i10).callRequestsDisabled) {
                    return;
                }
                HashSet<Integer> hashSet = ignoreCalls;
                if (hashSet == null || !hashSet.contains(Integer.valueOf(i11))) {
                    currentCallId = j11;
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                    getgroupcall.call = tL_inputGroupCallInviteMessage;
                    tL_inputGroupCallInviteMessage.msg_id = i11;
                    getgroupcall.limit = 3;
                    ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new tb(context, i10, j10, str, j11, i11, z10));
                }
            }
        }
    }

    private static void showNotification(Context context, int i10, long j10, int i11, long j11, String str) {
        boolean z10;
        Class cls;
        Intent intent;
        int i12;
        int i13;
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        Intent intentPutExtra = new Intent(context, (Class<?>) LaunchActivity.class).setAction("voip").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10);
        Notification.Builder contentIntent = new Notification.Builder(context).setContentTitle(LocaleController.getString(R.string.VoipGroupInCallBranding)).setSmallIcon(R.drawable.call).setContentIntent(PendingIntent.getActivity(context, 0, intentPutExtra, 301989888));
        SharedPreferences globalNotificationsSettings = MessagesController.getGlobalNotificationsSettings();
        int i14 = globalNotificationsSettings.getInt("calls_notification_channel", 0);
        NotificationChannel notificationChannel = notificationManager.getNotificationChannel("incoming_calls2" + i14);
        if (notificationChannel != null) {
            notificationManager.deleteNotificationChannel(notificationChannel.getId());
        }
        NotificationChannel notificationChannel2 = notificationManager.getNotificationChannel("incoming_calls3" + i14);
        if (notificationChannel2 != null) {
            notificationManager.deleteNotificationChannel(notificationChannel2.getId());
        }
        NotificationChannel notificationChannel3 = notificationManager.getNotificationChannel("incoming_calls4" + i14);
        if (notificationChannel3 == null) {
            z10 = true;
        } else if (notificationChannel3.getImportance() < 4 || notificationChannel3.getSound() != null) {
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d("User messed up the notification channel; deleting it and creating a proper one");
            }
            notificationManager.deleteNotificationChannel("incoming_calls4" + i14);
            i14++;
            globalNotificationsSettings.edit().putInt("calls_notification_channel", i14).commit();
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setContentType(4).setLegacyStreamType(2).setUsage(2).build();
            intent = intentPutExtra;
            cls = LaunchActivity.class;
            NotificationChannel notificationChannel4 = new NotificationChannel("incoming_calls4" + i14, LocaleController.getString(R.string.IncomingCallsSystemSetting), 4);
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
            }
        } else {
            cls = LaunchActivity.class;
            intent = intentPutExtra;
        }
        contentIntent.setChannelId("incoming_calls4" + i14);
        Intent intent2 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent2.setAction(context.getPackageName() + ".DECLINE_CALL");
        intent2.putExtra("call_id", j10);
        intent2.putExtra("group_call_invite_msg_id", i11);
        intent2.putExtra("currentAccount", i10);
        String string = LocaleController.getString(R.string.VoipDeclineCall);
        int i15 = Build.VERSION.SDK_INT;
        if (i15 < 24 || i15 >= 31) {
            i12 = 0;
        } else {
            SpannableString spannableString = new SpannableString(string);
            i12 = 0;
            spannableString.setSpan(new ForegroundColorSpan(-769226), 0, spannableString.length(), 0);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(context, i12, intent2, 301989888);
        Intent intent3 = new Intent(context, (Class<?>) VoIPActionsReceiver.class);
        intent3.setAction(context.getPackageName() + ".ANSWER_CALL");
        intent3.putExtra("call_id", j10);
        intent3.putExtra("group_call_invite_msg_id", i11);
        intent3.putExtra("currentAccount", i10);
        String string2 = LocaleController.getString(R.string.VoipAnswerCall);
        if (i15 < 24 || i15 >= 31) {
            i13 = 0;
        } else {
            SpannableString spannableString2 = new SpannableString(string2);
            i13 = 0;
            spannableString2.setSpan(new ForegroundColorSpan(-16733696), 0, spannableString2.length(), 0);
        }
        PendingIntent activity = PendingIntent.getActivity(context, i13, new Intent(context, (Class<?>) cls).setAction("voip_answer").putExtra("group_call_invite_msg_id", i11).putExtra("currentAccount", i10), 301989888);
        contentIntent.setPriority(2);
        contentIntent.setShowWhen(i13);
        contentIntent.setColor(-13851168);
        contentIntent.setVibrate(new long[i13]);
        contentIntent.setCategory("call");
        contentIntent.setFullScreenIntent(PendingIntent.getActivity(context, i13, intent, 33554432), true);
        Intent intent4 = new Intent(ApplicationLoader.applicationContext, (Class<?>) VoIPActionsReceiver.class);
        intent4.setAction(context.getPackageName() + ".HIDE_CALL");
        intent4.putExtra("group_call_invite_msg_id", i11);
        intent4.putExtra("currentAccount", i10);
        contentIntent.setDeleteIntent(PendingIntent.getBroadcast(ApplicationLoader.applicationContext, 0, intent4, 167772160));
        TLObject userOrChat = MessagesController.getInstance(i10).getUserOrChat(j11);
        Bitmap roundAvatarBitmap = VoIPService.getRoundAvatarBitmap(context, i10, userOrChat);
        String name = !TextUtils.isEmpty(str) ? str : ContactsController.formatName(userOrChat);
        if (TextUtils.isEmpty(name)) {
            name = "___";
        }
        if (i15 >= 31) {
            contentIntent.setStyle(Notification.CallStyle.forIncomingCall(new Person.Builder().setName(name).setIcon(Icon.createWithAdaptiveBitmap(roundAvatarBitmap)).build(), broadcast, activity));
        }
        notificationManager.notify(203, contentIntent.build());
        VoIPPreNotificationService.startRinging(context, i10, j11);
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        h3.z zVar = new h3.z(context, i10, i11, 2);
        missRunnable = zVar;
        AndroidUtilities.runOnUIThread(zVar, MessagesController.getInstance(i10).callRingTimeout);
    }

    public static void hide(Context context, int i10, int i11) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.msg_id == i11) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            lh1 lh1Var = lh1.f40088j1;
            if (lh1Var != null) {
                lh1Var.n();
            }
        }
    }
}
