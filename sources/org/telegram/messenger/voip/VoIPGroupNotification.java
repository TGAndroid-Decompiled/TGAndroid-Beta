package org.telegram.messenger.voip;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
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
        public void acceptIncomingCall() {
            VoIPGroupNotification.answer(org.telegram.messenger.a.b, this.currentAccount, this.msg_id);
        }

        @Override
        public void declineIncomingCall() {
            VoIPGroupNotification.decline(org.telegram.messenger.a.b, this.currentAccount, this.msg_id);
        }

        public void destroy() {
            if (!this.destroyed) {
                this.destroyed = true;
                hgc hgcVar = hgc.m1;
                if (hgcVar != null) {
                    hgcVar.onStateChanged(getCallState());
                }
            }
        }

        @Override
        public final long getCallDuration() {
            return 0L;
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
            return na7.q1(this.currentAccount).V1(Long.valueOf(this.dialogId));
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

    public static void a(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        lambda$decline$3(i, tLObject, tL_error);
    }

    public static void answer(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            gl.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i2) {
            TLRPC.GroupCall groupCall = state.groupCall;
            boolean isCallingVideo = currentState.isCallingVideo();
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
            tL_inputGroupCallInviteMessage.msg_id = i2;
            rgc.g(LaunchActivity.H1, i, tL_inputGroupCallInviteMessage, isCallingVideo, groupCall, null);
        }
    }

    public static void d(Context context, int i, int i2) {
        decline(context, i, i2);
    }

    public static void decline(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            gl.r(runnable);
        }
        currentState = null;
        currentCallId = 0L;
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        VoIPPreNotificationService.stopRinging();
        TL_phone.declineConferenceCallInvite declineconferencecallinvite = new TL_phone.declineConferenceCallInvite();
        declineconferencecallinvite.msg_id = i2;
        ConnectionsManager.getInstance(i).sendRequest(declineconferencecallinvite, new vv0(i, (byte) 4));
        hgc hgcVar = hgc.m1;
        if (hgcVar != null) {
            hgcVar.d();
        }
    }

    public static void hide(Context context, int i, int i2) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.msg_id == i2) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                gl.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            hgc hgcVar = hgc.m1;
            if (hgcVar != null) {
                hgcVar.d();
            }
        }
    }

    public static void hideByCallId(Context context, int i, long j) {
        State state = currentState;
        if (state != null && state.currentAccount == i && currentState.call_id == j) {
            Runnable runnable = missRunnable;
            if (runnable != null) {
                gl.r(runnable);
            }
            currentState = null;
            currentCallId = 0L;
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            hgc hgcVar = hgc.m1;
            if (hgcVar != null) {
                hgcVar.d();
            }
        }
    }

    public static void lambda$decline$3(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            na7.q1(i).R3((TLRPC.Updates) tLObject, false);
        }
    }

    public static void lambda$request$0(TLObject tLObject, int i, long j, long j2, int i2, boolean z, Context context, String str) {
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            na7.q1(i).b4(groupcall.users, false);
            na7.q1(i).V3(groupcall.chats, false);
            currentState = new State(i, j, j2, i2, z, groupcall.call, groupcall.participants);
            showNotification(context, i, j2, i2, j, str);
            return;
        }
        HashSet<Integer> hashSet = ignoreCalls;
        if (hashSet == null) {
            hashSet = new HashSet<>();
            ignoreCalls = hashSet;
        }
        hashSet.add(Integer.valueOf(i2));
    }

    public static void lambda$request$1(int i, long j, long j2, int i2, boolean z, Context context, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new w87(tLObject, i, j, j2, i2, z, context, str));
    }

    public static void open(Context context, int i, int i2) {
        Runnable runnable = missRunnable;
        if (runnable != null) {
            gl.r(runnable);
        }
        VoIPPreNotificationService.stopRinging();
        State state = currentState;
        if (state != null && state.msg_id == i2) {
            ((NotificationManager) context.getSystemService("notification")).cancel(203);
            VoIPPreNotificationService.stopRinging();
            Activity W = gl.W(org.telegram.messenger.a.b);
            if (W == null) {
                W = LaunchActivity.H1;
            }
            if (W != null) {
                hgc.n(W, i);
            }
        }
    }

    public static void request(Context context, int i, long j, String str, long j2, int i2, boolean z) {
        if (Build.VERSION.SDK_INT >= 26 && currentCallId != j2) {
            State state = currentState;
            if (state == null || state.call_id != j2) {
                if (VoIPService.getSharedInstance() != null) {
                    if (currentState != null) {
                        hide(context);
                    }
                } else if (!na7.q1(i).k4.G2.f) {
                    HashSet<Integer> hashSet = ignoreCalls;
                    if (hashSet == null || !hashSet.contains(Integer.valueOf(i2))) {
                        currentCallId = j2;
                        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                        TLRPC.TL_inputGroupCallInviteMessage tL_inputGroupCallInviteMessage = new TLRPC.TL_inputGroupCallInviteMessage();
                        getgroupcall.call = tL_inputGroupCallInviteMessage;
                        tL_inputGroupCallInviteMessage.msg_id = i2;
                        getgroupcall.limit = 3;
                        ConnectionsManager.getInstance(i).sendRequest(getgroupcall, new s87(context, i, j, str, j2, i2, z));
                    }
                }
            }
        }
    }

    private static void showNotification(android.content.Context r21, int r22, long r23, int r25, long r26, java.lang.String r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPGroupNotification.showNotification(android.content.Context, int, long, int, long, java.lang.String):void");
    }

    public static void hide(Context context) {
        State state = currentState;
        if (state == null) {
            return;
        }
        hide(context, state.currentAccount, currentState.msg_id);
    }
}
