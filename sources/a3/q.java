package a3;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import e9.a1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class q implements m0 {
    public e9.i0 f174a;
    public b2.s f175b;
    public long f176c;
    public long d;
    public Executor f177e;
    public final v f178f;

    public q(v vVar, Context context) {
        this.f178f = vVar;
        e2.d0.L(context);
        e9.g0 g0Var = e9.i0.f8957b;
        this.f174a = a1.f8920e;
        this.d = -9223372036854775807L;
        this.f177e = v.f181o;
    }

    @Override
    public final void a(float f7) {
        this.f178f.f185e.a(f7);
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final Surface c() {
        e2.d.g(false);
        throw null;
    }

    @Override
    public final boolean d(b2.s sVar) {
        boolean z10;
        boolean z11;
        v vVar = this.f178f;
        boolean z12 = true;
        if (vVar.f191l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        int i10 = jVar.f2081c;
        if (i10 == 7) {
            try {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (i11 >= 33 && e2.a.j("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        e2.x xVar = vVar.f186f;
                        Looper myLooper = Looper.myLooper();
                        e2.d.h(myLooper);
                        vVar.f188i = xVar.a(myLooper, null);
                        vVar.f183b.a();
                        throw null;
                    }
                }
            } catch (e2.k e7) {
                throw new l0(e7, sVar);
            }
        }
        if (i10 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !e2.a.j("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z12 = false;
            }
        } else if (i10 == 7) {
            z12 = e2.a.j("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z12 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            e2.a.n("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
            b2.j jVar2 = b2.j.h;
        }
        e2.x xVar2 = vVar.f186f;
        Looper myLooper2 = Looper.myLooper();
        e2.d.h(myLooper2);
        vVar.f188i = xVar2.a(myLooper2, null);
        vVar.f183b.a();
        throw null;
    }

    @Override
    public final void e() {
        v vVar = this.f178f;
        if (vVar.d) {
            vVar.f185e.e();
        }
    }

    @Override
    public final void f() {
        v vVar = this.f178f;
        if (vVar.d) {
            vVar.f185e.f();
        }
    }

    @Override
    public final void g(a6.i iVar) {
        this.f177e = i9.q.f11920a;
    }

    @Override
    public final void h(long j3) {
        this.f176c = j3;
    }

    @Override
    public final void i() {
        long j3 = this.d;
        v vVar = this.f178f;
        if (vVar.f192m >= j3) {
            vVar.f185e.i();
        }
    }

    @Override
    public final void j(int i10) {
        this.f178f.f185e.j(i10);
    }

    @Override
    public final void k() {
        v vVar = this.f178f;
        vVar.getClass();
        int i10 = e2.w.f8792c.f8793a;
        vVar.f189j = null;
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        e2.d.g(false);
        this.f174a = e9.i0.v(list);
        this.f175b = sVar;
        b2.r a2 = sVar.a();
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        a2.G = jVar;
        a2.a();
        throw null;
    }

    @Override
    public final void m(boolean z10) {
        this.d = -9223372036854775807L;
        v vVar = this.f178f;
        e eVar = vVar.f185e;
        if (vVar.f191l == 1) {
            vVar.f190k++;
            eVar.m(z10);
            while (vVar.h.i() > 1) {
                vVar.h.f();
            }
            if (vVar.h.i() != 1) {
                vVar.f192m = -9223372036854775807L;
                e2.z zVar = vVar.f188i;
                e2.d.h(zVar);
                zVar.c(new c(vVar, 1));
                return;
            }
            ((u) vVar.h.f()).getClass();
            throw null;
        }
    }

    @Override
    public final boolean n(long j3, i iVar) {
        e2.d.g(false);
        int i10 = this.f178f.f193n;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void o(List list) {
        if (!this.f174a.equals(list)) {
            this.f174a = e9.i0.v(list);
            b2.s sVar = this.f175b;
            if (sVar == null) {
                return;
            }
            b2.r a2 = sVar.a();
            b2.j jVar = sVar.H;
            if (jVar == null || !jVar.d()) {
                jVar = b2.j.h;
            }
            a2.G = jVar;
            a2.a();
            throw null;
        }
    }

    @Override
    public final void p(long j3, long j10) {
        this.f178f.f185e.p(j3 + this.f176c, j10);
    }

    @Override
    public final void q(boolean z10) {
        v vVar = this.f178f;
        if (vVar.d) {
            vVar.f185e.q(z10);
        }
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f178f.f185e.f78a.b(false);
    }

    @Override
    public final void release() {
        v vVar = this.f178f;
        if (vVar.f191l == 2) {
            return;
        }
        e2.z zVar = vVar.f188i;
        if (zVar != null) {
            zVar.f8798a.removeCallbacksAndMessages(null);
        }
        vVar.f189j = null;
        vVar.f191l = 2;
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        v vVar = this.f178f;
        Pair pair = vVar.f189j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.w) vVar.f189j.second).equals(wVar)) {
            return;
        }
        vVar.f189j = Pair.create(surface, wVar);
        int i10 = wVar.f8793a;
    }

    @Override
    public final void u(x xVar) {
        this.f178f.f185e.f84i = xVar;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void w() {
        v vVar = this.f178f;
        if (vVar.h.i() == 0) {
            vVar.f185e.w();
            return;
        }
        e2.a0 a0Var = new e2.a0();
        if (vVar.h.i() <= 0) {
            vVar.h = a0Var;
        } else {
            ((u) vVar.h.f()).getClass();
            throw null;
        }
    }

    @Override
    public final void t() {
    }
}
