package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.fs;
import org.telegram.messenger.j10;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.b2;
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private ks notificationCenter;
    private final fs observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j3, boolean z10, long j10, org.telegram.messenger.c cVar) {
        fs fsVar = new fs() {
            @Override
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i7, i10, objArr);
            }
        };
        this.observer = fsVar;
        q0 q0Var = new q0(this, 2);
        this.releaseRunnable = q0Var;
        this.activity = activity;
        this.userId = j3;
        this.video = z10;
        this.accountInstance = cVar;
        if (!onConnectionStateUpdated(false)) {
            ks f10 = ks.f(j10.f24798t0);
            this.notificationCenter = f10;
            f10.b(fsVar, ks.T1);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(q0Var, j10);
        }
    }

    private boolean isAirplaneMode() {
        if (Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        if (ConnectionsManager.getInstance(cVar.f23246a).getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i7, int i10, Object[] objArr) {
        if (i7 == ks.T1) {
            onConnectionStateUpdated(false);
        }
    }

    public void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z10) {
        boolean z11;
        if (this.released || (!z10 && !isConnected(this.accountInstance) && !isAirplaneMode())) {
            return false;
        }
        mp u12 = mp.u1(this.accountInstance.f23246a);
        TLRPC.User c22 = u12.c2(Long.valueOf(this.userId));
        if (c22 != null) {
            TLRPC.UserFull d2 = u12.d2(c22.f28580id);
            boolean z12 = this.video;
            if (d2 != null && d2.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            b2.m(c22, z12, z11, this.activity, d2, this.accountInstance);
        } else if (isAirplaneMode()) {
            b2.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j3, boolean z10, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j3, z10, 1000L, cVar);
    }

    public void release() {
        if (!this.released) {
            ks ksVar = this.notificationCenter;
            if (ksVar != null) {
                ksVar.n(this.observer, ks.T1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
