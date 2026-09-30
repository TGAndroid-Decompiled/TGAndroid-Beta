package ai;

import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.util.ArrayDeque;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.camera.CameraSession;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h5 implements Runnable {
    public final int f944a;
    public final Object f945b;
    public final Object f946c;
    public final Object d;
    public final Object e;

    public h5(x8 x8Var, TLObject tLObject, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f944a = 2;
        this.f945b = x8Var;
        this.f946c = tLObject;
        this.e = callback;
        this.d = tL_error;
    }

    private final void a() {
        AudioTrack audioTrack = (AudioTrack) this.f945b;
        k2.n nVar = (k2.n) this.f946c;
        Handler handler = (Handler) this.d;
        k2.k kVar = (k2.k) this.e;
        try {
            audioTrack.flush();
            audioTrack.release();
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.f13249o0) {
                try {
                    int i10 = k2.e0.f13251q0 - 1;
                    k2.e0.f13251q0 = i10;
                    if (i10 == 0) {
                        k2.e0.f13250p0.shutdown();
                        k2.e0.f13250p0 = null;
                    }
                } finally {
                }
            }
        } catch (Throwable th2) {
            if (nVar != null && handler.getLooper().getThread().isAlive()) {
                handler.post(new gg.x1(26, nVar, kVar));
            }
            synchronized (k2.e0.f13249o0) {
                try {
                    int i11 = k2.e0.f13251q0 - 1;
                    k2.e0.f13251q0 = i11;
                    if (i11 == 0) {
                        k2.e0.f13250p0.shutdown();
                        k2.e0.f13250p0 = null;
                    }
                    throw th2;
                } finally {
                }
            }
        }
    }

    private final void b() {
        int a2;
        ki.q qVar = (ki.q) this.f945b;
        ki.l0 l0Var = (ki.l0) this.f946c;
        ki.l0 l0Var2 = (ki.l0) this.d;
        Handler handler = (Handler) this.e;
        if (qVar.Z && qVar.G == 0 && qVar.D) {
            qVar.f13842x.g(qVar.f13841w, qVar.f13838s, false);
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
            String[] strArr = ki.t0.f13898a;
            synchronized (ki.t0.class) {
                ki.t0.b();
                if (l0Var != l0Var2) {
                    if (l0Var == ki.l0.f13801b) {
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
            ki.m mVar = qVar.e;
            mVar.b("synthetic camera switch started: from=" + l0Var + ", to=" + l0Var2 + ", expectedWaitMs=" + qVar.L + ", targetBlurRadiusPx=" + (((qVar.f13842x.f13654a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((qVar.J + qVar.K) / 1000000));
            qVar.A = -1L;
            handler.removeCallbacks(qVar.f13825e0);
            handler.post(qVar.f13825e0);
        }
    }

    private final void c() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.c():void");
    }

    private final void e() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.e():void");
    }

    private final void f() {
        oi.f fVar = (oi.f) this.f945b;
        ((ArrayDeque) fVar.f15776a).addLast(new oi.e((le.b) this.f946c, (oi.b) this.d, (RequestTimeDelegate) this.e));
        fVar.K();
    }

    private final void g() {
        CameraController.lambda$openRound$9((CameraSession) this.f945b, (Runnable) this.f946c, (SurfaceTexture) this.d, (Runnable) this.e);
    }

    private final void h() {
        CameraController.lambda$close$5((Runnable) this.f945b, (CameraSession) this.f946c, (CountDownLatch) this.d, (Runnable) this.e);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.h5.run():void");
    }

    public h5(gg.c cVar, TLRPC.TL_error tL_error, String str, TLObject tLObject) {
        this.f944a = 12;
        this.f945b = cVar;
        this.d = tL_error;
        this.e = str;
        this.f946c = tLObject;
    }

    public h5(Object obj, Object obj2, Object obj3, Object obj4, int i10) {
        this.f944a = i10;
        this.f945b = obj;
        this.f946c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public h5(TLObject tLObject, boolean[] zArr, org.telegram.ui.web.q qVar, TLRPC.UserFull userFull) {
        this.f944a = 10;
        this.f946c = tLObject;
        this.f945b = zArr;
        this.d = qVar;
        this.e = userFull;
    }
}
