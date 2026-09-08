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
    public e9.i0 f198a;
    public b2.s f199b;
    public long f200c;
    public long d;
    public Executor f201e;
    public final w f202f;

    public r(w wVar, Context context) {
        this.f202f = wVar;
        e2.d0.L(context);
        e9.g0 g0Var = e9.i0.f8985b;
        this.f198a = a1.f8948e;
        this.d = -9223372036854775807L;
        this.f201e = w.f205o;
    }

    @Override
    public final void a(float f7) {
        this.f202f.f209e.a(f7);
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
        w wVar = this.f202f;
        boolean z12 = true;
        if (wVar.f215l == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        e2.d.g(z10);
        b2.j jVar = sVar.H;
        if (jVar == null || !jVar.d()) {
            jVar = b2.j.h;
        }
        int i10 = jVar.f2108c;
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
                        e2.x xVar = wVar.f210f;
                        Looper myLooper = Looper.myLooper();
                        e2.d.h(myLooper);
                        wVar.f212i = xVar.a(myLooper, null);
                        wVar.f207b.a();
                        throw null;
                    }
                }
            } catch (e2.k e7) {
                throw new n0(e7, sVar);
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
        e2.x xVar2 = wVar.f210f;
        Looper myLooper2 = Looper.myLooper();
        e2.d.h(myLooper2);
        wVar.f212i = xVar2.a(myLooper2, null);
        wVar.f207b.a();
        throw null;
    }

    @Override
    public final void e() {
        w wVar = this.f202f;
        if (wVar.d) {
            wVar.f209e.e();
        }
    }

    @Override
    public final void f() {
        w wVar = this.f202f;
        if (wVar.d) {
            wVar.f209e.f();
        }
    }

    @Override
    public final void g(a6.i iVar) {
        this.f201e = i9.q.f11946a;
    }

    @Override
    public final void h(long j3) {
        this.f200c = j3;
    }

    @Override
    public final void i() {
        long j3 = this.d;
        w wVar = this.f202f;
        if (wVar.f216m >= j3) {
            wVar.f209e.i();
        }
    }

    @Override
    public final void j(int i10) {
        this.f202f.f209e.j(i10);
    }

    @Override
    public final void k() {
        w wVar = this.f202f;
        wVar.getClass();
        int i10 = e2.w.f8820c.f8821a;
        wVar.f213j = null;
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        e2.d.g(false);
        this.f198a = e9.i0.v(list);
        this.f199b = sVar;
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
        w wVar = this.f202f;
        f fVar = wVar.f209e;
        if (wVar.f215l == 1) {
            wVar.f214k++;
            fVar.m(z10);
            while (wVar.h.i() > 1) {
                wVar.h.f();
            }
            if (wVar.h.i() != 1) {
                wVar.f216m = -9223372036854775807L;
                e2.z zVar = wVar.f212i;
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
        int i10 = this.f202f.f217n;
        if (i10 == -1 || i10 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final void o(List list) {
        if (!this.f198a.equals(list)) {
            this.f198a = e9.i0.v(list);
            b2.s sVar = this.f199b;
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
        this.f202f.f209e.p(j3 + this.f200c, j10);
    }

    @Override
    public final void q(boolean z10) {
        w wVar = this.f202f;
        if (wVar.d) {
            wVar.f209e.q(z10);
        }
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f202f.f209e.f102a.b(false);
    }

    @Override
    public final void release() {
        w wVar = this.f202f;
        if (wVar.f215l == 2) {
            return;
        }
        e2.z zVar = wVar.f212i;
        if (zVar != null) {
            zVar.f8826a.removeCallbacksAndMessages(null);
        }
        wVar.f213j = null;
        wVar.f215l = 2;
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        w wVar2 = this.f202f;
        Pair pair = wVar2.f213j;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((e2.w) wVar2.f213j.second).equals(wVar)) {
            return;
        }
        wVar2.f213j = Pair.create(surface, wVar);
        int i10 = wVar.f8821a;
    }

    @Override
    public final void u(y yVar) {
        this.f202f.f209e.f108i = yVar;
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void w() {
        w wVar = this.f202f;
        if (wVar.h.i() == 0) {
            wVar.f209e.w();
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
