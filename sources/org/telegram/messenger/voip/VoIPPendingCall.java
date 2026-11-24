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
    private nm7 notificationCenter;
    private final jm7 observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j, boolean z, long j2, j5 j5Var) {
        dw2 dw2Var = new dw2(this, (byte) 5);
        this.observer = dw2Var;
        f8c f8cVar = new f8c(this, (byte) 19);
        this.releaseRunnable = f8cVar;
        this.activity = activity;
        this.userId = j;
        this.video = z;
        this.accountInstance = j5Var;
        if (!onConnectionStateUpdated(false)) {
            nm7 f = nm7.f(z8c.t0);
            this.notificationCenter = f;
            f.a(dw2Var, nm7.T1);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(f8cVar, j2);
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
        if (i == nm7.T1) {
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
        oc7 r1 = oc7.r1(this.accountInstance.a);
        TLRPC.User W1 = r1.W1(Long.valueOf(this.userId));
        if (W1 != null) {
            TLRPC.UserFull X1 = r1.X1(W1.id);
            boolean z3 = this.video;
            if (X1 != null && X1.video_calls_available) {
                z2 = true;
            } else {
                z2 = false;
            }
            sic.m(W1, z3, z2, this.activity, X1, this.accountInstance);
        } else if (isAirplaneMode()) {
            sic.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j, boolean z, j5 j5Var) {
        return new VoIPPendingCall(activity, j, z, 1000L, j5Var);
    }

    public void release() {
        if (!this.released) {
            nm7 nm7Var = this.notificationCenter;
            if (nm7Var != null) {
                nm7Var.n(this.observer, nm7.T1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
