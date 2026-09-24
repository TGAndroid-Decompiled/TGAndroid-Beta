package ki;

import ai.q4;
import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.TextureView;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.b60;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.o01;
public final class r0 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long I;
    public long J;
    public int K;
    public int L;
    public int M;
    public boolean N;
    public volatile n0 O;
    public volatile t P;
    public volatile File Q;
    public i2.f0 R;
    public final h0 U;
    public final Context f13832a;
    public final TextureView f13833b;
    public final l.d f13834c;
    public final o0 d;
    public final nv e;
    public final h f13839k;
    public final l f13840l;
    public final p0 f13841m;
    public final long f13842n;
    public k0 f13843o;
    public k0 f13844p;
    public l0 f13845q;
    public m0 f13846r;
    public boolean f13848t;
    public boolean f13849u;
    public boolean v;
    public boolean f13850w;
    public boolean f13851x;
    public boolean f13852y;
    public boolean f13853z;
    public final Object f13835f = new Object();
    public final Matrix f13836g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f13837i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f13838j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int V = 1;
    public int W = 1;
    public float f13847s = 1.0f;
    public long H = 1;
    public final b0 S = new b0(this, 1);
    public final q4 T = new q4(this, 24);

    public r0(i0 i0Var) {
        Context context;
        k2.u uVar = new k2.u(this, 1);
        this.U = new h0(this, 0);
        s();
        Context context2 = i0Var.f13743a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f13832a = context;
        TextureView textureView = i0Var.f13744b;
        this.f13833b = textureView;
        this.f13843o = i0Var.f13745c;
        p0 p0Var = i0Var.d;
        this.f13841m = p0Var;
        int i10 = i0Var.f13747g;
        l0 l0Var = i0Var.e;
        m0 m0Var = i0Var.f13746f;
        this.f13842n = 60000L;
        boolean z10 = i0Var.h;
        this.f13834c = i0Var.f13748i;
        this.d = i0Var.f13749j;
        this.e = i0Var.f13750k;
        l lVar = new l();
        this.f13840l = lVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(p0Var.f13801a);
        sb2.append("x");
        hg.c.t(sb2, p0Var.f13801a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(l0Var);
        sb2.append(", fps=");
        sb2.append(m0Var.f13791a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f13843o);
        sb2.append(", maxDurationMs=60000");
        lVar.b(sb2.toString());
        this.f13839k = new h(context, textureView, p0Var, i10, l0Var, m0Var, z10, lVar, uVar);
    }

    public static long e(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void s() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final void a() {
        s();
        int i10 = this.V;
        if (i10 != 10 && i10 != 8) {
            this.f13840l.b("cancel requested: state=".concat(hg.c.C(i10)));
            if (b(3)) {
                d();
                q();
                u(10);
                if (!this.A && !this.f13839k.C()) {
                    h();
                    return;
                }
                this.A = true;
                this.f13853z = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f13835f) {
            try {
                n0 n0Var = this.O;
                if (n0Var != null && n0Var.e) {
                    return false;
                }
                this.C = true;
                if (n0Var != null && !n0Var.d) {
                    n0Var.d = true;
                    l lVar = this.f13840l;
                    lVar.b("output generation invalidated: id=" + n0Var.f13795a + ", reason=" + hg.c.B(i10) + ", availableSize=" + n0Var.f13797c);
                    this.f13838j.execute(new e0(this, n0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f13835f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.f13832a.getCacheDir());
            long j3 = this.H;
            this.H = 1 + j3;
            n0 n0Var = new n0(j3, createTempFile);
            this.O = n0Var;
            this.P = new t(createTempFile, this.f13841m.f13801a, z10, this.f13840l, new ah.b(23, this, n0Var));
            l lVar = this.f13840l;
            lVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.f13838j.execute(new gg.t(this, n0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.f13848t = false;
        h hVar = this.f13839k;
        hVar.y(0.0f);
        hVar.x(false);
        t(false);
    }

    public final void f() {
        if (!this.C) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void g(Exception exc) {
        int i10 = this.V;
        if (i10 != 9 && i10 != 10) {
            this.f13840l.a("fatal error in state=".concat(hg.c.C(i10)), exc);
            if (b(4)) {
                d();
                q();
                this.h.removeCallbacks(this.S);
                n0 n0Var = this.O;
                if (n0Var != null) {
                    this.f13838j.execute(new e0(this, n0Var, exc));
                }
                u(9);
                l("error");
                b60 b60Var = (b60) this.f13834c.f13909a;
                b60Var.t();
                FileLog.e(exc);
                o01 o01Var = b60Var.Q;
                if (o01Var != null) {
                    o01Var.d(true);
                }
                b60Var.Q = null;
                NotificationCenter.getInstance(b60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(b60Var.f22880n));
                if (!this.A && !this.f13839k.C()) {
                    h();
                    return;
                }
                this.A = true;
                this.f13853z = true;
            }
        }
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.B = true;
        l("cancelled");
        b0 b0Var = new b0(this, 0);
        ExecutorService executorService = this.f13837i;
        executorService.execute(b0Var);
        this.f13839k.r();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f13838j.shutdown();
    }

    public final long i() {
        s();
        if (this.V != 3) {
            return this.D;
        }
        return Math.min(this.f13842n, (SystemClock.elapsedRealtime() + this.D) - this.E);
    }

    public final void j(n0 n0Var, int i10) {
        synchronized (this.f13835f) {
            try {
                if (!n0Var.d && !n0Var.e) {
                    n0Var.d = true;
                    l lVar = this.f13840l;
                    lVar.b("output generation invalidated: id=" + n0Var.f13795a + ", reason=" + hg.c.B(i10) + ", availableSize=" + n0Var.f13797c);
                    this.f13838j.execute(new e0(this, n0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean k() {
        long j3 = this.J;
        if (j3 <= 0) {
            j3 = this.D;
        }
        if (j3 <= this.f13842n && this.F <= 0 && this.G + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void l(String str) {
        long j3;
        if (this.N) {
            return;
        }
        this.N = true;
        n0 n0Var = this.O;
        l lVar = this.f13840l;
        StringBuilder w10 = a4.a.w("session summary: terminal=", str, ", state=");
        w10.append(hg.c.C(this.V));
        w10.append(", durationMs=");
        w10.append(i());
        w10.append(", pauses=");
        w10.append(this.K);
        w10.append(", resumes=");
        w10.append(this.L);
        w10.append(", cameraSwitches=");
        w10.append(this.M);
        w10.append(", facing=");
        w10.append(this.f13844p);
        w10.append(", cameraMode=");
        w10.append(this.f13845q);
        w10.append(", generation=");
        long j10 = 0;
        if (n0Var == null) {
            j3 = 0;
        } else {
            j3 = n0Var.f13795a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (n0Var != null) {
            j10 = n0Var.f13797c;
        }
        w10.append(j10);
        lVar.b(w10.toString());
    }

    public final void m() {
        k0 k0Var = this.f13843o;
        k0 k0Var2 = this.f13844p;
        j0 j0Var = new j0(k0Var, k0Var2, this.W, this.f13847s);
        b60 b60Var = (b60) this.f13834c.f13909a;
        b60Var.P = j0Var;
        if (k0Var2 != null) {
            pi.e.h.b(k0Var2);
        }
        b60.k(b60Var);
    }

    public final void n() {
        int i10;
        int i11 = this.V;
        long j3 = this.D;
        long j10 = this.E;
        boolean z10 = this.v;
        boolean z11 = this.f13848t;
        long j11 = this.f13842n;
        q0 q0Var = new q0(i11, j3, j10, j11, z10, z11);
        b60 b60Var = (b60) this.f13834c.f13909a;
        q0 q0Var2 = b60Var.O;
        int i12 = b60Var.h;
        if (q0Var2 == null) {
            i10 = 0;
        } else {
            i10 = q0Var2.f13825a;
        }
        b60Var.O = q0Var;
        if (i10 == 3 && i11 != 3) {
            b60Var.r(true);
        }
        b60Var.f22878k0 = Math.max(b60Var.f22878k0, j3);
        if (i11 == 3) {
            if (!b60Var.f22888s0) {
                b60Var.f22888s0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            b60.l(b60Var);
            b60.m(b60Var, true);
            b60Var.v();
            if (!b60Var.f22868b0) {
                b60Var.f22868b0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(b60Var.f22880n), Boolean.FALSE);
            } else if (b60Var.f22869c0) {
                b60Var.f22869c0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            b60.m(b60Var, false);
            b60Var.f22892w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            b60Var.t();
        }
        if (i10 == 3 && i11 == 4) {
            b60Var.q(2);
        }
        b60.k(b60Var);
    }

    public final void o() {
        s();
        if (this.V != 3) {
            return;
        }
        this.D = i();
        this.K++;
        this.f13840l.b("pause requested: durationMs=" + this.D);
        d();
        this.h.removeCallbacks(this.S);
        u(4);
        boolean C = this.f13839k.C();
        this.A = C;
        if (!C) {
            g(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void p() {
        i2.f0 f0Var;
        s();
        if (this.V == 5 && (f0Var = this.R) != null) {
            long J0 = f0Var.J0();
            long j3 = this.F;
            if (J0 < j3 || J0 >= this.G) {
                this.R.W0(5, j3);
            }
            this.R.i();
            w(true);
        }
    }

    public final void q() {
        this.h.removeCallbacks(this.T);
        this.f13850w = false;
        i2.f0 f0Var = this.R;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.U);
        i2.f0 f0Var2 = this.R;
        f0Var2.B1();
        TextureView textureView = this.f13833b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.B1();
            f0Var2.o1();
            f0Var2.t1(null);
            f0Var2.m1(0, 0);
        }
        this.R.U0();
        this.R = null;
    }

    public final void r(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        l lVar = this.f13840l;
        StringBuilder u10 = a4.a.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(hg.c.B(i10));
        lVar.b(u10.toString());
        f();
        j(this.O, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.P, j3, j10, z10);
        this.P.f();
        long e = w7.k.e(this.P.f13857a) / 1000;
        l lVar2 = this.f13840l;
        StringBuilder u11 = a4.a.u(e, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f203b);
        u11.append(", actualStartMs=");
        u11.append(a2.f202a);
        u11.append(", size=");
        u11.append(this.P.f13857a.length());
        u11.append(", elapsedMs=");
        u11.append(e(nanoTime));
        lVar2.b(u11.toString());
        f();
        this.f13838j.execute(new f0(this, this.O, this.P.f13857a, e, z10));
    }

    public final void t(boolean z10) {
        if (this.f13849u != z10) {
            this.f13849u = z10;
            nv nvVar = this.e;
            if (nvVar != null) {
                b60.j((b60) nvVar.f26801b, z10);
            }
        }
    }

    public final void u(int i10) {
        int i11 = this.V;
        this.V = i10;
        this.f13840l.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + i());
        n();
    }

    public final void v(float f7) {
        s();
        if (this.V == 3 && !this.v) {
            this.f13839k.y(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void w(boolean z10) {
        if (this.f13850w == z10) {
            return;
        }
        this.f13850w = z10;
        Handler handler = this.h;
        q4 q4Var = this.T;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.f13834c.getClass();
        n();
    }
}
