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
import org.telegram.ui.Components.b80;
public final class h5 implements Runnable {
    public final int f1022a;
    public final Object f1023b;
    public final Object f1024c;
    public final Object d;
    public final Object f1025e;

    public h5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f1022a = 2;
        this.f1023b = x8Var;
        this.f1024c = tLObject;
        this.f1025e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f1023b;
        k2.o oVar = (k2.o) this.f1024c;
        Handler handler = (Handler) this.d;
        k2.l lVar = (k2.l) this.f1025e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (oVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, oVar, lVar));
            }
            synchronized (k2.f0.f14395o0) {
                try {
                    int i10 = k2.f0.f14397q0 - 1;
                    k2.f0.f14397q0 = i10;
                    if (i10 == 0) {
                        k2.f0.f14396p0.shutdown();
                        k2.f0.f14396p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (oVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, oVar, lVar));
            }
            synchronized (k2.f0.f14395o0) {
                try {
                    int i11 = k2.f0.f14397q0 - 1;
                    k2.f0.f14397q0 = i11;
                    if (i11 == 0) {
                        k2.f0.f14396p0.shutdown();
                        k2.f0.f14396p0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private final void b() {
        int a2;
        ki.q qVar = (ki.q) this.f1023b;
        ki.l0 l0Var = (ki.l0) this.f1024c;
        ki.l0 l0Var2 = (ki.l0) this.d;
        Handler handler = (Handler) this.f1025e;
        if (qVar.Z && qVar.G == 0 && qVar.D) {
            qVar.f15026x.g(qVar.f15025w, qVar.f15022s, false);
            qVar.E = false;
            qVar.F = false;
            qVar.M = 0.0f;
            int i10 = 1;
            qVar.G = 1;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            qVar.H = elapsedRealtimeNanos;
            qVar.I = elapsedRealtimeNanos;
            qVar.N = l0Var;
            qVar.O = l0Var2;
            String[] strArr = ki.t0.f15085a;
            synchronized (ki.t0.class) {
                ki.t0.b();
                if (l0Var != l0Var2) {
                    if (l0Var == ki.l0.f14983b) {
                        i10 = 0;
                    }
                    a2 = ki.t0.a(i10);
                } else {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
            }
            qVar.L = a2;
            int max = Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20)));
            int i11 = (max * 45) / 100;
            qVar.J = i11 * 1000000;
            qVar.K = (max - i11) * 1000000;
            ki.m mVar = qVar.f15008e;
            mVar.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + qVar.L + ", targetBlurRadiusPx=" + (((qVar.f15026x.f14829a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((qVar.J + qVar.K) / 1000000));
            qVar.A = -1L;
            handler.removeCallbacks(qVar.f15009e0);
            handler.post(qVar.f15009e0);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.c():void");
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.e():void");
    }

    private final void f() {
        CameraController.lambda$openRound$9((CameraSession) this.f1023b, (Runnable) this.f1024c, (SurfaceTexture) this.d, (Runnable) this.f1025e);
    }

    private final void g() {
        CameraController.lambda$close$5((Runnable) this.f1023b, (CameraSession) this.f1024c, (CountDownLatch) this.d, (Runnable) this.f1025e);
    }

    private final void h() {
        ((VideoAds) this.f1023b).lambda$show$14((Context) this.f1024c, (TLRPC.TL_sponsoredMessage) this.d, (b80) this.f1025e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.run():void");
    }

    public h5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f1022a = 12;
        this.f1023b = cVar;
        this.d = tL_error;
        this.f1025e = str;
        this.f1024c = tLObject;
    }

    public h5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f1022a = i10;
        this.f1023b = obj;
        this.f1024c = obj2;
        this.d = obj3;
        this.f1025e = obj4;
    }

    public h5(Utilities.Callback callback, File file, String str, String[] strArr) {
        this.f1022a = 29;
        this.f1025e = callback;
        this.f1023b = file;
        this.f1024c = str;
        this.d = strArr;
    }

    public h5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.f1022a = 10;
        this.f1024c = tLObject;
        this.f1023b = zArr;
        this.d = qVar;
        this.f1025e = userFull;
    }
}
