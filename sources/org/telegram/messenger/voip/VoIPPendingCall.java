package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class VoIPPendingCall {
    private j5 accountInstance;
    private final Activity activity;
    private Handler handler;
    private kk7 notificationCenter;
    private final gk7 observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j, boolean z, long j2, j5 j5Var) {
        su2 su2Var = new su2(this, (byte) 5);
        this.observer = su2Var;
        kbc kbcVar = new kbc(this, (byte) 11);
        this.releaseRunnable = kbcVar;
        this.activity = activity;
        this.userId = j;
        this.video = z;
        this.accountInstance = j5Var;
        if (!onConnectionStateUpdated(false)) {
            kk7 f = kk7.f(y6c.t0);
            this.notificationCenter = f;
            f.a(su2Var, kk7.S1);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(kbcVar, j2);
        }
    }

    private boolean isAirplaneMode() {
        if (Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private boolean isConnected(j5 j5Var) {
        if (ConnectionsManager.getInstance(j5Var.a).getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i, int i2, Object[] objArr) {
        if (i == kk7.S1) {
            onConnectionStateUpdated(false);
        }
    }

    public void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z) {
        boolean z2;
        if (this.released || (!z && !isConnected(this.accountInstance) && !isAirplaneMode())) {
            return false;
        }
        na7 q1 = na7.q1(this.accountInstance.a);
        TLRPC.User V1 = q1.V1(Long.valueOf(this.userId));
        if (V1 != null) {
            TLRPC.UserFull W1 = q1.W1(V1.id);
            boolean z3 = this.video;
            if (W1 != null && W1.video_calls_available) {
                z2 = true;
            } else {
                z2 = false;
            }
            rgc.m(V1, z3, z2, this.activity, W1, this.accountInstance);
        } else if (isAirplaneMode()) {
            rgc.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j, boolean z, j5 j5Var) {
        return new VoIPPendingCall(activity, j, z, 1000L, j5Var);
    }

    public void release() {
        if (!this.released) {
            kk7 kk7Var = this.notificationCenter;
            if (kk7Var != null) {
                kk7Var.n(this.observer, kk7.S1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
