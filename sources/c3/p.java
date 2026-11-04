package c3;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.os.Trace;
import android.util.Pair;
import android.view.Surface;
import b8.zb;
import g2.n0;
import g9.s1;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
public final class p implements l0 {
    public g9.i0 f4096a;
    public d2.v f4097b;
    public long f4098c;
    public long d;
    public int f4099e;
    public Executor f4100f;
    public final u f4101g;

    public p(u uVar, Context context) {
        this.f4101g = uVar;
        n0.N(context);
        g9.g0 g0Var = g9.i0.f12083b;
        this.f4096a = s1.f12146e;
        this.d = -9223372036854775807L;
        this.f4100f = u.f4104q;
    }

    @Override
    public final boolean a() {
        return false;
    }

    @Override
    public final void b(float f10) {
        u uVar = this.f4101g;
        uVar.f4111i.c(f10);
        uVar.f4108e.b(f10);
    }

    @Override
    public final Surface c() {
        zb.p(false);
        throw null;
    }

    @Override
    public final void d() {
        u uVar = this.f4101g;
        if (uVar.d) {
            uVar.f4108e.d();
        }
    }

    @Override
    public final boolean e(d2.v vVar) {
        boolean z10;
        boolean z11;
        u uVar = this.f4101g;
        boolean z12 = true;
        if (uVar.f4116n == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.p(z10);
        d2.n nVar = vVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = d2.n.h;
        }
        int i3 = nVar.f8230c;
        if (i3 == 7) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 34) {
                    if (i10 >= 33 && g2.f.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        g2.h0 h0Var = uVar.f4109f;
                        Looper myLooper = Looper.myLooper();
                        myLooper.getClass();
                        uVar.f4113k = h0Var.a(myLooper, null);
                        uVar.f4106b.a();
                        throw null;
                    }
                }
            } catch (g2.n e10) {
                throw new k0(e10, vVar);
            }
        }
        if (i3 == 6) {
            if (Build.VERSION.SDK_INT < 33 || !g2.f.d("EGL_EXT_gl_colorspace_bt2020_pq")) {
                z12 = false;
            }
        } else if (i3 == 7) {
            z12 = g2.f.d("EGL_EXT_gl_colorspace_bt2020_hlg");
        }
        if (!z12 && Build.VERSION.SDK_INT >= 29) {
            Locale locale = Locale.US;
            g2.a.l("PlaybackVidGraphWrapper", "Color transfer " + i3 + " is not supported. Falling back to OpenGl tone mapping.");
            d2.n nVar2 = d2.n.h;
            g2.h0 h0Var2 = uVar.f4109f;
            Looper myLooper2 = Looper.myLooper();
            myLooper2.getClass();
            uVar.f4113k = h0Var2.a(myLooper2, null);
            uVar.f4106b.a();
            throw null;
        }
        if (i3 == 2 || i3 == 10) {
            d2.n nVar3 = d2.n.h;
        }
        g2.h0 h0Var22 = uVar.f4109f;
        Looper myLooper22 = Looper.myLooper();
        myLooper22.getClass();
        uVar.f4113k = h0Var22.a(myLooper22, null);
        uVar.f4106b.a();
        throw null;
    }

    @Override
    public final void f(d2.v vVar, long j10, int i3, List list) {
        zb.p(false);
        this.f4096a = g9.i0.q(list);
        this.f4097b = vVar;
        d2.u a10 = vVar.a();
        d2.n nVar = vVar.I;
        if (nVar == null || !nVar.d()) {
            nVar = d2.n.h;
        }
        a10.H = nVar;
        a10.a();
        throw null;
    }

    @Override
    public final void g() {
        u uVar = this.f4101g;
        if (uVar.d) {
            uVar.f4108e.g();
        }
    }

    @Override
    public final void h(long j10) {
        this.f4098c = j10;
    }

    @Override
    public final void i() {
        long j10 = this.d;
        u uVar = this.f4101g;
        if (uVar.f4117o >= j10) {
            uVar.f4108e.i();
        }
    }

    @Override
    public final void j(int i3) {
        this.f4101g.f4108e.j(i3);
    }

    @Override
    public final void k() {
        u uVar = this.f4101g;
        uVar.getClass();
        int i3 = g2.z.f11926c.f11927a;
        uVar.f4114l = null;
    }

    @Override
    public final void l(boolean z10) {
        this.d = -9223372036854775807L;
        u uVar = this.f4101g;
        e eVar = uVar.f4108e;
        if (uVar.f4116n == 1) {
            uVar.f4115m++;
            eVar.l(z10);
            while (uVar.f4112j.p() > 1) {
                uVar.f4112j.i();
            }
            if (uVar.f4112j.p() != 1) {
                uVar.f4117o = -9223372036854775807L;
                g2.j0 j0Var = uVar.f4113k;
                j0Var.getClass();
                j0Var.d(new ai.s(uVar, 20));
                return;
            }
            ((t) uVar.f4112j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void m(List list) {
        if (!this.f4096a.equals(list)) {
            this.f4096a = g9.i0.q(list);
            d2.v vVar = this.f4097b;
            if (vVar == null) {
                return;
            }
            d2.u a10 = vVar.a();
            d2.n nVar = vVar.I;
            if (nVar == null || !nVar.d()) {
                nVar = d2.n.h;
            }
            a10.H = nVar;
            a10.a();
            throw null;
        }
    }

    @Override
    public final void n(long j10, long j11) {
        this.f4101g.f4108e.n(j10 + this.f4098c, j11);
    }

    @Override
    public final void o(Surface surface, g2.z zVar) {
        u uVar = this.f4101g;
        Pair pair = uVar.f4114l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((g2.z) uVar.f4114l.second).equals(zVar)) {
            return;
        }
        uVar.f4114l = Pair.create(surface, zVar);
        int i3 = zVar.f11927a;
    }

    @Override
    public final void p(w wVar) {
        this.f4101g.f4108e.f4014j = wVar;
    }

    @Override
    public final void q(boolean z10) {
        u uVar = this.f4101g;
        if (uVar.d) {
            uVar.f4108e.q(z10);
        }
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f4101g.f4108e.f4007a.b(false);
    }

    @Override
    public final void release() {
        u uVar = this.f4101g;
        if (uVar.f4116n == 2) {
            return;
        }
        g2.j0 j0Var = uVar.f4113k;
        if (j0Var != null) {
            j0Var.f11857a.removeCallbacksAndMessages(null);
        }
        uVar.f4114l = null;
        uVar.f4116n = 2;
    }

    @Override
    public final boolean t(long j10, i iVar) {
        long j11;
        long j12;
        int i3;
        zb.p(false);
        long j13 = j10 + this.f4098c;
        u uVar = this.f4101g;
        z zVar = uVar.f4111i;
        if (zVar.f4134a == -9223372036854775807L) {
            j12 = -9223372036854775807L;
        } else {
            j12 = (long) (((j13 - j11) * zVar.f4136c) + zVar.f4135b);
        }
        if (j12 != -9223372036854775807L) {
            long j14 = uVar.h;
            if (j14 != -9223372036854775807L && j12 < j14 && (i3 = this.f4099e) < 2) {
                this.f4099e = i3 + 1;
                l lVar = iVar.f4047c;
                t2.l lVar2 = iVar.f4045a;
                int i10 = iVar.f4046b;
                Trace.beginSection("dropVideoBuffer");
                lVar2.c(i10);
                Trace.endSection();
                lVar.R0(0, 1);
                return true;
            }
        }
        int i11 = uVar.f4118p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void v() {
        u uVar = this.f4101g;
        if (uVar.f4112j.p() == 0) {
            uVar.f4108e.v();
            return;
        }
        g2.k0 k0Var = new g2.k0();
        if (uVar.f4112j.p() <= 0) {
            uVar.f4112j = k0Var;
        } else {
            ((t) uVar.f4112j.i()).getClass();
            throw null;
        }
    }

    @Override
    public final void w(c6.i iVar) {
        this.f4100f = l9.r.f18162a;
    }

    @Override
    public final void s() {
    }
}
