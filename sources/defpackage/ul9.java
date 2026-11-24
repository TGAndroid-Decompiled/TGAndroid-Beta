package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.File;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.telegram.messenger.MediaController;
import org.telegram.ui.Components.q;
public final class ul9 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public volatile boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public long N;
    public long O;
    public int P;
    public int Q;
    public int R;
    public boolean S;
    public volatile ql9 T;
    public volatile nk9 U;
    public volatile File V;
    public y54 W;
    public final b30 Z;
    public final Context a;
    public final ro5 b;
    public final File c;
    public final gi3 d;
    public final rl9 e;
    public final ry4 f;
    public final ak9 l;
    public final ek9 m;
    public final sl9 n;
    public final int o;
    public final pl9 p;
    public final char q;
    public nl9 r;
    public nl9 s;
    public ol9 t;
    public pl9 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new x20((byte) 7));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new x20((byte) 8));
    public int a0 = 1;
    public int b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final il9 X = new il9(this, (byte) 0);
    public final bg7 Y = new bg7(this, (byte) 21);

    public ul9(ll9 ll9Var) {
        Context context;
        g29 g29Var = new g29(this, (byte) 6);
        this.Z = new b30(this, (byte) 1);
        v();
        Context context2 = ll9Var.a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.a = context;
        ro5 ro5Var = ll9Var.b;
        this.b = ro5Var;
        File file = ll9Var.c;
        this.c = file == null ? context.getCacheDir() : file;
        this.r = ll9Var.d;
        sl9 sl9Var = ll9Var.e;
        this.n = sl9Var;
        int i = ll9Var.h;
        this.o = i;
        ol9 ol9Var = ll9Var.f;
        pl9 pl9Var = ll9Var.g;
        this.p = pl9Var;
        this.q = (char) 60000;
        boolean z = ll9Var.i;
        this.d = ll9Var.j;
        this.e = ll9Var.k;
        this.f = ll9Var.l;
        ek9 ek9Var = new ek9();
        this.m = ek9Var;
        StringBuilder sb = new StringBuilder("session created: device=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append(", sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(", output=");
        sb.append((int) sl9Var.a);
        sb.append("x");
        ir2.w(sb, sl9Var.a, ", bitrate=", i, ", cameraMode=");
        sb.append(ol9Var);
        sb.append(", fps=");
        sb.append((int) pl9Var.a);
        sb.append(", composition=");
        sb.append(z);
        sb.append(", facing=");
        sb.append(this.r);
        sb.append(", maxDurationMs=60000");
        ek9Var.b(sb.toString());
        this.l = new ak9(context, ro5Var, sl9Var, i, ol9Var, pl9Var, z, ek9Var, g29Var);
    }

    public static long f(long j) {
        return (System.nanoTime() - j) / 1000000;
    }

    public static void v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        sc8.j("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        v();
        int i = this.a0;
        if (i != 10 && i != 8) {
            this.m.b("cancel requested: state=".concat(de9.A(this.a0)));
            b(3, true);
            e();
            t();
            x(10);
            if (!this.E && !this.l.W()) {
                i();
                return true;
            }
            this.E = true;
            this.C = true;
            return true;
        }
        return false;
    }

    public final boolean b(int i, boolean z) {
        synchronized (this.g) {
            ql9 ql9Var = this.T;
            if (ql9Var != null && ql9Var.e && !z) {
                return false;
            }
            this.H = true;
            if (ql9Var != null && !ql9Var.d) {
                ql9Var.d = true;
                ek9 ek9Var = this.m;
                ek9Var.b("output generation invalidated: id=" + ql9Var.a + ", reason=" + de9.z(i) + ", availableSize=" + ql9Var.c);
                this.k.execute(new hl9(this, ql9Var, i, (byte) 2));
            }
            return true;
        }
    }

    public final void c(boolean z) {
        synchronized (this.g) {
            g();
            File d = d("round_video_");
            long j = this.M;
            this.M = 1 + j;
            ql9 ql9Var = new ql9(j, d);
            this.T = ql9Var;
            this.U = new nk9(d, this.n.a, z, this.m, new kq8(this, ql9Var, (byte) 11));
            ek9 ek9Var = this.m;
            ek9Var.b("output generation started: id=" + j + ", includeAudio=" + z + ", file=" + d.getName());
            this.k.execute(new gm8(this, ql9Var, d, (byte) 18));
        }
    }

    public final File d(String str) {
        File file = this.c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                ag.e(file, "Round-video output path is not a directory: ");
                return null;
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            ag.e(file, "Cannot create round-video output directory: ");
            return null;
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.w = false;
        ak9 ak9Var = this.l;
        ak9Var.T(0.0f);
        ak9Var.S(false);
        w(false);
    }

    public final void g() {
        if (!this.H) {
            return;
        }
        k93.f("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i = this.a0;
        if (i != 9 && i != 10) {
            this.m.a("fatal error in state=".concat(de9.A(this.a0)), exc);
            if (b(4, false)) {
                e();
                t();
                this.i.removeCallbacks(this.X);
                ql9 ql9Var = this.T;
                if (ql9Var != null) {
                    this.k.execute(new hl9(this, ql9Var, exc));
                }
                x(9);
                m("error");
                q qVar = (q) this.d.a;
                qVar.x();
                fa4.g(exc, true);
                lgb lgbVar = qVar.U;
                if (lgbVar != null) {
                    lgbVar.d(true);
                }
                qVar.U = null;
                if (qVar.b0) {
                    qVar.b0 = false;
                    qVar.Q = null;
                } else {
                    MediaController.w().X(false);
                    if (qVar.i0) {
                        qVar.s(6);
                    } else {
                        kk7.f(qVar.h).k(kk7.l2, Integer.valueOf(qVar.n));
                    }
                    qVar.w(false);
                }
                if (!this.E && !this.l.W()) {
                    i();
                    return;
                }
                this.E = true;
                this.C = true;
            }
        }
    }

    public final void i() {
        if (this.F) {
            return;
        }
        this.F = true;
        m("cancelled");
        il9 il9Var = new il9(this, (byte) 1);
        ExecutorService executorService = this.j;
        executorService.execute(il9Var);
        this.l.K();
        this.i.removeCallbacksAndMessages(null);
        executorService.shutdown();
        this.k.shutdown();
    }

    public final long j() {
        v();
        if (this.a0 != 3) {
            return this.I;
        }
        return Math.min(this.q, (SystemClock.elapsedRealtime() + this.I) - this.J);
    }

    public final void k(ql9 ql9Var, int i) {
        synchronized (this.g) {
            if (!ql9Var.d && !ql9Var.e) {
                ql9Var.d = true;
                ek9 ek9Var = this.m;
                ek9Var.b("output generation invalidated: id=" + ql9Var.a + ", reason=" + de9.z(i) + ", availableSize=" + ql9Var.c);
                this.k.execute(new hl9(this, ql9Var, i, (byte) 0));
            }
        }
    }

    public final boolean l() {
        long j = this.O;
        if (j <= 0) {
            j = this.I;
        }
        if (j <= this.q && this.K <= 0 && this.L + 10 >= j) {
            return false;
        }
        return true;
    }

    public final void m(String str) {
        long j;
        if (this.S) {
            return;
        }
        this.S = true;
        ql9 ql9Var = this.T;
        ek9 ek9Var = this.m;
        StringBuilder p = ug8.p("session summary: terminal=", str, ", state=");
        p.append(de9.A(this.a0));
        p.append(", durationMs=");
        p.append(j());
        p.append(", pauses=");
        p.append(this.P);
        p.append(", resumes=");
        p.append(this.Q);
        p.append(", cameraSwitches=");
        p.append(this.R);
        p.append(", facing=");
        p.append(this.s);
        p.append(", cameraMode=");
        p.append(this.t);
        p.append(", generation=");
        long j2 = 0;
        if (ql9Var == null) {
            j = 0;
        } else {
            j = ql9Var.a;
        }
        p.append(j);
        p.append(", availableSize=");
        if (ql9Var != null) {
            j2 = ql9Var.c;
        }
        p.append(j2);
        ek9Var.b(p.toString());
    }

    public final void n() {
        nl9 nl9Var = this.r;
        nl9 nl9Var2 = this.s;
        ml9 ml9Var = new ml9(nl9Var, nl9Var2, this.b0, this.v);
        q qVar = (q) this.d.a;
        qVar.T = ml9Var;
        if (nl9Var2 != null) {
            wcd.i.b(nl9Var2);
        }
        qVar.z();
    }

    public final void o() {
        int i;
        int i2 = this.a0;
        long j = this.I;
        boolean z = this.z;
        tl9 tl9Var = new tl9(i2, j, this.J, this.q, z, this.y, this.w);
        q qVar = (q) this.d.a;
        tl9 tl9Var2 = qVar.S;
        int i3 = qVar.h;
        if (tl9Var2 == null) {
            i = 0;
        } else {
            i = tl9Var2.a;
        }
        qVar.S = tl9Var;
        if (i == 3 && i2 != 3) {
            qVar.t(true);
        }
        qVar.x0 = Math.max(qVar.x0, j);
        if (i2 != 3) {
            qVar.setRecordingUiFrameClockActive(false);
            qVar.x.setProgress(((float) j) / tl9Var.d);
        } else {
            if (!qVar.F0) {
                qVar.F0 = true;
                kk7.e().k(kk7.i1, 512);
            }
            qVar.o();
            qVar.setRecordingUiFrameClockActive(true);
            qVar.B();
            if (!qVar.i0) {
                qVar.i0 = true;
                kk7.f(i3).k(kk7.k2, Integer.valueOf(qVar.n), Boolean.FALSE);
            } else if (qVar.j0) {
                qVar.j0 = false;
                kk7.f(i3).k(kk7.o2, new Object[0]);
            }
        }
        if (i2 == 8 || i2 == 9 || i2 == 10) {
            qVar.g();
            qVar.x();
        }
        if (i == 3 && i2 == 4) {
            qVar.s(2);
        }
        qVar.z();
        if (qVar.W != null && !qVar.a0) {
            gl.d3(new po5(qVar, (byte) 1));
        }
        if (z && qVar.getWindowVisibility() != 0) {
            gl.d3(new po5(qVar, (byte) 2));
        }
    }

    public final void p() {
        y54 y54Var;
        v();
        if (this.a0 == 5 && (y54Var = this.W) != null) {
            y54Var.V(false);
            z(false);
            this.W.m();
            this.d.getClass();
        }
    }

    public final void q() {
        v();
        if (this.a0 != 3) {
            return;
        }
        this.I = j();
        this.P++;
        this.m.b("pause requested: durationMs=" + this.I);
        e();
        this.i.removeCallbacks(this.X);
        x(4);
        boolean W = this.l.W();
        this.E = W;
        if (!W) {
            h(new IllegalStateException("Unable to stop the camera segment"));
        }
    }

    public final void r() {
        y54 y54Var;
        v();
        if (this.a0 == 5 && (y54Var = this.W) != null) {
            long m = y54Var.m();
            long j = this.K;
            if (m < j || m >= this.L) {
                this.W.k1(j);
            }
            this.W.V(true);
            z(true);
        }
    }

    public final void s() {
        v();
        int i = this.a0;
        if (i == 10) {
            if (!this.F) {
                i();
            }
        } else if (i == 7) {
            if (this.G) {
                return;
            }
            this.G = true;
            this.m.b("release deferred: output is still finishing");
            e();
            t();
        } else if (i != 8) {
            a();
        } else {
            e();
            t();
            this.l.K();
            this.F = true;
            x(10);
            m("released");
            this.i.removeCallbacksAndMessages(null);
            this.j.shutdown();
            this.k.shutdown();
        }
    }

    public final void t() {
        this.i.removeCallbacks(this.Y);
        this.z = false;
        y54 y54Var = this.W;
        if (y54Var == null) {
            return;
        }
        y54Var.p0(this.Z);
        y54 y54Var2 = this.W;
        y54Var2.y1();
        ro5 ro5Var = this.b;
        if (ro5Var != null && ro5Var == y54Var2.X) {
            y54Var2.y1();
            y54Var2.i1();
            y54Var2.q1(null);
            y54Var2.f1(0, 0);
        }
        this.W.g1();
        this.W = null;
    }

    public final void u(File file, int i, long j, long j2, boolean z, int i2) {
        long nanoTime = System.nanoTime();
        ek9 ek9Var = this.m;
        StringBuilder o = ug8.o(j, "final range remux started: range=", "..");
        o.append(j2);
        o.append(", includeAudio=");
        o.append(z);
        o.append(", reason=");
        o.append(de9.z(i2));
        ek9Var.b(o.toString());
        g();
        k(this.T, i2);
        c(z);
        g();
        nk9 nk9Var = this.U;
        int i3 = i;
        short s = this.n.a;
        int i4 = this.o;
        if (i3 <= 0) {
            i3 = this.p.a;
        }
        dl9 a = cte.a(file, nk9Var, j, j2, z, new cl9(s, i4, i3));
        this.U.g();
        long h = this.U.h();
        ek9 ek9Var2 = this.m;
        StringBuilder o2 = ug8.o(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        o2.append(j2 - j);
        o2.append(", actualStartMs=");
        o2.append(a.a);
        o2.append(", mode=");
        o2.append(a.c);
        o2.append(", size=");
        o2.append(this.U.a.length());
        o2.append(", elapsedMs=");
        o2.append(f(nanoTime));
        ek9Var2.b(o2.toString());
        g();
        this.k.execute(new gl9(this, this.T, this.U.a, h, z));
    }

    public final void w(boolean z) {
        if (this.x != z) {
            this.x = z;
            ry4 ry4Var = this.f;
            if (ry4Var != null) {
                ((q) ry4Var.b).setScreenFlashEnabled(z);
            }
        }
    }

    public final void x(int i) {
        int i2 = this.a0;
        this.a0 = i;
        this.m.b("state: " + de9.A(i2) + " -> " + de9.A(i) + ", durationMs=" + j());
        o();
    }

    public final void y(float f) {
        v();
        if (this.a0 == 3 && !this.y) {
            this.l.T(Math.max(0.0f, Math.min(1.0f, f)));
        }
    }

    public final void z(boolean z) {
        if (this.z == z) {
            return;
        }
        this.z = z;
        Handler handler = this.i;
        bg7 bg7Var = this.Y;
        handler.removeCallbacks(bg7Var);
        if (z) {
            handler.post(bg7Var);
        }
        this.d.getClass();
        o();
    }
}
