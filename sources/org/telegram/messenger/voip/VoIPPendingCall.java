package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class VoIPPendingCall {
    private k5 accountInstance;
    private final Activity activity;
    private Handler handler;
    private jn7 notificationCenter;
    private final fn7 observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j, boolean z, long j2, k5 k5Var) {
        nv2 nv2Var = new nv2(this, (byte) 5);
        this.observer = nv2Var;
        azb azbVar = new azb(this, (byte) 28);
        this.releaseRunnable = azbVar;
        this.activity = activity;
        this.userId = j;
        this.video = z;
        this.accountInstance = k5Var;
        if (!onConnectionStateUpdated(false)) {
            jn7 f = jn7.f(yac.t0);
            this.notificationCenter = f;
            f.a(nv2Var, jn7.T1);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(azbVar, j2);
        }
    }

    private boolean isAirplaneMode() {
        if (Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private boolean isConnected(k5 k5Var) {
        if (ConnectionsManager.getInstance(k5Var.a).getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i, int i2, Object[] objArr) {
        if (i == jn7.T1) {
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
        uc7 s1 = uc7.s1(this.accountInstance.a);
        TLRPC.User X1 = s1.X1(Long.valueOf(this.userId));
        if (X1 != null) {
            TLRPC.UserFull Y1 = s1.Y1(X1.id);
            boolean z3 = this.video;
            if (Y1 != null && Y1.video_calls_available) {
                z2 = true;
            } else {
                z2 = false;
            }
            xkc.m(X1, z3, z2, this.activity, Y1, this.accountInstance);
        } else if (isAirplaneMode()) {
            xkc.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j, boolean z, k5 k5Var) {
        return new VoIPPendingCall(activity, j, z, 1000L, k5Var);
    }

    public void release() {
        if (!this.released) {
            jn7 jn7Var = this.notificationCenter;
            if (jn7Var != null) {
                jn7Var.n(this.observer, jn7.T1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
