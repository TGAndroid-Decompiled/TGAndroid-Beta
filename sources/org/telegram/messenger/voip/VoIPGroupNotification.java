package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import hi.g2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.on;
import org.telegram.messenger.qp;
import org.telegram.messenger.xn;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.y1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ec1;
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

        public State(int i7, long j3, long j10, int i10, boolean z9, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i7;
            this.dialogId = j3;
            this.call_id = j10;
            this.msg_id = i10;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i10;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z9;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.t0.f25563b, this.currentAccount, this.msg_id);
        }

        @Override
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.t0.f25563b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (!this.destroyed) {
                this.destroyed = true;
                ec1 ec1Var = ec1.l1;
                if (ec1Var != null) {
                    ec1Var.onStateChanged(getCallState());
                }
            }
        }

        @Override
        public final long getCallDuration() {
            return t0.a(this);
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
            return qp.s1(this.currentAccount).a2(Long.valueOf(this.dialogId));
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

    public static void answer(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i10) {
            TLRPC.GroupCall groupCall = state.groupCall;
            boolean isCallingVideo = currentState.isCallingVideo();
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = i10;
            y1.g(LaunchActivity.G1, i7, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
        }
    }

    public static void decline(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i10;
        ConnectionsManager.getInstance(i7).sendRequest(declineconferencecallinvite, new g2(i7, 1));
        ec1 ec1Var = ec1.l1;
        if (ec1Var != null) {
            ec1Var.e();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i7, long j3) {
        State state = currentState;
        if (state != null && state.currentAccount == i7 && currentState.call_id == j3) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            ec1 ec1Var = ec1.l1;
            if (ec1Var != null) {
                ec1Var.e();
            }
        }
    }

    public static void lambda$decline$3(int i7, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            qp.s1(i7).O3((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$request$0(TLObject tLObject, int i7, long j3, long j10, int i10, boolean z9, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            qp.s1(i7).Y3(groupcall.users, false);
            qp.s1(i7).S3(groupcall.chats, false);
            currentState = new State(i7, j3, j10, i10, z9, groupcall.call, groupcall.participants);
            showNotification(context, i7, j10, i10, j3, str);
            return;
        }
        if (ignoreCalls == null) {
            ignoreCalls = new HashSet<>();
        }
        ignoreCalls.add(Integer.valueOf(i10));
    }

    public static void lambda$request$1(int i7, long j3, long j10, int i10, boolean z9, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new xn(tLObject, i7, j3, j10, i10, z9, context, str));
    }

    public static void open(Context context, int i7, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i10) {
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25563b);
            if (W == null) {
                W = LaunchActivity.G1;
            }
            if (W != null) {
                ec1.n(W, i7);
            }
        }
    }

    public static void request(Context context, int i7, long j3, String str, long j10, int i10, boolean z9) {
        if (Build.VERSION.SDK_INT >= 26 && currentCallId != j10) {
            State state = currentState;
            if (state == null || state.call_id != j10) {
                if (VoIPService.getSharedInstance() != null) {
                    if (currentState != null) {
                        hide(context);
                    }
                } else if (!qp.s1(i7).Q6) {
                    HashSet<Integer> hashSet = ignoreCalls;
                    if (hashSet == null || !hashSet.contains(Integer.valueOf(i10))) {
                        currentCallId = j10;
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                        getgroupcall.call = tL_inputGroupCallInviteMessage;
                        tL_inputGroupCallInviteMessage.msg_id = i10;
                        getgroupcall.limit = 3;
                        ConnectionsManager.getInstance(i7).sendRequest(getgroupcall, new on(context, i7, j3, str, j10, i10, z9));
                    }
                }
            }
        }
    }

    private static void showNotification(android.content.Context r21, int r22, long r23, int r25, long r26, java.lang.String r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPGroupNotification.showNotification(android.content.Context, int, long, int, long, java.lang.String):void");
    }

    public static void hide(Context context, int i7, int i10) {
        State state = currentState;
        if (state != null && state.currentAccount == i7 && currentState.msg_id == i10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            ec1 ec1Var = ec1.l1;
            if (ec1Var != null) {
                ec1Var.e();
            }
        }
    }
}
