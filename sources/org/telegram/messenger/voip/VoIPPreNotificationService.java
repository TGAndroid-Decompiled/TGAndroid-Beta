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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity;
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

        public State(int i, long j, TL_phone.PhoneCall phoneCall) {
            this.currentAccount = i;
            this.userId = j;
            this.call = phoneCall;
        }

        @Override
        public void acceptIncomingCall() {
            VoIPPreNotificationService.answer(org.telegram.messenger.a.b);
        }

        @Override
        public void declineIncomingCall() {
            VoIPPreNotificationService.decline(org.telegram.messenger.a.b, 1);
        }

        public void destroy() {
            if (!this.destroyed) {
                this.destroyed = true;
                mkc mkcVar = mkc.m1;
                if (mkcVar != null) {
                    mkcVar.onStateChanged(getCallState());
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
            return uc7.s1(this.currentAccount).X1(Long.valueOf(this.userId));
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

    private static void acknowledge(Context context, int i, TL_phone.PhoneCall phoneCall, Runnable runnable) {
        if (phoneCall instanceof TL_phone.TL_phoneCallDiscarded) {
            if (f11.a) {
                cc4.l("Call " + phoneCall.id + " was discarded before the voip pre notification started, stopping");
            }
            pendingVoIP = null;
            pendingCall = null;
            State state = currentState;
            if (state != null) {
                state.destroy();
            }
        } else if (f3f.b() && !f3f.a() && ((KeyguardManager) context.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            if (f11.a) {
                cc4.d("MIUI: no permission to show when locked but the screen is locked. ¯\\_(ツ)_/¯");
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
            tL_inputPhoneCall.id = phoneCall.id;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            ConnectionsManager.getInstance(i).sendRequest(receivedcall, new isa(context, runnable, (byte) 23), 2);
        }
    }

    public static void answer(Context context) {
        cc4.b("VoIPPreNotification.answer()");
        Intent intent = pendingVoIP;
        if (intent == null) {
            cc4.b("VoIPPreNotification.answer(): pending intent is not found");
            return;
        }
        currentState = null;
        intent.getIntExtra("account", yac.t0);
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().acceptIncomingCall();
        } else {
            pendingVoIP.putExtra("openFragment", true);
            if (jve.d("android.permission.RECORD_AUDIO") && (!isVideo() || jve.d("android.permission.CAMERA"))) {
                int i = Build.VERSION.SDK_INT;
                Intent intent2 = pendingVoIP;
                if (i >= 26) {
                    context.startForegroundService(intent2);
                } else {
                    context.startService(intent2);
                }
                pendingVoIP = null;
            } else {
                try {
                    PendingIntent.getActivity(context, 0, new Intent(context, VoIPPermissionActivity.class).addFlags(268435456), 1107296256).send();
                    return;
                } catch (Exception e) {
                    if (f11.a) {
                        cc4.e("Error starting permission activity", e);
                        return;
                    }
                    return;
                }
            }
        }
        dismiss(context, true);
    }

    public static void decline(Context context, int i) {
        cc4.b("VoIPPreNotification.decline(" + i + ")");
        Intent intent = pendingVoIP;
        if (intent != null && pendingCall != null) {
            int intExtra = intent.getIntExtra("account", yac.t0);
            TL_phone.discardCall discardcall = new TL_phone.discardCall();
            TLRPC.TL_inputPhoneCall tL_inputPhoneCall = new TLRPC.TL_inputPhoneCall();
            discardcall.peer = tL_inputPhoneCall;
            TL_phone.PhoneCall phoneCall = pendingCall;
            tL_inputPhoneCall.access_hash = phoneCall.access_hash;
            tL_inputPhoneCall.id = phoneCall.id;
            discardcall.duration = 0;
            discardcall.connection_id = 0L;
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
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
            cc4.d("discardCall " + discardcall.reason);
            ConnectionsManager.getInstance(intExtra).sendRequest(discardcall, new fw0(intExtra, (byte) 7), 2);
            dismiss(context, false);
            return;
        }
        cc4.b("VoIPPreNotification.decline(" + i + "): pending intent or call is not found");
    }

    public static void dismiss(Context context, boolean z) {
        cc4.b("VoIPPreNotification.dismiss()");
        pendingVoIP = null;
        pendingCall = null;
        State state = currentState;
        if (state != null) {
            state.destroy();
        }
        ((NotificationManager) context.getSystemService("notification")).cancel(203);
        stopRinging();
        if (!z) {
            for (int i = 0; i < 4; i++) {
                uc7.s1(i).Z3 = false;
            }
            hl.c3(new osa((byte) 12));
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
        if (f11.a) {
            cc4.l("(VoIPPreNotification) receivedCall response = " + tLObject);
        }
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("error on receivedCall: " + tL_error);
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
        hl.c3(new kta(tLObject, tL_error, context, runnable, (byte) 24));
    }

    public static void lambda$decline$4(int i, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            if (f11.a) {
                cc4.d("(VoIPPreNotification) error on phone.discardCall: " + tL_error);
                return;
            }
            return;
        }
        if (tLObject instanceof TLRPC.TL_updates) {
            uc7.s1(i).Y3((TLRPC.TL_updates) tLObject, false);
        }
        if (f11.a) {
            cc4.b("(VoIPPreNotification) phone.discardCall " + tLObject);
        }
    }

    public static void lambda$dismiss$5() {
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.h1 && VoIPService.getSharedInstance() == null) {
            launchActivity.h1 = false;
            mkc mkcVar = mkc.m1;
            if (mkcVar != null) {
                mkcVar.d();
            }
            launchActivity.moveTaskToBack(true);
        }
    }

    public static void lambda$show$1(Intent intent, TL_phone.PhoneCall phoneCall, Context context, int i, long j, boolean z) {
        pendingVoIP = intent;
        pendingCall = phoneCall;
        ((NotificationManager) context.getSystemService("notification")).notify(203, makeNotification(context, i, j, phoneCall.id, z));
        startRinging(context, i, j);
    }

    public static void lambda$startRinging$0(MediaPlayer mediaPlayer) {
        try {
            ringtonePlayer.start();
        } catch (Throwable th) {
            cc4.g(th, true);
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
        intent.getIntExtra("account", yac.t0);
        pendingVoIP.putExtra("openFragment", true);
        pendingVoIP.putExtra("accept", false);
        int i = Build.VERSION.SDK_INT;
        Intent intent2 = pendingVoIP;
        if (i >= 26) {
            context.startForegroundService(intent2);
        } else {
            context.startService(intent2);
        }
        pendingVoIP = null;
        dismiss(context, true);
        return true;
    }

    public static void show(Context context, Intent intent, TL_phone.PhoneCall phoneCall) {
        cc4.b("VoIPPreNotification.show()");
        if (phoneCall != null && intent != null) {
            TL_phone.PhoneCall phoneCall2 = pendingCall;
            if (phoneCall2 != null && phoneCall2.id == phoneCall.id) {
                return;
            }
            dismiss(context, false);
            pendingVoIP = intent;
            pendingCall = phoneCall;
            int intExtra = intent.getIntExtra("account", yac.t0);
            long longExtra = intent.getLongExtra("user_id", 0L);
            boolean z = phoneCall.video;
            currentState = new State(intExtra, longExtra, phoneCall);
            acknowledge(context, intExtra, phoneCall, new ck2(intent, phoneCall, context, intExtra, longExtra, z));
            return;
        }
        dismiss(context, false);
        cc4.b("VoIPPreNotification.show(): call or intent is null");
    }

    public static void startRinging(android.content.Context r12, int r13, long r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.VoIPPreNotificationService.startRinging(android.content.Context, int, long):void");
    }

    public static void stopRinging() {
        synchronized (sync) {
            MediaPlayer mediaPlayer = ringtonePlayer;
            if (mediaPlayer != null) {
                mediaPlayer.stop();
                ringtonePlayer.release();
                ringtonePlayer = null;
            }
        }
        Vibrator vibrator2 = vibrator;
        if (vibrator2 != null) {
            vibrator2.cancel();
            vibrator = null;
        }
    }
}
