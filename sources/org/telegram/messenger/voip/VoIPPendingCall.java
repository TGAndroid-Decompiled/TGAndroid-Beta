package org.telegram.messenger.voip;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import org.telegram.messenger.ls;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.voip.y1;
public final class VoIPPendingCall {
    private org.telegram.messenger.c accountInstance;
    private final Activity activity;
    private Handler handler;
    private qs notificationCenter;
    private final ls observer;
    private final Runnable releaseRunnable;
    private boolean released;
    private final long userId;
    private final boolean video;

    private VoIPPendingCall(Activity activity, long j3, boolean z9, long j10, org.telegram.messenger.c cVar) {
        ls lsVar = new ls() {
            @Override
            public final void didReceivedNotification(int i7, int i10, Object[] objArr) {
                VoIPPendingCall.this.lambda$new$0(i7, i10, objArr);
            }
        };
        this.observer = lsVar;
        p0 p0Var = new p0(this, 2);
        this.releaseRunnable = p0Var;
        this.activity = activity;
        this.userId = j3;
        this.video = z9;
        this.accountInstance = cVar;
        if (!onConnectionStateUpdated(false)) {
            qs f10 = qs.f(p10.f24459s0);
            this.notificationCenter = f10;
            f10.b(lsVar, qs.T1);
            Handler handler = new Handler(Looper.myLooper());
            this.handler = handler;
            handler.postDelayed(p0Var, j10);
        }
    }

    private boolean isAirplaneMode() {
        if (Settings.System.getInt(this.activity.getContentResolver(), "airplane_mode_on", 0) == 0) {
            return false;
        }
        return true;
    }

    private boolean isConnected(org.telegram.messenger.c cVar) {
        if (ConnectionsManager.getInstance(cVar.f21723a).getConnectionState() == 3) {
            return true;
        }
        return false;
    }

    public void lambda$new$0(int i7, int i10, Object[] objArr) {
        if (i7 == qs.T1) {
            onConnectionStateUpdated(false);
        }
    }

    public void lambda$new$1() {
        onConnectionStateUpdated(true);
    }

    private boolean onConnectionStateUpdated(boolean z9) {
        boolean z10;
        if (this.released || (!z9 && !isConnected(this.accountInstance) && !isAirplaneMode())) {
            return false;
        }
        qp s12 = qp.s1(this.accountInstance.f21723a);
        TLRPC.User a22 = s12.a2(Long.valueOf(this.userId));
        if (a22 != null) {
            TLRPC.UserFull b22 = s12.b2(a22.f27101id);
            boolean z11 = this.video;
            if (b22 != null && b22.video_calls_available) {
                z10 = true;
            } else {
                z10 = false;
            }
            y1.m(a22, z11, z10, this.activity, b22, this.accountInstance);
        } else if (isAirplaneMode()) {
            y1.m(null, this.video, false, this.activity, null, this.accountInstance);
        }
        release();
        return true;
    }

    public static VoIPPendingCall startOrSchedule(Activity activity, long j3, boolean z9, org.telegram.messenger.c cVar) {
        return new VoIPPendingCall(activity, j3, z9, 1000L, cVar);
    }

    public void release() {
        if (!this.released) {
            qs qsVar = this.notificationCenter;
            if (qsVar != null) {
                qsVar.n(this.observer, qs.T1);
            }
            Handler handler = this.handler;
            if (handler != null) {
                handler.removeCallbacks(this.releaseRunnable);
            }
            this.released = true;
        }
    }
}
