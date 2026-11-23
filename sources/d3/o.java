package d3;

import a8.la;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import h2.l0;
import h9.t1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class o implements k0 {
    public h9.i0 f7768a;
    public e2.u f7769b;
    public long f7770c;
    public long d;
    public int f7771e;
    public Executor f7772f;
    public final t f7773g;

    public o(t tVar, Context context) {
        this.f7773g = tVar;
        l0.N(context);
        h9.g0 g0Var = h9.i0.f14035b;
        this.f7768a = t1.f14103e;
        this.d = -9223372036854775807L;
        this.f7772f = t.f7776q;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final Surface b() {
        la.p(false);
        throw null;
    }

    @Override
    public final void c(v vVar) {
        this.f7773g.f7780e.f7702j = vVar;
    }

    @Override
    public final void d(float f10) {
        t tVar = this.f7773g;
        tVar.f7783i.c(f10);
        tVar.f7780e.d(f10);
    }

    @Override
    public final void e() {
        t tVar = this.f7773g;
        if (tVar.d) {
            tVar.f7780e.e();
        }
    }

    @Override
    public final void f(Surface surface, h2.y yVar) {
        t tVar = this.f7773g;
        Pair pair = tVar.f7786l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((h2.y) tVar.f7786l.second).equals(yVar)) {
            return;
        }
        tVar.f7786l = Pair.create(surface, yVar);
        int i7 = yVar.f13869a;
    }

    @Override
    public final void g(d6.i iVar) {
        this.f7772f = m9.r.f20983a;
    }

    @Override
    public final void h() {
        t tVar = this.f7773g;
        if (tVar.d) {
            tVar.f7780e.h();
        }
    }

    @Override
    public final void i(long j3) {
        this.f7770c = j3;
    }

    @Override
    public final boolean j(e2.u uVar) {
        boolean z10;
        boolean z11;
        t tVar = this.f7773g;
        boolean z12 = true;
        if (tVar.f7788n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        la.p(z10);
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        int i7 = mVar.f10548c;
        if (i7 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        h2.g0 g0Var = tVar.f7781f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        tVar.f7785k = g0Var.a(myLooper, null);
                        tVar.f7778b.a();
                        throw null;
                    }
                }
            } catch (h2.m e10) {
                throw new j0(e10, uVar);
            }
        }
        if (i7 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z12 = false;
            }
        } else if (i7 == 7) {
            z12 = h2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z12 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            h2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i7 + " is not supported. Falling back to OpenGl tone mapping.");
            e2.m mVar2 = e2.m.h;
            h2.g0 g0Var2 = tVar.f7781f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            tVar.f7785k = g0Var2.a(myLooper2, null);
            tVar.f7778b.a();
            throw null;
        }
        if (i7 == 2 || i7 == 10) {
            e2.m mVar3 = e2.m.h;
        }
        h2.g0 g0Var22 = tVar.f7781f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        tVar.f7785k = g0Var22.a(myLooper22, null);
        tVar.f7778b.a();
        throw null;
    }

    @Override
    public final void k() {
        long j3 = this.d;
        t tVar = this.f7773g;
        if (tVar.f7789o >= j3) {
            tVar.f7780e.k();
        }
    }

    @Override
    public final void l(int i7) {
        this.f7773g.f7780e.l(i7);
    }

    @Override
    public final void m() {
        t tVar = this.f7773g;
        tVar.getClass();
        int i7 = h2.y.f13868c.f13869a;
        tVar.f7786l = null;
    }

    @Override
    public final boolean n(long j3, i iVar) {
        long j10;
        long j11;
        int i7;
        la.p(false);
        long j12 = j3 + this.f7770c;
        t tVar = this.f7773g;
        y yVar = tVar.f7783i;
        if (yVar.f7806a == -9223372036854775807L) {
            j11 = -9223372036854775807L;
        } else {
            j11 = (long) (((j12 - j10) * yVar.f7808c) + yVar.f7807b);
        }
        if (j11 != -9223372036854775807L) {
            long j13 = tVar.h;
            if (j13 != -9223372036854775807L && j11 < j13 && (i7 = this.f7771e) < 2) {
                this.f7771e = i7 + 1;
                l lVar = iVar.f7725c;
                u2.l lVar2 = iVar.f7723a;
                int i10 = iVar.f7724b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.e(i10);
                Trace.endSection();
                lVar.R0(0, 1);
                return true;
            }
        }
        int i11 = tVar.f7790p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void o(boolean z10) {
        this.d = -9223372036854775807L;
        t tVar = this.f7773g;
        e eVar = tVar.f7780e;
        if (tVar.f7788n == 1) {
            tVar.f7787m++;
            eVar.o(z10);
            while (tVar.f7784j.p() > 1) {
                tVar.f7784j.i();
            }
            if (tVar.f7784j.p() != 1) {
                tVar.f7789o = -9223372036854775807L;
                h2.i0 i0Var = tVar.f7785k;
                i0Var.getClass();
                i0Var.d(new ca.r(tVar, 7));
                return;
            }
            ((s) tVar.f7784j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void p(List list) {
        if (!this.f7768a.equals(list)) {
            this.f7768a = h9.i0.q(list);
            e2.u uVar = this.f7769b;
            if (uVar == null) {
                return;
            }
            e2.t a10 = uVar.a();
            e2.m mVar = uVar.I;
            if (mVar == null || !mVar.d()) {
                mVar = e2.m.h;
            }
            a10.H = mVar;
            a10.a();
            throw null;
        }
    }

    @Override
    public final void q(long j3, long j10) {
        this.f7773g.f7780e.q(j3 + this.f7770c, j10);
    }

    @Override
    public final void r(boolean z10) {
        t tVar = this.f7773g;
        if (tVar.d) {
            tVar.f7780e.r(z10);
        }
    }

    @Override
    public final void release() {
        t tVar = this.f7773g;
        if (tVar.f7788n == 2) {
            return;
        }
        h2.i0 i0Var = tVar.f7785k;
        if (i0Var != null) {
            i0Var.f13800a.removeCallbacksAndMessages(null);
        }
        tVar.f7786l = null;
        tVar.f7788n = 2;
    }

    @Override
    public final boolean s(boolean z10) {
        return this.f7773g.f7780e.f7695a.b(false);
    }

    @Override
    public final void u(e2.u uVar, long j3, int i7, List list) {
        la.p(false);
        this.f7768a = h9.i0.q(list);
        this.f7769b = uVar;
        e2.t a10 = uVar.a();
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        a10.H = mVar;
        a10.a();
        throw null;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void w() {
        t tVar = this.f7773g;
        if (tVar.f7784j.p() == 0) {
            tVar.f7780e.w();
            return;
        }
        h2.j0 j0Var = new h2.j0();
        if (tVar.f7784j.p() <= 0) {
            tVar.f7784j = j0Var;
        } else {
            ((s) tVar.f7784j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void t() {
    }
}
