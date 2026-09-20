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
import org.telegram.ui.Cells.u6;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.mv;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.z50;
import w7.a6;
public final class o0 {
    public boolean A;
    public boolean B;
    public volatile boolean C;
    public long D;
    public long E;
    public long F;
    public long G;
    public long I;
    public int J;
    public int K;
    public int L;
    public boolean M;
    public volatile k0 N;
    public volatile q O;
    public volatile File P;
    public i2.e0 Q;
    public final e0 T;
    public final Context f13800a;
    public final TextureView f13801b;
    public final l.d f13802c;
    public final l0 d;
    public final mv e;
    public final h f13807k;
    public final k f13808l;
    public final m0 f13809m;
    public final long f13810n;
    public h0 f13811o;
    public h0 f13812p;
    public i0 f13813q;
    public j0 f13814r;
    public boolean f13816t;
    public boolean f13817u;
    public boolean v;
    public boolean f13818w;
    public boolean f13819x;
    public boolean f13820y;
    public boolean f13821z;
    public final Object f13803f = new Object();
    public final Matrix f13804g = new Matrix();
    public final Handler h = new Handler(Looper.getMainLooper());
    public final ExecutorService f13805i = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f13806j = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int U = 1;
    public int V = 1;
    public float f13815s = 1.0f;
    public long H = 1;
    public final y R = new y(this, 1);
    public final q4 S = new q4(this, 24);

    public o0(f0 f0Var) {
        Context context;
        k2.u uVar = new k2.u(this, 1);
        this.T = new e0(this, 0);
        s();
        Context context2 = f0Var.f13676a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f13800a = context;
        TextureView textureView = f0Var.f13677b;
        this.f13801b = textureView;
        this.f13811o = f0Var.f13678c;
        m0 m0Var = f0Var.d;
        this.f13809m = m0Var;
        int i10 = f0Var.f13680g;
        i0 i0Var = f0Var.e;
        j0 j0Var = f0Var.f13679f;
        this.f13810n = 60000L;
        boolean z10 = f0Var.h;
        this.f13802c = f0Var.f13681i;
        this.d = f0Var.f13682j;
        this.e = f0Var.f13683k;
        k kVar = new k();
        this.f13808l = kVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(m0Var.f13772a);
        sb2.append("x");
        hg.k0.t(sb2, m0Var.f13772a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(i0Var);
        sb2.append(", fps=");
        sb2.append(j0Var.f13758a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f13811o);
        sb2.append(", maxDurationMs=60000");
        kVar.b(sb2.toString());
        this.f13807k = new h(context, textureView, m0Var, i10, i0Var, j0Var, z10, kVar, uVar);
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
        int i10 = this.U;
        if (i10 != 10 && i10 != 8) {
            this.f13808l.b("cancel requested: state=".concat(hg.k0.C(i10)));
            this.C = true;
            d();
            q();
            k0 k0Var = this.N;
            if (k0Var != null) {
                j(k0Var, 3);
            }
            u(10);
            if (!this.A && !this.f13807k.z()) {
                h();
                return;
            }
            this.A = true;
            this.f13821z = true;
        }
    }

    public final void b(k0 k0Var, File file, long j3, boolean z10) {
        if (!this.C && !k0Var.d) {
            this.f13806j.execute(new b0(this, k0Var, file, j3, z10));
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f13803f) {
            f();
            File createTempFile = File.createTempFile("round_video_", ".mp4", this.f13800a.getCacheDir());
            long j3 = this.H;
            this.H = 1 + j3;
            k0 k0Var = new k0(j3, createTempFile);
            this.N = k0Var;
            this.O = new q(createTempFile, this.f13809m.f13772a, z10, this.f13808l, new ah.b(23, this, k0Var));
            k kVar = this.f13808l;
            kVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + createTempFile.getName());
            this.f13806j.execute(new gg.t(this, k0Var, createTempFile, 24));
        }
    }

    public final void d() {
        this.f13816t = false;
        h hVar = this.f13807k;
        hVar.w(0.0f);
        hVar.v(false);
        t(false);
    }

    public final void f() {
        if (!this.C) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void g(Exception exc) {
        int i10 = this.U;
        if (i10 != 9 && i10 != 10) {
            this.f13808l.a("fatal error in state=".concat(hg.k0.C(i10)), exc);
            this.C = true;
            d();
            q();
            this.h.removeCallbacks(this.R);
            k0 k0Var = this.N;
            if (k0Var != null) {
                j(k0Var, 4);
            }
            k0 k0Var2 = this.N;
            if (k0Var2 != null) {
                this.f13806j.execute(new c0(this, k0Var2, exc));
            }
            u(9);
            l("error");
            z50 z50Var = (z50) this.f13802c.f13898a;
            z50Var.s();
            FileLog.e(exc);
            p01 p01Var = z50Var.O;
            if (p01Var != null) {
                p01Var.b(true);
            }
            z50Var.O = null;
            NotificationCenter.getInstance(z50Var.e).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(z50Var.f30719f));
            if (!this.A && !this.f13807k.z()) {
                h();
                return;
            }
            this.A = true;
            this.f13821z = true;
        }
    }

    public final void h() {
        if (this.B) {
            return;
        }
        this.B = true;
        l("cancelled");
        y yVar = new y(this, 0);
        ExecutorService executorService = this.f13805i;
        executorService.execute(yVar);
        this.f13807k.r();
        this.h.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f13806j.shutdown();
    }

    public final long i() {
        s();
        if (this.U != 3) {
            return this.D;
        }
        return Math.min(this.f13810n, (SystemClock.elapsedRealtime() + this.D) - this.E);
    }

    public final void j(k0 k0Var, int i10) {
        synchronized (this.f13803f) {
            try {
                if (k0Var.d) {
                    return;
                }
                k0Var.d = true;
                k kVar = this.f13808l;
                kVar.b("output generation invalidated: id=" + k0Var.f13762a + ", reason=" + hg.k0.B(i10) + ", availableSize=" + k0Var.f13764c);
                this.f13806j.execute(new c0(this, k0Var, i10));
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        if (this.F <= 0 && this.G + 10 >= this.D) {
            return false;
        }
        return true;
    }

    public final void l(String str) {
        long j3;
        if (this.M) {
            return;
        }
        this.M = true;
        k0 k0Var = this.N;
        k kVar = this.f13808l;
        StringBuilder v = a4.a.v("session summary: terminal=", str, ", state=");
        v.append(hg.k0.C(this.U));
        v.append(", durationMs=");
        v.append(i());
        v.append(", pauses=");
        v.append(this.J);
        v.append(", resumes=");
        v.append(this.K);
        v.append(", cameraSwitches=");
        v.append(this.L);
        v.append(", facing=");
        v.append(this.f13812p);
        v.append(", cameraMode=");
        v.append(this.f13813q);
        v.append(", generation=");
        long j10 = 0;
        if (k0Var == null) {
            j3 = 0;
        } else {
            j3 = k0Var.f13762a;
        }
        v.append(j3);
        v.append(", availableSize=");
        if (k0Var != null) {
            j10 = k0Var.f13764c;
        }
        v.append(j10);
        kVar.b(v.toString());
    }

    public final void m() {
        h0 h0Var = this.f13811o;
        h0 h0Var2 = this.f13812p;
        g0 g0Var = new g0(h0Var, h0Var2, this.V, this.f13815s);
        z50 z50Var = (z50) this.f13802c.f13898a;
        z50Var.N = g0Var;
        if (h0Var2 != null) {
            a6.b("round_video_last_camera", h0Var2);
        }
        z50.l(z50Var);
    }

    public final void n() {
        int i10;
        int i11 = this.U;
        long j3 = this.D;
        long j10 = this.E;
        boolean z10 = this.v;
        boolean z11 = this.f13816t;
        long j11 = this.f13810n;
        n0 n0Var = new n0(i11, j3, j10, j11, z10, z11);
        z50 z50Var = (z50) this.f13802c.f13898a;
        n0 n0Var2 = z50Var.M;
        int i12 = z50Var.e;
        u6 u6Var = z50Var.f30736t0;
        im0 im0Var = z50Var.f30734s;
        if (n0Var2 == null) {
            i10 = 0;
        } else {
            i10 = n0Var2.f13774a;
        }
        z50Var.M = n0Var;
        if (i10 == 3 && i11 != 3) {
            z50Var.q(true);
        }
        z50Var.f30723i0 = Math.max(z50Var.f30723i0, j3);
        im0Var.removeCallbacks(u6Var);
        if (i11 == 3) {
            if (!z50Var.f30731q0) {
                z50Var.f30731q0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            z50.k(z50Var);
            im0Var.postOnAnimation(u6Var);
            if (!z50Var.W) {
                z50Var.W = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(z50Var.f30719f), Boolean.FALSE);
            } else if (z50Var.f30714a0) {
                z50Var.f30714a0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            im0Var.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            z50Var.s();
        }
        if (i10 == 3 && i11 == 4) {
            z50Var.p(2);
        }
        z50.l(z50Var);
    }

    public final void o() {
        s();
        if (this.U != 3) {
            return;
        }
        this.D = i();
        this.J++;
        this.f13808l.b("pause requested: durationMs=" + this.D);
        d();
        this.h.removeCallbacks(this.R);
        u(4);
        boolean z10 = this.f13807k.z();
        this.A = z10;
        if (!z10) {
            g(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void p() {
        i2.e0 e0Var;
        s();
        if (this.U == 5 && (e0Var = this.Q) != null) {
            long J0 = e0Var.J0();
            long j3 = this.F;
            if (J0 < j3 || J0 >= this.G) {
                this.Q.W0(5, j3);
            }
            this.Q.i();
            w(true);
        }
    }

    public final void q() {
        this.h.removeCallbacks(this.S);
        this.f13818w = false;
        i2.e0 e0Var = this.Q;
        if (e0Var == null) {
            return;
        }
        e0Var.D(this.T);
        i2.e0 e0Var2 = this.Q;
        e0Var2.B1();
        TextureView textureView = this.f13801b;
        if (textureView != null && textureView == e0Var2.V) {
            e0Var2.B1();
            e0Var2.o1();
            e0Var2.t1(null);
            e0Var2.m1(0, 0);
        }
        this.Q.U0();
        this.Q = null;
    }

    public final void r(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        k kVar = this.f13808l;
        StringBuilder t10 = a4.a.t(j3, "final range remux started: range=", "..");
        t10.append(j10);
        t10.append(", includeAudio=");
        t10.append(z10);
        t10.append(", reason=");
        t10.append(hg.k0.B(i10));
        kVar.b(t10.toString());
        f();
        j(this.N, i10);
        c(z10);
        f();
        a3.z a2 = w7.k.a(file, this.O, j3, j10, z10);
        this.O.c();
        k kVar2 = this.f13808l;
        kVar2.b("final range remux completed: durationMs=" + a2.f203b + ", actualStartMs=" + a2.f202a + ", size=" + this.O.f13825a.length() + ", elapsedMs=" + e(nanoTime));
        f();
        b(this.N, this.O.f13825a, a2.f203b, z10);
    }

    public final void t(boolean z10) {
        if (this.f13817u != z10) {
            this.f13817u = z10;
            mv mvVar = this.e;
            if (mvVar != null) {
                z50.j((z50) mvVar.f26497b, z10);
            }
        }
    }

    public final void u(int i10) {
        int i11 = this.U;
        this.U = i10;
        this.f13808l.b("state: " + hg.k0.C(i11) + " -> " + hg.k0.C(i10) + ", durationMs=" + i());
        n();
    }

    public final void v(float f7) {
        s();
        if (this.U == 3 && !this.v) {
            this.f13807k.w(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void w(boolean z10) {
        if (this.f13818w == z10) {
            return;
        }
        this.f13818w = z10;
        Handler handler = this.h;
        q4 q4Var = this.S;
        handler.removeCallbacks(q4Var);
        if (z10) {
            handler.post(q4Var);
        }
        this.f13802c.getClass();
        n();
    }
}
