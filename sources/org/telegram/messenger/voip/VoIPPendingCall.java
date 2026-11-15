package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.is;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.c2;
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private ns notificationCenter;
    private final is observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j3, boolean z10, long j10, org.telegram.messenger.c cVar) {
        is isVar = new is() {
            @Override
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i7, i10, objArr);
            }
        };
        this.observer = isVar;
        q0 q0Var = new q0(this, 2);
        this.releaseRunnable = q0Var;
        this.activity = activity;
        this.userId = j3;
        this.video = z10;
        this.accountInstance = cVar;
        if (!onConnectionStateUpdated(false)) {
            ns f10 = ns.f(m10.f24940t0);
            this.notificationCenter = f10;
            f10.b(isVar, ns.T1);
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
        if (ConnectionsManager.getInstance(cVar.f22782a).getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i7, int i10, Object[] objArr) {
        if (i7 == ns.T1) {
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
        np s12 = np.s1(this.accountInstance.f22782a);
        TLRPC.User a22 = s12.a2(Long.valueOf(this.userId));
        if (a22 != null) {
            TLRPC.UserFull b22 = s12.b2(a22.f28200id);
            boolean z12 = this.video;
            if (b22 != null && b22.video_calls_available) {
                z11 = true;
            } else {
                z11 = false;
            }
            c2.m(a22, z12, z11, this.activity, b22, this.accountInstance);
        } else if (isAirplaneMode()) {
            c2.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j3, boolean z10, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j3, z10, 1000L, cVar);
    }

    public void release() {
        if (!this.released) {
            ns nsVar = this.notificationCenter;
            if (nsVar != null) {
                nsVar.n(this.observer, ns.T1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
