package d3;

import a8.ia;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import bi.ab;
import h2.m0;
import h9.t1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class p implements k0 {
    public h9.i0 f8068a;
    public e2.u f8069b;
    public long f8070c;
    public long d;
    public int f8071e;
    public Executor f8072f;
    public final u f8073g;

    public p(u uVar, Context context) {
        this.f8073g = uVar;
        m0.N(context);
        h9.g0 g0Var = h9.i0.f14329b;
        this.f8068a = t1.f14397e;
        this.d = -9223372036854775807L;
        this.f8072f = u.f8076q;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final Surface b() {
        ia.p(false);
        throw null;
    }

    @Override
    public final void c(w wVar) {
        this.f8073g.f8080e.f7990j = wVar;
    }

    @Override
    public final void d(float f10) {
        u uVar = this.f8073g;
        uVar.f8083i.c(f10);
        uVar.f8080e.d(f10);
    }

    @Override
    public final void e(cb.c cVar) {
        this.f8072f = m9.r.f19994a;
    }

    @Override
    public final void f() {
        u uVar = this.f8073g;
        if (uVar.d) {
            uVar.f8080e.f();
        }
    }

    @Override
    public final void g(Surface surface, h2.y yVar) {
        u uVar = this.f8073g;
        Pair pair = uVar.f8086l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((h2.y) uVar.f8086l.second).equals(yVar)) {
            return;
        }
        uVar.f8086l = Pair.create(surface, yVar);
        int i7 = yVar.f14166a;
    }

    @Override
    public final void h() {
        u uVar = this.f8073g;
        if (uVar.d) {
            uVar.f8080e.h();
        }
    }

    @Override
    public final void i(long j3) {
        this.f8070c = j3;
    }

    @Override
    public final boolean j(e2.u uVar) {
        boolean z9;
        boolean z10;
        u uVar2 = this.f8073g;
        boolean z11 = true;
        if (uVar2.f8088n == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.p(z9);
        e2.m mVar = uVar.I;
        if (mVar == null || !mVar.d()) {
            mVar = e2.m.h;
        }
        int i7 = mVar.f10365c;
        if (i7 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        h2.g0 g0Var = uVar2.f8081f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        uVar2.f8085k = g0Var.a(myLooper, null);
                        uVar2.f8078b.a();
                        throw null;
                    }
                }
            } catch (h2.m e10) {
                throw new j0(e10, uVar);
            }
        }
        if (i7 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !h2.e.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z11 = false;
            }
        } else if (i7 == 7) {
            z11 = h2.e.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z11 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            h2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i7 + " is not supported. Falling back to OpenGl tone mapping.");
            e2.m mVar2 = e2.m.h;
            h2.g0 g0Var2 = uVar2.f8081f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            uVar2.f8085k = g0Var2.a(myLooper2, null);
            uVar2.f8078b.a();
            throw null;
        }
        if (i7 == 2 || i7 == 10) {
            e2.m mVar3 = e2.m.h;
        }
        h2.g0 g0Var22 = uVar2.f8081f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        uVar2.f8085k = g0Var22.a(myLooper22, null);
        uVar2.f8078b.a();
        throw null;
    }

    @Override
    public final void k() {
        long j3 = this.d;
        u uVar = this.f8073g;
        if (uVar.f8089o >= j3) {
            uVar.f8080e.k();
        }
    }

    @Override
    public final void l(int i7) {
        this.f8073g.f8080e.l(i7);
    }

    @Override
    public final void m() {
        u uVar = this.f8073g;
        uVar.getClass();
        int i7 = h2.y.f14165c.f14166a;
        uVar.f8086l = null;
    }

    @Override
    public final boolean n(long j3, i iVar) {
        long j10;
        long j11;
        int i7;
        ia.p(false);
        long j12 = j3 + this.f8070c;
        u uVar = this.f8073g;
        z zVar = uVar.f8083i;
        if (zVar.f8106a == -9223372036854775807L) {
            j11 = -9223372036854775807L;
        } else {
            j11 = (long) (((j12 - j10) * zVar.f8108c) + zVar.f8107b);
        }
        if (j11 != -9223372036854775807L) {
            long j13 = uVar.h;
            if (j13 != -9223372036854775807L && j11 < j13 && (i7 = this.f8071e) < 2) {
                this.f8071e = i7 + 1;
                l lVar = iVar.f8019c;
                u2.l lVar2 = iVar.f8017a;
                int i10 = iVar.f8018b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.c(i10);
                Trace.endSection();
                lVar.R0(0, 1);
                return true;
            }
        }
        int i11 = uVar.f8090p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void o(boolean z9) {
        this.d = -9223372036854775807L;
        u uVar = this.f8073g;
        e eVar = uVar.f8080e;
        if (uVar.f8088n == 1) {
            uVar.f8087m++;
            eVar.o(z9);
            while (uVar.f8084j.p() > 1) {
                uVar.f8084j.i();
            }
            if (uVar.f8084j.p() != 1) {
                uVar.f8089o = -9223372036854775807L;
                h2.i0 i0Var = uVar.f8085k;
                i0Var.getClass();
                i0Var.d(new ab(uVar, 12));
                return;
            }
            ((t) uVar.f8084j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void p(List list) {
        if (!this.f8068a.equals(list)) {
            this.f8068a = h9.i0.q(list);
            e2.u uVar = this.f8069b;
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
        this.f8073g.f8080e.q(j3 + this.f8070c, j10);
    }

    @Override
    public final void r(boolean z9) {
        u uVar = this.f8073g;
        if (uVar.d) {
            uVar.f8080e.r(z9);
        }
    }

    @Override
    public final void release() {
        u uVar = this.f8073g;
        if (uVar.f8088n == 2) {
            return;
        }
        h2.i0 i0Var = uVar.f8085k;
        if (i0Var != null) {
            i0Var.f14096a.removeCallbacksAndMessages(null);
        }
        uVar.f8086l = null;
        uVar.f8088n = 2;
    }

    @Override
    public final boolean s(boolean z9) {
        return this.f8073g.f8080e.f7983a.b(false);
    }

    @Override
    public final void u(e2.u uVar, long j3, int i7, List list) {
        ia.p(false);
        this.f8068a = h9.i0.q(list);
        this.f8069b = uVar;
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
        u uVar = this.f8073g;
        if (uVar.f8084j.p() == 0) {
            uVar.f8080e.w();
            return;
        }
        h2.j0 j0Var = new h2.j0();
        if (uVar.f8084j.p() <= 0) {
            uVar.f8084j = j0Var;
        } else {
            ((t) uVar.f8084j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void t() {
    }
}
