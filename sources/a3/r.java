package a3;

import a8.yb;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import f9.s1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class r implements p0 {
    public f9.i0 f185a;
    public b2.x f186b;
    public long f187c;
    public long d;
    public int e;
    public Executor f188f;
    public final w f189g;

    public r(w wVar, Context context) {
        this.f189g = wVar;
        e2.n0.N(context);
        f9.g0 g0Var = f9.i0.f10286b;
        this.f185a = s1.e;
        this.d = -9223372036854775807L;
        this.f188f = w.f192q;
    }

    @Override
    public final void b(float f7) {
        w wVar = this.f189g;
        wVar.f198i.c(f7);
        wVar.e.b(f7);
    }

    @Override
    public final boolean c() {
        return false;
    }

    @Override
    public final Surface d() {
        yb.p(false);
        throw null;
    }

    @Override
    public final boolean e(b2.x xVar) {
        boolean z10;
        boolean z11;
        w wVar = this.f189g;
        boolean z12 = true;
        if (wVar.f203n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        yb.p(z10);
        b2.o oVar = xVar.I;
        if (oVar == null || !oVar.d()) {
            oVar = b2.o.h;
        }
        int i10 = oVar.f3302c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (i11 >= 33 && e2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        e2.g0 g0Var = wVar.f196f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        wVar.f200k = g0Var.a(myLooper, null);
                        wVar.f194b.a();
                        throw null;
                    }
                }
            } catch (e2.m e) {
                throw new o0(e, xVar);
            }
        }
        if (i10 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !e2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z12 = false;
            }
        } else if (i10 == 7) {
            z12 = e2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z12 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            e2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
            b2.o oVar2 = b2.o.h;
            e2.g0 g0Var2 = wVar.f196f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            wVar.f200k = g0Var2.a(myLooper2, null);
            wVar.f194b.a();
            throw null;
        }
        if (i10 == 2 || i10 == 10) {
            b2.o oVar3 = b2.o.h;
        }
        e2.g0 g0Var22 = wVar.f196f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        wVar.f200k = g0Var22.a(myLooper22, null);
        wVar.f194b.a();
        throw null;
    }

    @Override
    public final void f() {
        w wVar = this.f189g;
        if (wVar.d) {
            wVar.e.f();
        }
    }

    @Override
    public final void g() {
        w wVar = this.f189g;
        if (wVar.d) {
            wVar.e.g();
        }
    }

    @Override
    public final void h(long j10) {
        this.f187c = j10;
    }

    @Override
    public final void i() {
        long j10 = this.d;
        w wVar = this.f189g;
        if (wVar.f204o >= j10) {
            wVar.e.i();
        }
    }

    @Override
    public final void j(int i10) {
        this.f189g.e.j(i10);
    }

    @Override
    public final void k() {
        w wVar = this.f189g;
        wVar.getClass();
        int i10 = e2.y.f9734c.f9735a;
        wVar.f201l = null;
    }

    @Override
    public final void l(b2.x xVar, long j10, int i10, List list) {
        yb.p(false);
        this.f185a = f9.i0.u(list);
        this.f186b = xVar;
        b2.w a2 = xVar.a();
        b2.o oVar = xVar.I;
        if (oVar == null || !oVar.d()) {
            oVar = b2.o.h;
        }
        a2.H = oVar;
        a2.a();
        throw null;
    }

    @Override
    public final void m(b6.i iVar) {
        this.f188f = k9.r.f16490a;
    }

    @Override
    public final void n(boolean z10) {
        this.d = -9223372036854775807L;
        w wVar = this.f189g;
        f fVar = wVar.e;
        if (wVar.f203n == 1) {
            wVar.f202m++;
            fVar.n(z10);
            while (wVar.f199j.j() > 1) {
                wVar.f199j.f();
            }
            if (wVar.f199j.j() != 1) {
                wVar.f204o = -9223372036854775807L;
                e2.i0 i0Var = wVar.f200k;
                i0Var.getClass();
                i0Var.d(new d(wVar, 1));
                return;
            }
            ((v) wVar.f199j.f()).getClass();
            throw null;
        }
    }

    @Override
    public final boolean o(long j10, j jVar) {
        long j11;
        long j12;
        int i10;
        yb.p(false);
        long j13 = j10 + this.f187c;
        w wVar = this.f189g;
        b0 b0Var = wVar.f198i;
        if (b0Var.f69a == -9223372036854775807L) {
            j12 = -9223372036854775807L;
        } else {
            j12 = (long) (((j13 - j11) * b0Var.f71c) + b0Var.f70b);
        }
        if (j12 != -9223372036854775807L) {
            long j14 = wVar.h;
            if (j14 != -9223372036854775807L && j12 < j14 && (i10 = this.e) < 2) {
                this.e = i10 + 1;
                n nVar = jVar.f127c;
                r2.l lVar = jVar.f125a;
                int i11 = jVar.f126b;
                Trace.beginSection("dropVideoBuffer");
                lVar.f(i11);
                Trace.endSection();
                nVar.R0(0, 1);
                return true;
            }
        }
        int i12 = wVar.f205p;
        if (i12 == -1 || i12 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void p(List list) {
        if (!this.f185a.equals(list)) {
            this.f185a = f9.i0.u(list);
            b2.x xVar = this.f186b;
            if (xVar == null) {
                return;
            }
            b2.w a2 = xVar.a();
            b2.o oVar = xVar.I;
            if (oVar == null || !oVar.d()) {
                oVar = b2.o.h;
            }
            a2.H = oVar;
            a2.a();
            throw null;
        }
    }

    @Override
    public final void q(long j10, long j11) {
        this.f189g.e.q(j10 + this.f187c, j11);
    }

    @Override
    public final void r(boolean z10) {
        w wVar = this.f189g;
        if (wVar.d) {
            wVar.e.r(z10);
        }
    }

    @Override
    public final void release() {
        w wVar = this.f189g;
        if (wVar.f203n == 2) {
            return;
        }
        e2.i0 i0Var = wVar.f200k;
        if (i0Var != null) {
            i0Var.f9671a.removeCallbacksAndMessages(null);
        }
        wVar.f201l = null;
        wVar.f203n = 2;
    }

    @Override
    public final boolean s(boolean z10) {
        return this.f189g.e.f79a.b(false);
    }

    @Override
    public final void t(Surface surface, e2.y yVar) {
        w wVar = this.f189g;
        Pair pair = wVar.f201l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.y) wVar.f201l.second).equals(yVar)) {
            return;
        }
        wVar.f201l = Pair.create(surface, yVar);
        int i10 = yVar.f9735a;
    }

    @Override
    public final void v(y yVar) {
        this.f189g.e.f85j = yVar;
    }

    @Override
    public final boolean w() {
        return false;
    }

    @Override
    public final void x() {
        w wVar = this.f189g;
        if (wVar.f199j.j() == 0) {
            wVar.e.x();
            return;
        }
        e2.j0 j0Var = new e2.j0();
        if (wVar.f199j.j() <= 0) {
            wVar.f199j = j0Var;
        } else {
            ((v) wVar.f199j.f()).getClass();
            throw null;
        }
    }

    @Override
    public final void u() {
    }
}
