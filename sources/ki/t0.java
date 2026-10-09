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
import org.telegram.ui.Components.bw;
import org.telegram.ui.Components.g11;
import org.telegram.ui.Components.s60;
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
    public final Context f15113a;
    public final TextureView f15114b;
    public final File f15115c;
    public final m2.t d;
    public final q0 f15116e;
    public final bw f15117f;
    public final j f15122l;
    public final n f15123m;
    public final r0 f15124n;
    public final long f15125o;
    public m0 f15126p;
    public m0 f15127q;
    public n0 f15128r;
    public o0 f15129s;
    public boolean f15131u;
    public boolean v;
    public boolean f15132w;
    public boolean f15133x;
    public boolean f15134y;
    public boolean f15135z;
    public final Object f15118g = new Object();
    public final Matrix h = new Matrix();
    public final Handler f15119i = new Handler(Looper.getMainLooper());
    public final ExecutorService f15120j = Executors.newSingleThreadExecutor(new e2.c0(1));
    public final ExecutorService f15121k = Executors.newSingleThreadExecutor(new e2.c0(2));
    public int W = 1;
    public int X = 1;
    public float f15130t = 1.0f;
    public long I = 1;
    public final c0 T = new c0(this, 1);
    public final r4 U = new r4(this, 24);

    public t0(k0 k0Var) {
        Context context;
        xa.d dVar = new xa.d(this, 29);
        this.V = new j0(this, 0);
        t();
        Context context2 = k0Var.f15014a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.f15113a = context;
        TextureView textureView = k0Var.f15015b;
        this.f15114b = textureView;
        File file = k0Var.f15016c;
        this.f15115c = file == null ? context.getCacheDir() : file;
        this.f15126p = k0Var.d;
        r0 r0Var = k0Var.f15017e;
        this.f15124n = r0Var;
        int i10 = k0Var.h;
        n0 n0Var = k0Var.f15018f;
        o0 o0Var = k0Var.f15019g;
        this.f15125o = 60000L;
        boolean z10 = k0Var.f15020i;
        this.d = k0Var.f15021j;
        this.f15116e = k0Var.f15022k;
        this.f15117f = k0Var.f15023l;
        n nVar = new n();
        this.f15123m = nVar;
        StringBuilder sb2 = new StringBuilder("session created: device=");
        sb2.append(Build.MANUFACTURER);
        sb2.append(" ");
        sb2.append(Build.MODEL);
        sb2.append(", sdk=");
        sb2.append(Build.VERSION.SDK_INT);
        sb2.append(", output=");
        sb2.append(r0Var.f15101a);
        sb2.append("x");
        hg.c.u(sb2, r0Var.f15101a, ", bitrate=", i10, ", cameraMode=");
        sb2.append(n0Var);
        sb2.append(", fps=");
        sb2.append(o0Var.f15065a);
        sb2.append(", composition=");
        sb2.append(z10);
        sb2.append(", facing=");
        sb2.append(this.f15126p);
        sb2.append(", maxDurationMs=60000");
        nVar.b(sb2.toString());
        this.f15122l = new j(context, textureView, r0Var, i10, n0Var, o0Var, z10, nVar, dVar);
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
            this.f15123m.b("cancel requested: state=".concat(hg.c.C(i10)));
            if (b(3)) {
                e();
                r();
                v(10);
                if (!this.B && !this.f15122l.M()) {
                    i();
                    return;
                }
                this.B = true;
                this.A = true;
            }
        }
    }

    public final boolean b(int i10) {
        synchronized (this.f15118g) {
            try {
                p0 p0Var = this.P;
                if (p0Var != null && p0Var.f15070e) {
                    return false;
                }
                this.D = true;
                if (p0Var != null && !p0Var.d) {
                    p0Var.d = true;
                    n nVar = this.f15123m;
                    nVar.b("output generation invalidated: id=" + p0Var.f15067a + ", reason=" + hg.c.B(i10) + ", availableSize=" + p0Var.f15069c);
                    this.f15121k.execute(new f0(this, p0Var, i10, 1));
                }
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c(boolean z10) {
        synchronized (this.f15118g) {
            g();
            File d = d("round_video_");
            long j3 = this.I;
            this.I = 1 + j3;
            p0 p0Var = new p0(j3, d);
            this.P = p0Var;
            this.Q = new u(d, this.f15124n.f15101a, z10, this.f15123m, new ah.b(23, this, p0Var));
            n nVar = this.f15123m;
            nVar.b("output generation started: id=" + j3 + ", includeAudio=" + z10 + ", file=" + d.getName());
            this.f15121k.execute(new gg.t(this, p0Var, d, 24));
        }
    }

    public final File d(String str) {
        File file = this.f15115c;
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
        this.f15131u = false;
        j jVar = this.f15122l;
        jVar.I(0.0f);
        jVar.H(false);
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
            this.f15123m.a("fatal error in state=".concat(hg.c.C(i10)), exc);
            if (b(4)) {
                e();
                r();
                this.f15119i.removeCallbacks(this.T);
                p0 p0Var = this.P;
                if (p0Var != null) {
                    this.f15121k.execute(new f0(this, p0Var, exc));
                }
                v(9);
                m("error");
                s60 s60Var = (s60) this.d.f15972b;
                s60Var.w();
                FileLog.e(exc);
                g11 g11Var = s60Var.T;
                if (g11Var != null) {
                    g11Var.d(true);
                }
                s60Var.T = null;
                MediaController.getInstance().requestRecordAudioFocus(false);
                if (s60Var.f30677e0) {
                    s60Var.t(6);
                } else {
                    NotificationCenter.getInstance(s60Var.h).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStartError, Integer.valueOf(s60Var.f30686n));
                }
                s60Var.v(false, false);
                if (!this.B && !this.f15122l.M()) {
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
        ExecutorService executorService = this.f15120j;
        executorService.execute(c0Var);
        this.f15122l.B();
        this.f15119i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.f15121k.shutdown();
    }

    public final long j() {
        t();
        if (this.W != 3) {
            return this.E;
        }
        return Math.min(this.f15125o, (SystemClock.elapsedRealtime() + this.E) - this.F);
    }

    public final void k(p0 p0Var, int i10) {
        synchronized (this.f15118g) {
            try {
                if (!p0Var.d && !p0Var.f15070e) {
                    p0Var.d = true;
                    n nVar = this.f15123m;
                    nVar.b("output generation invalidated: id=" + p0Var.f15067a + ", reason=" + hg.c.B(i10) + ", availableSize=" + p0Var.f15069c);
                    this.f15121k.execute(new f0(this, p0Var, i10, 0));
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
        if (j3 <= this.f15125o && this.G <= 0 && this.H + 10 >= j3) {
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
        n nVar = this.f15123m;
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
        w10.append(this.f15127q);
        w10.append(", cameraMode=");
        w10.append(this.f15128r);
        w10.append(", generation=");
        long j10 = 0;
        if (p0Var == null) {
            j3 = 0;
        } else {
            j3 = p0Var.f15067a;
        }
        w10.append(j3);
        w10.append(", availableSize=");
        if (p0Var != null) {
            j10 = p0Var.f15069c;
        }
        w10.append(j10);
        nVar.b(w10.toString());
    }

    public final void n() {
        m0 m0Var = this.f15126p;
        m0 m0Var2 = this.f15127q;
        l0 l0Var = new l0(m0Var, m0Var2, this.X, this.f15130t);
        s60 s60Var = (s60) this.d.f15972b;
        s60Var.S = l0Var;
        if (m0Var2 != null) {
            pi.e.h.b(m0Var2);
        }
        s60Var.x();
    }

    public final void o() {
        int i10;
        int i11 = this.W;
        long j3 = this.E;
        long j10 = this.F;
        boolean z10 = this.f15132w;
        boolean z11 = this.f15131u;
        long j11 = this.f15125o;
        s0 s0Var = new s0(i11, j3, j10, j11, z10, z11);
        s60 s60Var = (s60) this.d.f15972b;
        s0 s0Var2 = s60Var.R;
        int i12 = s60Var.h;
        if (s0Var2 == null) {
            i10 = 0;
        } else {
            i10 = s0Var2.f15105a;
        }
        s60Var.R = s0Var;
        if (i10 == 3 && i11 != 3) {
            s60Var.u(true);
        }
        s60Var.f30695t0 = Math.max(s60Var.f30695t0, j3);
        if (i11 == 3) {
            if (!s60Var.C0) {
                s60Var.C0 = true;
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            }
            s60.l(s60Var);
            s60.m(s60Var, true);
            s60Var.z();
            if (!s60Var.f30677e0) {
                s60Var.f30677e0 = true;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordStarted, Integer.valueOf(s60Var.f30686n), Boolean.FALSE);
            } else if (s60Var.f30679f0) {
                s60Var.f30679f0 = false;
                NotificationCenter.getInstance(i12).lambda$postNotificationNameOnUIThread$1(NotificationCenter.recordResumed, new Object[0]);
            }
        } else {
            s60.m(s60Var, false);
            s60Var.f30698w.setProgress(((float) j3) / ((float) j11));
        }
        if (i11 == 8 || i11 == 9 || i11 == 10) {
            s60Var.p();
            s60Var.w();
        }
        if (i10 == 3 && i11 == 4) {
            s60Var.t(2);
        }
        s60Var.x();
    }

    public final void p() {
        t();
        if (this.W != 3) {
            return;
        }
        this.E = j();
        this.L++;
        this.f15123m.b("pause requested: durationMs=" + this.E);
        e();
        this.f15119i.removeCallbacks(this.T);
        v(4);
        boolean M = this.f15122l.M();
        this.B = M;
        if (!M) {
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
        this.f15119i.removeCallbacks(this.U);
        this.f15133x = false;
        i2.f0 f0Var = this.S;
        if (f0Var == null) {
            return;
        }
        f0Var.D(this.V);
        i2.f0 f0Var2 = this.S;
        f0Var2.D1();
        TextureView textureView = this.f15114b;
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
        n nVar = this.f15123m;
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
        long e7 = w7.j.e(this.Q.f15136a) / 1000;
        n nVar2 = this.f15123m;
        StringBuilder u11 = a1.g.u(e7, "final range remux completed: durationMs=", ", requestedDurationMs=");
        u11.append(a2.f221b);
        u11.append(", actualStartMs=");
        u11.append(a2.f220a);
        u11.append(", size=");
        u11.append(this.Q.f15136a.length());
        u11.append(", elapsedMs=");
        u11.append(f(nanoTime));
        nVar2.b(u11.toString());
        g();
        this.f15121k.execute(new g0(this, this.P, this.Q.f15136a, e7, z10));
    }

    public final void u(boolean z10) {
        if (this.v != z10) {
            this.v = z10;
            bw bwVar = this.f15117f;
            if (bwVar != null) {
                s60.j((s60) bwVar.f25112b, z10);
            }
        }
    }

    public final void v(int i10) {
        int i11 = this.W;
        this.W = i10;
        this.f15123m.b("state: " + hg.c.C(i11) + " -> " + hg.c.C(i10) + ", durationMs=" + j());
        o();
    }

    public final void w(float f7) {
        t();
        if (this.W == 3 && !this.f15132w) {
            this.f15122l.I(Math.max(0.0f, Math.min(1.0f, f7)));
        }
    }

    public final void x(boolean z10) {
        if (this.f15133x == z10) {
            return;
        }
        this.f15133x = z10;
        Handler handler = this.f15119i;
        r4 r4Var = this.U;
        handler.removeCallbacks(r4Var);
        if (z10) {
            handler.post(r4Var);
        }
        this.d.getClass();
        o();
    }
}
