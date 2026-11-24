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
public final class un9 {
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
    public volatile qn9 T;
    public volatile om9 U;
    public volatile File V;
    public h74 W;
    public final b40 Z;
    public final Context a;
    public final rq5 b;
    public final File c;
    public final lj4 d;
    public final rn9 e;
    public final wx4 f;
    public final bm9 l;
    public final fm9 m;
    public final sn9 n;
    public final int o;
    public final pn9 p;
    public final char q;
    public nn9 r;
    public nn9 s;
    public on9 t;
    public pn9 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new y30((byte) 7));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new y30((byte) 8));
    public int a0 = 1;
    public int b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final in9 X = new in9(this, (byte) 0);
    public final ei7 Y = new ei7(this, (byte) 21);

    public un9(ln9 ln9Var) {
        Context context;
        et8 et8Var = new et8(this, (byte) 7);
        this.Z = new b40(this, (byte) 1);
        v();
        Context context2 = ln9Var.a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.a = context;
        rq5 rq5Var = ln9Var.b;
        this.b = rq5Var;
        File file = ln9Var.c;
        this.c = file == null ? context.getCacheDir() : file;
        this.r = ln9Var.d;
        sn9 sn9Var = ln9Var.e;
        this.n = sn9Var;
        int i = ln9Var.h;
        this.o = i;
        on9 on9Var = ln9Var.f;
        pn9 pn9Var = ln9Var.g;
        this.p = pn9Var;
        this.q = (char) 60000;
        boolean z = ln9Var.i;
        this.d = ln9Var.j;
        this.e = ln9Var.k;
        this.f = ln9Var.l;
        fm9 fm9Var = new fm9();
        this.m = fm9Var;
        StringBuilder sb = new StringBuilder("session created: device=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append(", sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(", output=");
        sb.append((int) sn9Var.a);
        sb.append("x");
        ts2.v(sb, sn9Var.a, ", bitrate=", i, ", cameraMode=");
        sb.append(on9Var);
        sb.append(", fps=");
        sb.append((int) pn9Var.a);
        sb.append(", composition=");
        sb.append(z);
        sb.append(", facing=");
        sb.append(this.r);
        sb.append(", maxDurationMs=60000");
        fm9Var.b(sb.toString());
        this.l = new bm9(context, rq5Var, sn9Var, i, on9Var, pn9Var, z, fm9Var, et8Var);
    }

    public static long f(long j) {
        return (System.nanoTime() - j) / 1000000;
    }

    public static void v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        dq9.m("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        v();
        int i = this.a0;
        if (i != 10 && i != 8) {
            this.m.b("cancel requested: state=".concat(hg9.A(this.a0)));
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
            qn9 qn9Var = this.T;
            if (qn9Var != null && qn9Var.e && !z) {
                return false;
            }
            this.H = true;
            if (qn9Var != null && !qn9Var.d) {
                qn9Var.d = true;
                fm9 fm9Var = this.m;
                fm9Var.b("output generation invalidated: id=" + qn9Var.a + ", reason=" + hg9.z(i) + ", availableSize=" + qn9Var.c);
                this.k.execute(new hn9(this, qn9Var, i, (byte) 2));
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
            qn9 qn9Var = new qn9(j, d);
            this.T = qn9Var;
            this.U = new om9(d, this.n.a, z, this.m, new xr8(this, qn9Var, (byte) 12));
            fm9 fm9Var = this.m;
            fm9Var.b("output generation started: id=" + j + ", includeAudio=" + z + ", file=" + d.getName());
            this.k.execute(new ak8(this, qn9Var, d, (byte) 21));
        }
    }

    public final File d(String str) {
        File file = this.c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                zg.e(file, "Round-video output path is not a directory: ");
                return null;
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            zg.e(file, "Cannot create round-video output directory: ");
            return null;
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.w = false;
        bm9 bm9Var = this.l;
        bm9Var.T(0.0f);
        bm9Var.S(false);
        w(false);
    }

    public final void g() {
        if (!this.H) {
            return;
        }
        wa3.d("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i = this.a0;
        if (i != 9 && i != 10) {
            this.m.a("fatal error in state=".concat(hg9.A(this.a0)), exc);
            if (b(4, false)) {
                e();
                t();
                this.i.removeCallbacks(this.X);
                qn9 qn9Var = this.T;
                if (qn9Var != null) {
                    this.k.execute(new hn9(this, qn9Var, exc));
                }
                x(9);
                m("error");
                q qVar = (q) this.d.a;
                qVar.x();
                fc4.g(exc, true);
                mib mibVar = qVar.U;
                if (mibVar != null) {
                    mibVar.d(true);
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
                        nm7.f(qVar.h).k(nm7.m2, Integer.valueOf(qVar.n));
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
        in9 in9Var = new in9(this, (byte) 1);
        ExecutorService executorService = this.j;
        executorService.execute(in9Var);
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

    public final void k(qn9 qn9Var, int i) {
        synchronized (this.g) {
            if (!qn9Var.d && !qn9Var.e) {
                qn9Var.d = true;
                fm9 fm9Var = this.m;
                fm9Var.b("output generation invalidated: id=" + qn9Var.a + ", reason=" + hg9.z(i) + ", availableSize=" + qn9Var.c);
                this.k.execute(new hn9(this, qn9Var, i, (byte) 0));
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
        qn9 qn9Var = this.T;
        fm9 fm9Var = this.m;
        StringBuilder p = wi8.p("session summary: terminal=", str, ", state=");
        p.append(hg9.A(this.a0));
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
        if (qn9Var == null) {
            j = 0;
        } else {
            j = qn9Var.a;
        }
        p.append(j);
        p.append(", availableSize=");
        if (qn9Var != null) {
            j2 = qn9Var.c;
        }
        p.append(j2);
        fm9Var.b(p.toString());
    }

    public final void n() {
        nn9 nn9Var = this.r;
        nn9 nn9Var2 = this.s;
        mn9 mn9Var = new mn9(nn9Var, nn9Var2, this.b0, this.v);
        q qVar = (q) this.d.a;
        qVar.T = mn9Var;
        if (nn9Var2 != null) {
            yed.i.b(nn9Var2);
        }
        qVar.z();
    }

    public final void o() {
        int i;
        int i2 = this.a0;
        long j = this.I;
        boolean z = this.z;
        tn9 tn9Var = new tn9(i2, j, this.J, this.q, z, this.y, this.w);
        q qVar = (q) this.d.a;
        tn9 tn9Var2 = qVar.S;
        int i3 = qVar.h;
        if (tn9Var2 == null) {
            i = 0;
        } else {
            i = tn9Var2.a;
        }
        qVar.S = tn9Var;
        if (i == 3 && i2 != 3) {
            qVar.t(true);
        }
        qVar.x0 = Math.max(qVar.x0, j);
        if (i2 != 3) {
            qVar.setRecordingUiFrameClockActive(false);
            qVar.x.setProgress(((float) j) / tn9Var.d);
        } else {
            if (!qVar.F0) {
                qVar.F0 = true;
                nm7.e().k(nm7.j1, 512);
            }
            qVar.o();
            qVar.setRecordingUiFrameClockActive(true);
            qVar.B();
            if (!qVar.i0) {
                qVar.i0 = true;
                nm7.f(i3).k(nm7.l2, Integer.valueOf(qVar.n), Boolean.FALSE);
            } else if (qVar.j0) {
                qVar.j0 = false;
                nm7.f(i3).k(nm7.p2, new Object[0]);
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
            gm.c3(new pq5(qVar, (byte) 1));
        }
        if (z && qVar.getWindowVisibility() != 0) {
            gm.c3(new pq5(qVar, (byte) 2));
        }
    }

    public final void p() {
        h74 h74Var;
        v();
        if (this.a0 == 5 && (h74Var = this.W) != null) {
            h74Var.V(false);
            z(false);
            this.W.k();
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
        h74 h74Var;
        v();
        if (this.a0 == 5 && (h74Var = this.W) != null) {
            long k = h74Var.k();
            long j = this.K;
            if (k < j || k >= this.L) {
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
        h74 h74Var = this.W;
        if (h74Var == null) {
            return;
        }
        h74Var.p0(this.Z);
        h74 h74Var2 = this.W;
        h74Var2.y1();
        rq5 rq5Var = this.b;
        if (rq5Var != null && rq5Var == h74Var2.X) {
            h74Var2.y1();
            h74Var2.i1();
            h74Var2.q1(null);
            h74Var2.f1(0, 0);
        }
        this.W.g1();
        this.W = null;
    }

    public final void u(File file, int i, long j, long j2, boolean z, int i2) {
        long nanoTime = System.nanoTime();
        fm9 fm9Var = this.m;
        StringBuilder o = wi8.o(j, "final range remux started: range=", "..");
        o.append(j2);
        o.append(", includeAudio=");
        o.append(z);
        o.append(", reason=");
        o.append(hg9.z(i2));
        fm9Var.b(o.toString());
        g();
        k(this.T, i2);
        c(z);
        g();
        om9 om9Var = this.U;
        int i3 = i;
        short s = this.n.a;
        int i4 = this.o;
        if (i3 <= 0) {
            i3 = this.p.a;
        }
        dn9 a = fve.a(file, om9Var, j, j2, z, new cn9(s, i4, i3));
        this.U.g();
        long h = this.U.h();
        fm9 fm9Var2 = this.m;
        StringBuilder o2 = wi8.o(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        o2.append(j2 - j);
        o2.append(", actualStartMs=");
        o2.append(a.a);
        o2.append(", mode=");
        o2.append(a.c);
        o2.append(", size=");
        o2.append(this.U.a.length());
        o2.append(", elapsedMs=");
        o2.append(f(nanoTime));
        fm9Var2.b(o2.toString());
        g();
        this.k.execute(new gn9(this, this.T, this.U.a, h, z));
    }

    public final void w(boolean z) {
        if (this.x != z) {
            this.x = z;
            wx4 wx4Var = this.f;
            if (wx4Var != null) {
                ((q) wx4Var.b).setScreenFlashEnabled(z);
            }
        }
    }

    public final void x(int i) {
        int i2 = this.a0;
        this.a0 = i;
        this.m.b("state: " + hg9.A(i2) + " -> " + hg9.A(i) + ", durationMs=" + j());
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
        ei7 ei7Var = this.Y;
        handler.removeCallbacks(ei7Var);
        if (z) {
            handler.post(ei7Var);
        }
        this.d.getClass();
        o();
    }
}
