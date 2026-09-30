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
public final class r implements o0 {
    public e9.i0 f184a;
    public b2.s f185b;
    public long f186c;
    public long d;
    public Executor e;
    public final w f187f;

    public r(w wVar, Context context) {
        this.f187f = wVar;
        e2.d0.L(context);
        e9.g0 g0Var = e9.i0.f8066b;
        this.f184a = a1.e;
        this.d = -9223372036854775807L;
        this.e = w.f190o;
    }

    @Override
    public final void a(float f7) {
        this.f187f.e.a(f7);
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
        w wVar = this.f187f;
        boolean z12 = true;
        if (wVar.f199l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        int i10 = jVar.f3027c;
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
                        e2.x xVar = wVar.f194f;
                        Looper myLooper = Looper.myLooper();
                        e2.d.h(myLooper);
                        wVar.f196i = xVar.a(myLooper, null);
                        wVar.f192b.a();
                        throw null;
                    }
                }
            } catch (e2.k e) {
                throw new n0(e, sVar);
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
        e2.x xVar2 = wVar.f194f;
        Looper myLooper2 = Looper.myLooper();
        e2.d.h(myLooper2);
        wVar.f196i = xVar2.a(myLooper2, null);
        wVar.f192b.a();
        throw null;
    }

    @Override
    public final void e() {
        w wVar = this.f187f;
        if (wVar.d) {
            wVar.e.e();
        }
    }

    @Override
    public final void f() {
        w wVar = this.f187f;
        if (wVar.d) {
            wVar.e.f();
        }
    }

    @Override
    public final void g(a6.i iVar) {
        this.e = i9.q.f11039a;
    }

    @Override
    public final void h(long j3) {
        this.f186c = j3;
    }

    @Override
    public final void i() {
        long j3 = this.d;
        w wVar = this.f187f;
        if (wVar.f200m >= j3) {
            wVar.e.i();
        }
    }

    @Override
    public final void j(int i10) {
        this.f187f.e.j(i10);
    }

    @Override
    public final void k() {
        w wVar = this.f187f;
        wVar.getClass();
        int i10 = e2.w.f7919c.f7920a;
        wVar.f197j = null;
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        e2.d.g(false);
        this.f184a = e9.i0.v(list);
        this.f185b = sVar;
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
        w wVar = this.f187f;
        f fVar = wVar.e;
        if (wVar.f199l == 1) {
            wVar.f198k++;
            fVar.m(z10);
            while (wVar.h.i() > 1) {
                wVar.h.f();
            }
            if (wVar.h.i() != 1) {
                wVar.f200m = -9223372036854775807L;
                e2.z zVar = wVar.f196i;
                e2.d.h(zVar);
                zVar.c(new d(wVar, 1));
                return;
            }
            ((v) wVar.h.f()).getClass();
            throw null;
        }
    }

    @Override
    public final boolean n(long j3, j jVar) {
        e2.d.g(false);
        int i10 = this.f187f.f201n;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void o(List list) {
        if (!this.f184a.equals(list)) {
            this.f184a = e9.i0.v(list);
            b2.s sVar = this.f185b;
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
        this.f187f.e.p(j3 + this.f186c, j10);
    }

    @Override
    public final void q(boolean z10) {
        w wVar = this.f187f;
        if (wVar.d) {
            wVar.e.q(z10);
        }
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f187f.e.f97a.b(false);
    }

    @Override
    public final void release() {
        w wVar = this.f187f;
        if (wVar.f199l == 2) {
            return;
        }
        e2.z zVar = wVar.f196i;
        if (zVar != null) {
            zVar.f7925a.removeCallbacksAndMessages(null);
        }
        wVar.f197j = null;
        wVar.f199l = 2;
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        w wVar2 = this.f187f;
        Pair pair = wVar2.f197j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.w) wVar2.f197j.second).equals(wVar)) {
            return;
        }
        wVar2.f197j = Pair.create(surface, wVar);
        int i10 = wVar.f7920a;
    }

    @Override
    public final void u(y yVar) {
        this.f187f.e.f102i = yVar;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void w() {
        w wVar = this.f187f;
        if (wVar.h.i() == 0) {
            wVar.e.w();
            return;
        }
        e2.a0 a0Var = new e2.a0();
        if (wVar.h.i() <= 0) {
            wVar.h = a0Var;
        } else {
            ((v) wVar.h.f()).getClass();
            throw null;
        }
    }

    @Override
    public final void t() {
    }
}
