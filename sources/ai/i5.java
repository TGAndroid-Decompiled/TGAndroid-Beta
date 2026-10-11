package ai;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
public final class i5 implements Runnable {
    public final int f1136a;
    public final Object f1137b;
    public final Object f1138c;
    public final Object d;
    public final Object f1139e;

    public i5(y8 y8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1136a = 2;
        this.f1137b = y8Var;
        this.f1138c = tLObject;
        this.f1139e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f1137b;
        k2.n nVar = (k2.n) this.f1138c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.f1139e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.w1(26, nVar, kVar));
            }
            synchronized (k2.d0.f14420n0) {
                try {
                    int i10 = k2.d0.f14422p0 - 1;
                    k2.d0.f14422p0 = i10;
                    if (i10 == 0) {
                        k2.d0.f14421o0.shutdown();
                        k2.d0.f14421o0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.w1(26, nVar, kVar));
            }
            synchronized (k2.d0.f14420n0) {
                try {
                    int i11 = k2.d0.f14422p0 - 1;
                    k2.d0.f14422p0 = i11;
                    if (i11 == 0) {
                        k2.d0.f14421o0.shutdown();
                        k2.d0.f14421o0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private final void b() {
        int a2;
        int max;
        int max2;
        ki.r rVar = (ki.r) this.f1137b;
        ki.m0 m0Var = (ki.m0) this.f1138c;
        ki.m0 m0Var2 = (ki.m0) this.d;
        Handler handler = (Handler) this.f1139e;
        if (rVar.Z && rVar.G == 0 && rVar.D) {
            rVar.f15099x.g(rVar.f15098w, rVar.f15095s, false);
            rVar.E = false;
            rVar.F = false;
            rVar.M = 0.0f;
            int i10 = 1;
            rVar.G = 1;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            rVar.H = elapsedRealtimeNanos;
            rVar.I = elapsedRealtimeNanos;
            rVar.N = m0Var;
            rVar.O = m0Var2;
            String[] strArr = ki.u0.f15159a;
            synchronized (ki.u0.class) {
                ki.u0.b();
                if (m0Var != m0Var2) {
                    if (m0Var == ki.m0.f15056b) {
                        i10 = 0;
                    }
                    a2 = ki.u0.a(i10);
                } else {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
            }
            rVar.L = a2;
            rVar.J = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
            rVar.K = (max - max2) * 1000000;
            rVar.f15081e.b("synthetic camera switch started: from=" + m0Var + ", to=" + m0Var2 + ", expectedWaitMs=" + rVar.L + ", targetBlurRadiusPx=" + (((rVar.f15099x.f14882a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((rVar.J + rVar.K) / 1000000));
            rVar.A = -1L;
            handler.removeCallbacks(rVar.f15082e0);
            handler.post(rVar.f15082e0);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.c():void");
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.e():void");
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f1137b, (Runnable) this.f1138c, (SurfaceTexture) this.d, (Runnable) this.f1139e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f1137b, (CameraSession) this.f1138c, (CountDownLatch) this.d, (Runnable) this.f1139e);
    }

    private final void h() {
        ((VideoAds) this.f1137b).lambda$show$14((Context) this.f1138c, (TLRPC.TL_sponsoredMessage) this.d, (q80) this.f1139e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.i5.run():void");
    }

    public i5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f1136a = 12;
        this.f1137b = cVar;
        this.d = tL_error;
        this.f1139e = str;
        this.f1138c = tLObject;
    }

    public i5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1136a = i10;
        this.f1137b = obj;
        this.f1138c = obj2;
        this.d = obj3;
        this.f1139e = obj4;
    }

    public i5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f1136a = 29;
        this.f1139e = callback;
        this.f1137b = file;
        this.f1138c = str;
        this.d = strArr;
    }

    public i5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.f1136a = 10;
        this.f1138c = tLObject;
        this.f1137b = zArr;
        this.d = qVar;
        this.f1139e = userFull;
    }
}
