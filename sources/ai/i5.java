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
import org.telegram.ui.Components.p80;
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
        ki.t tVar = (ki.t) this.f1137b;
        ki.o0 o0Var = (ki.o0) this.f1138c;
        ki.o0 o0Var2 = (ki.o0) this.d;
        Handler handler = (Handler) this.f1139e;
        if (tVar.f15130r0 && tVar.W == 0 && tVar.T) {
            tVar.N.g(tVar.L, tVar.D, false);
            tVar.U = false;
            tVar.V = false;
            tVar.f15103c0 = 0.0f;
            int i10 = 1;
            tVar.W = 1;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            tVar.X = elapsedRealtimeNanos;
            tVar.Y = elapsedRealtimeNanos;
            tVar.f15104d0 = o0Var;
            tVar.f15106e0 = o0Var2;
            String[] strArr = ki.w0.f15201a;
            synchronized (ki.w0.class) {
                ki.w0.b();
                if (o0Var != o0Var2) {
                    if (o0Var == ki.o0.f15077b) {
                        i10 = 0;
                    }
                    a2 = ki.w0.a(i10);
                } else {
                    throw new IllegalArgumentException("Camera switch direction must change");
                }
            }
            tVar.f15101b0 = a2;
            tVar.Z = ((Math.max(210, Math.min(300, 300 - ((Math.max(0, a2 - 400) * 3) / 20))) * 45) / 100) * 1000000;
            tVar.f15099a0 = (max - max2) * 1000000;
            tVar.f15112i.b("synthetic camera switch started: from=" + o0Var + ", to=" + o0Var2 + ", expectedWaitMs=" + tVar.f15101b0 + ", targetBlurRadiusPx=" + (((tVar.N.f14894a * 4.0f) / 48.0f) * 1.15f) + ", overdueBlurGrowth=0.35, revealMs=" + ((tVar.Z + tVar.f15099a0) / 1000000));
            tVar.Q = -1L;
            handler.removeCallbacks(tVar.f15141x0);
            handler.post(tVar.f15141x0);
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
        ((VideoAds) this.f1137b).lambda$show$14((Context) this.f1138c, (TLRPC.TL_sponsoredMessage) this.d, (p80) this.f1139e);
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
