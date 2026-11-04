package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import ii.g2;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.en;
import org.telegram.messenger.hp;
import org.telegram.messenger.nn;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.n1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.zb1;
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

        public State(int i3, long j10, long j11, int i10, boolean z10, TLRPC.GroupCall groupCall, ArrayList<TLRPC.GroupCallParticipant> arrayList) {
            this.currentAccount = i3;
            this.dialogId = j10;
            this.call_id = j11;
            this.msg_id = i10;
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            this.inputGroupCall = tL_inputGroupCallInviteMessage;
            tL_inputGroupCallInviteMessage.msg_id = i10;
            this.groupCall = groupCall;
            this.participants = arrayList;
            this.video = z10;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.t0.f25457b, this.currentAccount, this.msg_id);
        }

        @Override
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.t0.f25457b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (!this.destroyed) {
                this.destroyed = true;
                zb1 zb1Var = zb1.f52603o1;
                if (zb1Var != null) {
                    zb1Var.onStateChanged(getCallState());
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
            return hp.s1(this.currentAccount).a2(Long.valueOf(this.dialogId));
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

    public static void a(int i3, TLObject tLObject, TLRPC.TL_error tL_error) {
        lambda$decline$3(i3, tLObject, tL_error);
    }

    public static void answer(Context context, int i3, int i10) {
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
            n1.g(LaunchActivity.K1, i3, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
        }
    }

    public static void d(Context context, int i3, int i10) {
        decline(context, i3, i10);
    }

    public static void decline(Context context, int i3, int i10) {
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
        ConnectionsManager.getInstance(i3).sendRequest(declineconferencecallinvite, new g2(i3, 1));
        zb1 zb1Var = zb1.f52603o1;
        if (zb1Var != null) {
            zb1Var.f();
        }
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }

    public static void hideByCallId(Context context, int i3, long j10) {
        State state = currentState;
        if (state != null && state.currentAccount == i3 && currentState.call_id == j10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            zb1 zb1Var = zb1.f52603o1;
            if (zb1Var != null) {
                zb1Var.f();
            }
        }
    }

    public static void lambda$decline$3(int i3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            hp.s1(i3).O3((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$request$0(TLObject tLObject, int i3, long j10, long j11, int i10, boolean z10, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            hp.s1(i3).Y3(groupcall.users, false);
            hp.s1(i3).S3(groupcall.chats, false);
            currentState = new State(i3, j10, j11, i10, z10, groupcall.call, groupcall.participants);
            showNotification(context, i3, j11, i10, j10, str);
            return;
        }
        if (ignoreCalls == null) {
            ignoreCalls = new HashSet<>();
        }
        ignoreCalls.add(Integer.valueOf(i10));
    }

    public static void lambda$request$1(int i3, long j10, long j11, int i10, boolean z10, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new nn(tLObject, i3, j10, j11, i10, z10, context, str));
    }

    public static void open(Context context, int i3, int i10) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            org.telegram.messenger.g0.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i10) {
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            Activity W = org.telegram.messenger.g0.W(org.telegram.messenger.t0.f25457b);
            if (W == null) {
                W = LaunchActivity.K1;
            }
            if (W != null) {
                zb1.v(W, i3);
            }
        }
    }

    public static void request(Context context, int i3, long j10, String str, long j11, int i10, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26 && currentCallId != j11) {
            State state = currentState;
            if (state == null || state.call_id != j11) {
                if (VoIPService.getSharedInstance() != null) {
                    if (currentState != null) {
                        hide(context);
                    }
                } else if (!hp.s1(i3).Q6) {
                    HashSet<Integer> hashSet = ignoreCalls;
                    if (hashSet == null || !hashSet.contains(Integer.valueOf(i10))) {
                        currentCallId = j11;
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                        getgroupcall.call = tL_inputGroupCallInviteMessage;
                        tL_inputGroupCallInviteMessage.msg_id = i10;
                        getgroupcall.limit = 3;
                        ConnectionsManager.getInstance(i3).sendRequest(getgroupcall, new en(context, i3, j10, str, j11, i10, z10));
                    }
                }
            }
        }
    }

    private static void showNotification(android.content.Context r21, int r22, long r23, int r25, long r26, java.lang.String r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPGroupNotification.showNotification(android.content.Context, int, long, int, long, java.lang.String):void");
    }

    public static void hide(Context context, int i3, int i10) {
        State state = currentState;
        if (state != null && state.currentAccount == i3 && currentState.msg_id == i10) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                org.telegram.messenger.g0.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            zb1 zb1Var = zb1.f52603o1;
            if (zb1Var != null) {
                zb1Var.f();
            }
        }
    }
}
