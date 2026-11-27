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
public final class jp9 {
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
    public volatile fp9 T;
    public volatile bo9 U;
    public volatile File V;
    public s64 W;
    public final c30 Z;
    public final Context a;
    public final uq5 b;
    public final File c;
    public final kj4 d;
    public final gp9 e;
    public final e05 f;
    public final on9 l;
    public final sn9 m;
    public final hp9 n;
    public final int o;
    public final ep9 p;
    public final char q;
    public cp9 r;
    public cp9 s;
    public dp9 t;
    public ep9 u;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;
    public final Object g = new Object();
    public final Matrix h = new Matrix();
    public final Handler i = new Handler(Looper.getMainLooper());
    public final ExecutorService j = Executors.newSingleThreadExecutor(new y20((byte) 7));
    public final ExecutorService k = Executors.newSingleThreadExecutor(new y20((byte) 8));
    public int a0 = 1;
    public int b0 = 1;
    public float v = 1.0f;
    public long M = 1;
    public final uo9 X = new uo9(this, (byte) 1);
    public final ki7 Y = new ki7(this, (byte) 21);

    public jp9(ap9 ap9Var) {
        Context context;
        pq8 pq8Var = new pq8(this, (byte) 10);
        this.Z = new c30(this, (byte) 1);
        v();
        Context context2 = ap9Var.a;
        Context applicationContext = context2.getApplicationContext();
        if (applicationContext == null) {
            context = context2;
        } else {
            context = applicationContext;
        }
        this.a = context;
        uq5 uq5Var = ap9Var.b;
        this.b = uq5Var;
        File file = ap9Var.c;
        this.c = file == null ? context.getCacheDir() : file;
        this.r = ap9Var.d;
        hp9 hp9Var = ap9Var.e;
        this.n = hp9Var;
        int i = ap9Var.h;
        this.o = i;
        dp9 dp9Var = ap9Var.f;
        ep9 ep9Var = ap9Var.g;
        this.p = ep9Var;
        this.q = (char) 60000;
        boolean z = ap9Var.i;
        this.d = ap9Var.j;
        this.e = ap9Var.k;
        this.f = ap9Var.l;
        sn9 sn9Var = new sn9();
        this.m = sn9Var;
        StringBuilder sb = new StringBuilder("session created: device=");
        sb.append(Build.MANUFACTURER);
        sb.append(" ");
        sb.append(Build.MODEL);
        sb.append(", sdk=");
        sb.append(Build.VERSION.SDK_INT);
        sb.append(", output=");
        sb.append((int) hp9Var.a);
        sb.append("x");
        bs2.w(sb, hp9Var.a, ", bitrate=", i, ", cameraMode=");
        sb.append(dp9Var);
        sb.append(", fps=");
        sb.append((int) ep9Var.a);
        sb.append(", composition=");
        sb.append(z);
        sb.append(", facing=");
        sb.append(this.r);
        sb.append(", maxDurationMs=60000");
        sn9Var.b(sb.toString());
        this.l = new on9(context, uq5Var, hp9Var, i, dp9Var, ep9Var, z, sn9Var, pq8Var);
    }

    public static long f(long j) {
        return (System.nanoTime() - j) / 1000000;
    }

    public static void v() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            return;
        }
        grb.i("RoundVideoSession must be used from the main thread");
    }

    public final boolean a() {
        v();
        int i = this.a0;
        if (i != 10 && i != 8) {
            this.m.b("cancel requested: state=".concat(uh9.A(this.a0)));
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
            fp9 fp9Var = this.T;
            if (fp9Var != null && fp9Var.e && !z) {
                return false;
            }
            this.H = true;
            if (fp9Var != null && !fp9Var.d) {
                fp9Var.d = true;
                sn9 sn9Var = this.m;
                sn9Var.b("output generation invalidated: id=" + fp9Var.a + ", reason=" + uh9.z(i) + ", availableSize=" + fp9Var.c);
                this.k.execute(new to9(this, fp9Var, i, (byte) 0));
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
            fp9 fp9Var = new fp9(j, d);
            this.T = fp9Var;
            this.U = new bo9(d, this.n.a, z, this.m, new m88(this, fp9Var, (byte) 26));
            sn9 sn9Var = this.m;
            sn9Var.b("output generation started: id=" + j + ", includeAudio=" + z + ", file=" + d.getName());
            this.k.execute(new sa8(this, fp9Var, d, (byte) 26));
        }
    }

    public final File d(String str) {
        File file = this.c;
        if (file.exists()) {
            if (!file.isDirectory()) {
                bg.e(file, "Round-video output path is not a directory: ");
                return null;
            }
        } else if (!file.mkdirs() && !file.isDirectory()) {
            bg.e(file, "Cannot create round-video output directory: ");
            return null;
        }
        return File.createTempFile(str, ".mp4", file);
    }

    public final void e() {
        this.w = false;
        on9 on9Var = this.l;
        on9Var.T(0.0f);
        on9Var.S(false);
        w(false);
    }

    public final void g() {
        if (!this.H) {
            return;
        }
        su3.e("Round-video operation was cancelled");
    }

    public final void h(Exception exc) {
        int i = this.a0;
        if (i != 9 && i != 10) {
            this.m.a("fatal error in state=".concat(uh9.A(this.a0)), exc);
            if (b(4, false)) {
                e();
                t();
                this.i.removeCallbacks(this.X);
                fp9 fp9Var = this.T;
                if (fp9Var != null) {
                    this.k.execute(new to9(this, fp9Var, exc));
                }
                x(9);
                m("error");
                q qVar = (q) this.d.b;
                qVar.x();
                cc4.g(exc, true);
                hkb hkbVar = qVar.U;
                if (hkbVar != null) {
                    hkbVar.d(true);
                }
                qVar.U = null;
                if (qVar.b0) {
                    qVar.b0 = false;
                    qVar.Q = null;
                } else {
                    MediaController.z().b0(false);
                    if (qVar.i0) {
                        qVar.s(6);
                    } else {
                        jn7.f(qVar.h).k(jn7.m2, Integer.valueOf(qVar.n));
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
        uo9 uo9Var = new uo9(this, (byte) 0);
        ExecutorService executorService = this.j;
        executorService.execute(uo9Var);
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

    public final void k(fp9 fp9Var, int i) {
        synchronized (this.g) {
            if (!fp9Var.d && !fp9Var.e) {
                fp9Var.d = true;
                sn9 sn9Var = this.m;
                sn9Var.b("output generation invalidated: id=" + fp9Var.a + ", reason=" + uh9.z(i) + ", availableSize=" + fp9Var.c);
                this.k.execute(new to9(this, fp9Var, i, (byte) 1));
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
        fp9 fp9Var = this.T;
        sn9 sn9Var = this.m;
        StringBuilder p = ik8.p("session summary: terminal=", str, ", state=");
        p.append(uh9.A(this.a0));
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
        if (fp9Var == null) {
            j = 0;
        } else {
            j = fp9Var.a;
        }
        p.append(j);
        p.append(", availableSize=");
        if (fp9Var != null) {
            j2 = fp9Var.c;
        }
        p.append(j2);
        sn9Var.b(p.toString());
    }

    public final void n() {
        cp9 cp9Var = this.r;
        cp9 cp9Var2 = this.s;
        bp9 bp9Var = new bp9(cp9Var, cp9Var2, this.b0, this.v);
        q qVar = (q) this.d.b;
        qVar.T = bp9Var;
        if (cp9Var2 != null) {
            phd.i.b(cp9Var2);
        }
        qVar.z();
    }

    public final void o() {
        int i;
        int i2 = this.a0;
        long j = this.I;
        boolean z = this.z;
        ip9 ip9Var = new ip9(i2, j, this.J, this.q, z, this.y, this.w);
        q qVar = (q) this.d.b;
        ip9 ip9Var2 = qVar.S;
        int i3 = qVar.h;
        if (ip9Var2 == null) {
            i = 0;
        } else {
            i = ip9Var2.a;
        }
        qVar.S = ip9Var;
        if (i == 3 && i2 != 3) {
            qVar.t(true);
        }
        qVar.x0 = Math.max(qVar.x0, j);
        if (i2 != 3) {
            qVar.setRecordingUiFrameClockActive(false);
            qVar.x.setProgress(((float) j) / ip9Var.d);
        } else {
            if (!qVar.F0) {
                qVar.F0 = true;
                jn7.e().k(jn7.j1, 512);
            }
            qVar.o();
            qVar.setRecordingUiFrameClockActive(true);
            qVar.B();
            if (!qVar.i0) {
                qVar.i0 = true;
                jn7.f(i3).k(jn7.l2, Integer.valueOf(qVar.n), Boolean.FALSE);
            } else if (qVar.j0) {
                qVar.j0 = false;
                jn7.f(i3).k(jn7.p2, new Object[0]);
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
            hl.c3(new sq5(qVar, (byte) 1));
        }
        if (z && qVar.getWindowVisibility() != 0) {
            hl.c3(new sq5(qVar, (byte) 2));
        }
    }

    public final void p() {
        s64 s64Var;
        v();
        if (this.a0 == 5 && (s64Var = this.W) != null) {
            s64Var.V(false);
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
        s64 s64Var;
        v();
        if (this.a0 == 5 && (s64Var = this.W) != null) {
            long k = s64Var.k();
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
        s64 s64Var = this.W;
        if (s64Var == null) {
            return;
        }
        s64Var.p0(this.Z);
        s64 s64Var2 = this.W;
        s64Var2.y1();
        uq5 uq5Var = this.b;
        if (uq5Var != null && uq5Var == s64Var2.X) {
            s64Var2.y1();
            s64Var2.i1();
            s64Var2.q1(null);
            s64Var2.f1(0, 0);
        }
        this.W.g1();
        this.W = null;
    }

    public final void u(File file, int i, long j, long j2, boolean z, int i2) {
        long nanoTime = System.nanoTime();
        sn9 sn9Var = this.m;
        StringBuilder o = ik8.o(j, "final range remux started: range=", "..");
        o.append(j2);
        o.append(", includeAudio=");
        o.append(z);
        o.append(", reason=");
        o.append(uh9.z(i2));
        sn9Var.b(o.toString());
        g();
        k(this.T, i2);
        c(z);
        g();
        bo9 bo9Var = this.U;
        int i3 = i;
        short s = this.n.a;
        int i4 = this.o;
        if (i3 <= 0) {
            i3 = this.p.a;
        }
        so9 a = uxe.a(file, bo9Var, j, j2, z, new ro9(s, i4, i3));
        this.U.g();
        long h = this.U.h();
        sn9 sn9Var2 = this.m;
        StringBuilder o2 = ik8.o(h, "final range remux completed: durationMs=", ", requestedDurationMs=");
        o2.append(j2 - j);
        o2.append(", actualStartMs=");
        o2.append(a.a);
        o2.append(", mode=");
        o2.append(a.c);
        o2.append(", size=");
        o2.append(this.U.a.length());
        o2.append(", elapsedMs=");
        o2.append(f(nanoTime));
        sn9Var2.b(o2.toString());
        g();
        this.k.execute(new yo9(this, this.T, this.U.a, h, z));
    }

    public final void w(boolean z) {
        if (this.x != z) {
            this.x = z;
            e05 e05Var = this.f;
            if (e05Var != null) {
                ((q) e05Var.b).setScreenFlashEnabled(z);
            }
        }
    }

    public final void x(int i) {
        int i2 = this.a0;
        this.a0 = i;
        this.m.b("state: " + uh9.A(i2) + " -> " + uh9.A(i) + ", durationMs=" + j());
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
        ki7 ki7Var = this.Y;
        handler.removeCallbacks(ki7Var);
        if (z) {
            handler.post(ki7Var);
        }
        this.d.getClass();
        o();
    }
}
