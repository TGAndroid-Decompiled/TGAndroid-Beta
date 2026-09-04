package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import fi.q2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.ib;
import org.telegram.messenger.ub;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.d2;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ui1;
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

        public State(int i10, long j3, long j10, int i11, boolean z10, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i10;
            this.dialogId = j3;
            this.call_id = j10;
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
            if (!this.destroyed) {
                this.destroyed = true;
                ui1 ui1Var = ui1.f41106n1;
                if (ui1Var != null) {
                    ui1Var.onStateChanged(getCallState());
                }
            }
        }

        @Override
        public final long getCallDuration() {
            return v0.a(this);
        }

        @Override
        public int getCallState() {
            if (this.destroyed) {
                return 11;
            }
            return 15;
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

    public static void a(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        lambda$decline$3(i10, tLObject, tL_error);
    }

    public static void answer(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i11) {
            TLRPC.GroupCall groupCall = state.groupCall;
            boolean isCallingVideo = currentState.isCallingVideo();
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = i11;
            d2.g(LaunchActivity.G1, i10, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
        }
    }

    public static void d(Context context, int i10, int i11) {
        decline(context, i10, i11);
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
        ConnectionsManager.getInstance(i10).sendRequest(declineconferencecallinvite, new q2(i10, 1));
        ui1 ui1Var = ui1.f41106n1;
        if (ui1Var != null) {
            ui1Var.n();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i10, long j3) {
        State state = currentState;
        if (state != null && state.currentAccount == i10 && currentState.call_id == j3) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            ui1 ui1Var = ui1.f41106n1;
            if (ui1Var != null) {
                ui1Var.n();
            }
        }
    }

    public static void lambda$decline$3(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$request$0(TLObject tLObject, int i10, long j3, long j10, int i11, boolean z10, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(i10).putUsers(groupcall.users, false);
            MessagesController.getInstance(i10).putChats(groupcall.chats, false);
            currentState = new State(i10, j3, j10, i11, z10, groupcall.call, groupcall.participants);
            showNotification(context, i10, j10, i11, j3, str);
            return;
        }
        if (ignoreCalls == null) {
            ignoreCalls = new HashSet<>();
        }
        ignoreCalls.add(Integer.valueOf(i11));
    }

    public static void lambda$request$1(int i10, long j3, long j10, int i11, boolean z10, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new ib(tLObject, i10, j3, j10, i11, z10, context, str));
    }

    public static void open(Context context, int i10, int i11) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i11) {
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            Activity findActivity = AndroidUtilities.findActivity(ApplicationLoader.applicationContext);
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity != null) {
                ui1.w(findActivity, i10);
            }
        }
    }

    public static void request(Context context, int i10, long j3, String str, long j10, int i11, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26 && currentCallId != j10) {
            State state = currentState;
            if (state == null || state.call_id != j10) {
                if (VoIPService.getSharedInstance() != null) {
                    if (currentState != null) {
                        hide(context);
                    }
                } else if (!MessagesController.getInstance(i10).callRequestsDisabled) {
                    HashSet<Integer> hashSet = ignoreCalls;
                    if (hashSet == null || !hashSet.contains(Integer.valueOf(i11))) {
                        currentCallId = j10;
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                        getgroupcall.call = tL_inputGroupCallInviteMessage;
                        tL_inputGroupCallInviteMessage.msg_id = i11;
                        getgroupcall.limit = 3;
                        ConnectionsManager.getInstance(i10).sendRequest(getgroupcall, new ub(context, i10, j3, str, j10, i11, z10));
                    }
                }
            }
        }
    }

    private static void showNotification(android.content.Context r20, int r21, long r22, int r24, long r25, java.lang.String r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPGroupNotification.showNotification(android.content.Context, int, long, int, long, java.lang.String):void");
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
            ui1 ui1Var = ui1.f41106n1;
            if (ui1Var != null) {
                ui1Var.n();
            }
        }
    }
}
