package org.telegram.messenger.voip;

import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Vibrator;
import java.util.ArrayList;
import org.telegram.messenger.d20;
import org.telegram.messenger.d6;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.VoIPPermissionActivity;
import org.telegram.ui.be1;
import w7.c6;
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
            VoIPPreNotificationService.answer(org.telegram.messenger.w0.f19025b);
        }

        @Override
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(org.telegram.messenger.w0.f19025b, 1);
        }

        public void destroy() {
            if (!this.destroyed) {
                this.destroyed = true;
                be1 be1Var = be1.f36195n1;
                if (be1Var != null) {
                    be1Var.onStateChanged(getCallState());
                }
            }
        }

        @Override
        public final long getCallDuration() {
            return z0.a(this);
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
            return vp.r1(this.currentAccount).Z1(Long.valueOf(this.userId));
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
            if (v2.f18448a) {
                f8.l("Call " + phoneCall.f20020id + " was discarded before the voip pre notification started, stopping");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state = currentState;
            if (state != null) {
                state.destroy();
            }
        } else if (d6.i() && !d6.f() && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (v2.f18448a) {
                f8.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state2 = currentState;
            if (state2 != null) {
                state2.destroy();
            }
        } else {
            TL_phone.receivedCall receivedcall = new TL_phone.receivedCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            receivedcall.peer = tL_inputPhoneCall;
            tL_inputPhoneCall.f19858id = phoneCall.f20020id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            ConnectionsManager.getInstance(i10).sendRequest(receivedcall, new ag.k0(6, context, runnable), 2);
        }
    }

    public static void answer(Context context) {
        f8.b("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            f8.b("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", d20.f15147s0);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (c6.d("android.permission.RECORD_AUDIO") && (!isVideo() || c6.d("android.permission.CAMERA"))) {
                if (Build.VERSION.SDK_INT >= 26) {
                    context.startForegroundService(pendingVoIP);
                } else {
                    context.startService(pendingVoIP);
                }
                pendingVoIP = null;
            } else {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (v2.f18448a) {
                        f8.e("Error starting permission activity", e);
                        return;
                    }
                    return;
                }
            }
        }
        dismiss(context, true);
    }

    public static void decline(Context context, int i10) {
        f8.b("VoIPPreNotification.decline(" + i10 + ")");
        Intent intent = pendingVoIP;
        if (intent != null && pendingCall != null) {
            int intExtra = intent.getIntExtra("account", d20.f15147s0);
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = pendingCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.f19858id = phoneCall.f20020id;
            discardcall.duration = 0;
            discardcall.connection_id = 0L;
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonHangup();
                    } else {
                        discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonBusy();
                    }
                } else {
                    discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonMissed();
                }
            } else {
                discardcall.reason = new TLRPC.TL_phoneCallDiscardReasonDisconnect();
            }
            f8.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new q(intExtra, 1), 2);
            dismiss(context, false);
            return;
        }
        f8.b("VoIPPreNotification.decline(" + i10 + "): pending intent or call is not found");
    }

    public static void dismiss(Context context, boolean z10) {
        f8.b("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (!z10) {
            for (int i10 = 0; i10 < 4; i10++) {
                vp.r1(i10).f18804h7 = false;
            }
            org.telegram.messenger.i0.g3(new l(2));
        }
    }

    public static State getState() {
        return currentState;
    }

    public static boolean isVideo() {
        Intent intent = pendingVoIP;
        if (intent == null || !intent.getBooleanExtra("video", false)) {
            return false;
        }
        return true;
    }

    public static void lambda$acknowledge$2(TLObject tLObject, TLRPC.TL_error tL_error, Context context, Runnable runnable) {
        if (v2.f18448a) {
            f8.l("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error != null) {
            if (v2.f18448a) {
                f8.d("error on receivedCall: " + tL_error);
            }
            pendingVoIP = null;
            pendingCall = null;
            State state = currentState;
            if (state != null) {
                state.destroy();
            }
            dismiss(context, false);
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public static void lambda$acknowledge$3(Context context, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new n(tLObject, tL_error, context, runnable, 2));
    }

    public static void lambda$decline$4(int i10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (v2.f18448a) {
                f8.d("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            vp.r1(i10).L3((TLRPC.TL_updates) tLObject, false);
        }
        if (v2.f18448a) {
            f8.b("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.f33364i1 && VoIPService.getSharedInstance() == null) {
            launchActivity.f33364i1 = false;
            be1 be1Var = be1.f36195n1;
            if (be1Var != null) {
                be1Var.f();
            }
            launchActivity.moveTaskToBack(true);
        }
    }

    public static void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i10, long j10, boolean z10) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i10, j10, phoneCall.f20020id, z10));
        startRinging(context, i10, j10);
    }

    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th2) {
            f8.g(th2, true);
        }
    }

    private static android.app.Notification makeNotification(android.content.Context r16, int r17, long r18, long r20, boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPPreNotificationService.makeNotification(android.content.Context, int, long, long, boolean):android.app.Notification");
    }

    public static boolean open(Context context) {
        if (VoIPService.getSharedInstance() != null) {
            return true;
        }
        Intent intent = pendingVoIP;
        if (intent == null || pendingCall == null) {
            return false;
        }
        intent.getIntExtra("account", d20.f15147s0);
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

    public static void show(Context context, Intent intent, TL_phone.PhoneCall phoneCall) {
        f8.b("VoIPPreNotification.show()");
        if (phoneCall != null && intent != null) {
            TL_phone.PhoneCall phoneCall2 = pendingCall;
            if (phoneCall2 != null && phoneCall2.f20020id == phoneCall.f20020id) {
                return;
            }
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            int intExtra = intent.getIntExtra("account", d20.f15147s0);
            long longExtra = intent.getLongExtra("user_id", 0L);
            boolean z10 = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new di.b(intent, phoneCall, context, intExtra, longExtra, z10));
            return;
        }
        dismiss(context, false);
        f8.b("VoIPPreNotification.show(): call or intent is null");
    }

    public static void startRinging(android.content.Context r12, int r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPPreNotificationService.startRinging(android.content.Context, int, long):void");
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
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }
}
