package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class tf8 implements fgc {
    public po5 a;
    public ko4 b;
    public long c;
    public int d;
    public Executor e;
    public final xf8 f;

    public tf8(xf8 xf8Var, Context context) {
        this.f = xf8Var;
        gcc.O(context);
        no5 no5Var = po5.b;
        this.a = j99.e;
        this.e = xf8.q;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final Surface b() {
        yve.p(false);
        throw null;
    }

    @Override
    public final void c(Surface surface, rma rmaVar) {
        xf8 xf8Var = this.f;
        Pair pair = xf8Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((rma) xf8Var.l.second).equals(rmaVar)) {
            return;
        }
        xf8Var.l = Pair.create(surface, rmaVar);
        int i = rmaVar.a;
    }

    @Override
    public final void d(float f) {
        xf8 xf8Var = this.f;
        xf8Var.i.c(f);
        xf8Var.e.d(f);
    }

    @Override
    public final void e() {
        xf8 xf8Var = this.f;
        if (xf8Var.d) {
            xf8Var.e.e();
        }
    }

    @Override
    public final void f() {
        xf8 xf8Var = this.f;
        if (xf8Var.d) {
            xf8Var.e.f();
        }
    }

    @Override
    public final void g(ko4 ko4Var, long j, int i, List list) {
        yve.p(false);
        this.a = po5.q(list);
        this.b = ko4Var;
        jo4 a = ko4Var.a();
        bm2 bm2Var = ko4Var.L;
        if (bm2Var == null || !bm2Var.d()) {
            bm2Var = bm2.h;
        }
        a.K = bm2Var;
        new ko4(a);
        throw null;
    }

    @Override
    public final void h(long j) {
        this.c = j;
    }

    @Override
    public final void i(v34 v34Var) {
        this.e = mo3.a;
    }

    @Override
    public final void j() {
        xf8 xf8Var = this.f;
        if (xf8Var.o >= -9223372036854775807L) {
            xf8Var.e.j();
        }
    }

    @Override
    public final void k(int i) {
        this.f.e.k(i);
    }

    @Override
    public final void l() {
        int i = rma.c.a;
        this.f.l = null;
    }

    @Override
    public final boolean m(long j, ym6 ym6Var) {
        long j2;
        long j3;
        int i;
        yve.p(false);
        long j4 = j + this.c;
        xf8 xf8Var = this.f;
        vec vecVar = xf8Var.i;
        if (vecVar.a == -9223372036854775807L) {
            j3 = -9223372036854775807L;
        } else {
            j3 = (long) (((j4 - j2) * vecVar.c) + vecVar.b);
        }
        if (j3 != -9223372036854775807L) {
            long j5 = xf8Var.h;
            if (j5 != -9223372036854775807L && j3 < j5 && (i = this.d) < 2) {
                this.d = i + 1;
                bn6 bn6Var = ym6Var.c;
                jm6 jm6Var = ym6Var.a;
                int i2 = ym6Var.b;
                Trace.beginSection("dropVideoBuffer");
                jm6Var.c(i2);
                Trace.endSection();
                bn6Var.Y0(0, 1);
                return true;
            }
        }
        int i3 = xf8Var.p;
        if (i3 == -1 || i3 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final boolean n(ko4 ko4Var) {
        boolean z;
        boolean z2;
        xf8 xf8Var = this.f;
        boolean z3 = true;
        if (xf8Var.n == 0) {
            z = true;
        } else {
            z = false;
        }
        yve.p(z);
        bm2 bm2Var = ko4Var.L;
        if (bm2Var == null || !bm2Var.d()) {
            bm2Var = bm2.h;
        }
        int i = bm2Var.c;
        if (i == 7) {
            try {
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 34) {
                    if (i2 >= 33 && one.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (z2) {
                        vgb vgbVar = xf8Var.f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        xf8Var.k = vgbVar.a(myLooper, null);
                        xf8Var.b.a();
                        throw null;
                    }
                }
            } catch (gy4 e) {
                throw new egc(e, ko4Var);
            }
        }
        if (i == 6) {
            if (Build.VERSION.SDK_INT < 33 || !one.b("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z3 = false;
            }
        } else if (i == 7) {
            z3 = one.b("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z3 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            efd.f("PlaybackVidGraphWrapper", "Color transfer " + i + " is not supported. Falling back to OpenGl tone mapping.");
            bm2 bm2Var2 = bm2.h;
        } else if (i == 2 || i == 10) {
            bm2 bm2Var3 = bm2.h;
        }
        vgb vgbVar2 = xf8Var.f;
        Looper myLooper2 = Looper.myLooper();
        myLooper2.getClass();
        xf8Var.k = vgbVar2.a(myLooper2, null);
        xf8Var.b.a();
        throw null;
    }

    @Override
    public final void o(boolean z) {
        jq jqVar;
        xf8 xf8Var = this.f;
        pd3 pd3Var = xf8Var.e;
        if (xf8Var.n == 1) {
            xf8Var.m++;
            pd3Var.o(z);
            while (true) {
                int p = xf8Var.j.p();
                jqVar = xf8Var.j;
                if (p <= 1) {
                    break;
                }
                jqVar.i();
            }
            if (jqVar.p() != 1) {
                xf8Var.o = -9223372036854775807L;
                xgb xgbVar = xf8Var.k;
                xgbVar.getClass();
                xgbVar.e(new x38(xf8Var, (byte) 26));
                return;
            }
            ((wf8) xf8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void p(List list) {
        if (!this.a.equals(list)) {
            this.a = po5.q(list);
            ko4 ko4Var = this.b;
            if (ko4Var == null) {
                return;
            }
            jo4 a = ko4Var.a();
            bm2 bm2Var = ko4Var.L;
            if (bm2Var == null || !bm2Var.d()) {
                bm2Var = bm2.h;
            }
            a.K = bm2Var;
            new ko4(a);
            throw null;
        }
    }

    @Override
    public final void q(long j, long j2) {
        this.f.e.q(j + this.c, j2);
    }

    @Override
    public final void r(boolean z) {
        xf8 xf8Var = this.f;
        if (xf8Var.d) {
            xf8Var.e.r(z);
        }
    }

    @Override
    public final void release() {
        xf8 xf8Var = this.f;
        if (xf8Var.n == 2) {
            return;
        }
        xgb xgbVar = xf8Var.k;
        if (xgbVar != null) {
            xgbVar.f();
        }
        xf8Var.l = null;
        xf8Var.n = (byte) 2;
    }

    @Override
    public final boolean s(boolean z) {
        return this.f.e.a.b(false);
    }

    @Override
    public final void t(sec secVar) {
        this.f.e.k = secVar;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void w() {
        xf8 xf8Var = this.f;
        if (xf8Var.j.p() == 0) {
            xf8Var.e.w();
            return;
        }
        jq jqVar = new jq();
        if (xf8Var.j.p() <= 0) {
            xf8Var.j = jqVar;
        } else {
            ((wf8) xf8Var.j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void u() {
    }
}
