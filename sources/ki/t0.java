package ki;

import ai.r4;
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
import org.telegram.messenger.MediaController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.ui.Components.cw;
import org.telegram.ui.Components.h11;
import org.telegram.ui.Components.t60;
public final class t0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public volatile boolean D;
    public long E;
    public long F;
    public long G;
    public long H;
    public long J;
    public long K;
    public int L;
    public int M;
    public int N;
    public boolean O;
    public volatile p0 P;
    public volatile u Q;
    public volatile File R;
    public i2.f0 S;
    public final j0 V;
    public final Context f15117a;
    public final TextureView f15118b;
    public final File f15119c;
    public final m2.t d;
    public final q0 f15120e;
    public final cw f15121f;
    public final j f15126l;
    public final n f15127m;
    public final r0 f15128n;
    public final long f15129o;
    public m0 f15130p;
    public m0 f15131q;
    public n0 f15132r;
    public o0 f15133s;
    public boolean f15135u;
    public boolean v;
    public boolean f15136w;
    public boolean f15137x;
    public boolean f15138y;
    public boolean f15139z;
    public final Object f15122g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f15123i = new Handler(Looper.getMainLooper());
    public final ExecutorService f15124j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f15125k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float f15134t = 1.0f;
    public long I = 1;
    public final c0 T = new c0(this, 1);
    public final r4 U = new r4(this, 24);

    public t0(k0 k0Var) {
        Context context;
        xa.d dVar = new xa.d(this, 29);
        this.V = new j0(this, 0);
        t();
        Context context2 = k0Var.f15018a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f15117a = context;
        TextureView textureView = k0Var.f15019b;
        this.f15118b = textureView;
        File file = k0Var.f15020c;
        this.f15119c = file == null ? context.getCacheDir() : file;
        this.f15130p = k0Var.d;
        r0 r0Var = k0Var.f15021e;
        this.f15128n = r0Var;
        int i10 = k0Var.h;
        n0 n0Var = k0Var.f15022f;
        o0 o0Var = k0Var.f15023g;
        this.f15129o = 60000L;
        boolean z10 = k0Var.f15024i;
        this.d = k0Var.f15025j;
        this.f15120e = k0Var.f15026k;
        this.f15121f = k0Var.f15027l;
        n nVar = new n();
        this.f15127m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.f15105a);
        sb2.append("x");
        hg.c.u(sb2, r0Var.f15105a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.f15069a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f15130p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f15126l = new j(context, textureView, r0Var, i10, n0Var, o0Var, z10, nVar, dVar);
    }

    public static long f(long j3) {
        return (System.nanoTime() - j3) / 1000000;
    }

    public static void t() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        throw new IllegalStateException("RoundVideoSession must be used from the main thread");
    }

    public final void a() {
        t();
        int i10 = this.W;
        if (i10 != 10 && i10 != 8) {
            this.f15127m.b("cancel requested: state=".concat(hg.c.C(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f15126l.S()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f15122g) {
            try {
                p0 p0Var = this.P;
                if (p0Var != null && p0Var.f15074e) {
                    return false;
                }
                this.D = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    n nVar = this.f15127m;
                    nVar.b("output generation invalidated: id=" + p0Var.f15071a + ", reason=" + hg.c.B(i10) + ", availableSize=" + p0Var.f15073c);
                    this.f15125k.execute(new f0(this, p0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f15122g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            p0 p0Var = new p0(j3, d);
            this.P = p0Var;
            this.Q = new u(d, this.f15128n.f15105a, z10, this.f15127m, new ah.b(23, this, p0Var));
            n nVar = this.f15127m;
            nVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f15125k.execute(new gg.t(this, p0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f15119c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new IOException("Round-video output path is not a directory: " + file);
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            throw new IOException("Cannot create round-video output directory: " + file);
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.f15135u = false;
        j jVar = this.f15126l;
        jVar.O(0.0f);
        jVar.N(false);
        u(false);
    }

    public final void g() {
        if (!this.D) {
            return;
        }
        throw new IOException("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i10 = this.W;
        if (i10 != 9 && i10 != 10) {
            this.f15127m.a("fatal error in state=".concat(hg.c.C(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f15123i.removeCallbacks(this.T);
                p0 p0Var = this.P;
                if (p0Var != null) {
                    this.f15125k.execute(new f0(this, p0Var, exc));
                }
                v(9);
                m("error");
                t60 t60Var = (t60) this.d.f15976b;
                t60Var.w();
                FileLog.e(exc);
                h11 h11Var = t60Var.T;
                if (h11Var != null) {
                    h11Var.d(true);
                }
                t60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (t60Var.f31005e0) {
                    t60Var.t(6);
                } else {
                    NotificationCenter.getInstance(t60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(t60Var.f31014n));
                }
                t60Var.v(false, false);
                if (!this.B && !this.f15126l.S()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final void i() {
        if (this.C) {
            return;
        }
        this.C = true;
        m("cancelled");
        c0 c0Var = new c0(this, 0);
        ExecutorService executorService = this.f15124j;
        executorService.execute(c0Var);
        this.f15126l.G();
        this.f15123i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f15125k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f15129o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(p0 p0Var, int i10) {
        synchronized (this.f15122g) {
            try {
                if (!p0Var.d && !p0Var.f15074e) {
                    p0Var.d = true;
                    n nVar = this.f15127m;
                    nVar.b("output generation invalidated: id=" + p0Var.f15071a + ", reason=" + hg.c.B(i10) + ", availableSize=" + p0Var.f15073c);
                    this.f15125k.execute(new f0(this, p0Var, i10, 0));
                }
            } finally {
            }
        }
    }

    public final boolean l() {
        long j3 = this.K;
        if (j3 <= 0) {
            j3 = this.E;
        }
        if (j3 <= this.f15129o && this.G <= 0 && this.H + 10 >= j3) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j3;
        if (this.O) {
            return;
        }
        this.O = true;
        p0 p0Var = this.P;
        n nVar = this.f15127m;
        StringBuilder w10 = a1.g.w("session summary: terminal=", str, ", state=");
        w10.append(hg.c.C(this.W));
        w10.append(", durationMs=");
        w10.append(j());
        w10.append(", pauses=");
        w10.append(this.L);
        w10.append(", resumes=");
        w10.append(this.M);
        w10.append(", cameraSwitches=");
        w10.append(this.N);
        w10.append(", facing=");
        w10.append(this.f15131q);
        w10.append(", cameraMode=");
        w10.append(this.f15132r);
        w10.append(", generation=");
        long j10 = 0;
        if (p0Var == null) {
            j3 = 0;
        } else {
            j3 = p0Var.f15071a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (p0Var != null) {
            j10 = p0Var.f15073c;
        }
        w10.append(j10);
        nVar.b(w10.toString());
    }

    public final void n() {
        m0 m0Var = this.f15130p;
        m0 m0Var2 = this.f15131q;
        l0 l0Var = new l0(m0Var, m0Var2, this.X, this.f15134t);
        t60 t60Var = (t60) this.d.f15976b;
        t60Var.S = l0Var;
        if (m0Var2 != null) {
            pi.e.h.b(m0Var2);
        }
        t60Var.x();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.f15136w;
        boolean z11 = this.f15135u;
        long j11 = this.f15129o;
        s0 s0Var = new s0(i11, j3, j10, j11, z10, z11);
        t60 t60Var = (t60) this.d.f15976b;
        s0 s0Var2 = t60Var.R;
        int i12 = t60Var.h;
        if (s0Var2 == null) {
            i10 = 0;
        } else {
            i10 = s0Var2.f15109a;
        }
        t60Var.R = s0Var;
        if (i10 == 3 && i11 != 3) {
            t60Var.u(true);
        }
        t60Var.f31023t0 = Math.max(t60Var.f31023t0, j3);
        if (i11 == 3) {
            if (!t60Var.C0) {
                t60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            t60.l(t60Var);
            t60.m(t60Var, true);
            t60Var.z();
            if (!t60Var.f31005e0) {
                t60Var.f31005e0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(t60Var.f31014n), Boolean.FALSE);
            } else if (t60Var.f31007f0) {
                t60Var.f31007f0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            t60.m(t60Var, false);
            t60Var.f31026w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            t60Var.p();
            t60Var.w();
        }
        if (i10 == 3 && i11 == 4) {
            t60Var.t(2);
        }
        t60Var.x();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f15127m.b("pause requested: durationMs=" + this.E);
        e();
        this.f15123i.removeCallbacks(this.T);
        v(4);
        boolean S = this.f15126l.S();
        this.B = S;
        if (!S) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void q() {
        i2.f0 f0Var;
        t();
        if (this.W == 5 && (f0Var = this.S) != null) {
            long J0 = f0Var.J0();
            long j3 = this.G;
            if (J0 < j3 || J0 >= this.H) {
                this.S.W0(5, j3);
            }
            this.S.i();
            x(true);
        }
    }

    public final void r() {
        this.f15123i.removeCallbacks(this.U);
        this.f15137x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.D1();
        TextureView textureView = this.f15118b;
        if (textureView != null && textureView == f0Var2.V) {
            f0Var2.D1();
            f0Var2.q1();
            f0Var2.v1(null);
            f0Var2.o1(0, 0);
        }
        this.S.U0();
        this.S = null;
    }

    public final void s(File file, long j3, long j10, boolean z10, int i10) {
        long nanoTime = System.nanoTime();
        n nVar = this.f15127m;
        StringBuilder u10 = a1.g.u(j3, "final range remux started: range=", "..");
        u10.append(j10);
        u10.append(", includeAudio=");
        u10.append(z10);
        u10.append(", reason=");
        u10.append(hg.c.B(i10));
        nVar.b(u10.toString());
        g();
        k(this.P, i10);
        c(z10);
        g();
        a3.z a2 = w7.j.a(file, this.Q, j3, j10, z10);
        this.Q.g();
        long e7 = w7.j.e(this.Q.f15140a) / 1000;
        n nVar2 = this.f15127m;
        StringBuilder u11 = a1.g.u(e7, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f221b);
        u11.append(", actualStartMs=");
        u11.append(a2.f220a);
        u11.append(", size=");
        u11.append(this.Q.f15140a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        nVar2.b(u11.toString());
        g();
        this.f15125k.execute(new g0(this, this.P, this.Q.f15140a, e7, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            cw cwVar = this.f15121f;
            if (cwVar != null) {
                t60.j((t60) cwVar.f25420b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f15127m.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f15136w) {
            this.f15126l.O(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f15137x == z10) {
            return;
        }
        this.f15137x = z10;
        Handler handler = this.f15123i;
        r4 r4Var = this.U;
        handler.removeCallbacks(r4Var);
        if (z10) {
            handler.post(r4Var);
        }
        this.d.getClass();
        o();
    }
}
