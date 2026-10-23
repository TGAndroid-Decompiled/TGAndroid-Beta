package a3;

import android.view.Surface;
import b2.a2;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
import v7.u6;
public final class f implements p0 {
    public final a0 f79a;
    public final b0 f80b;
    public final g0 f81c;
    public final ArrayDeque d;
    public Surface e;
    public b2.w f82f;
    public long f83g;
    public n0 h;
    public Executor f84i;
    public y f85j;

    public f(a0 a0Var, b0 b0Var, e2.g0 g0Var) {
        this.f79a = a0Var;
        this.f80b = b0Var;
        a0Var.f64l = g0Var;
        this.f81c = new g0(new qf.b(this), a0Var, b0Var);
        this.d = new ArrayDeque();
        this.f82f = new b2.w(new b2.v());
        this.f83g = -9223372036854775807L;
        this.h = n0.f172g;
        this.f84i = new b(0);
        this.f85j = new Object();
    }

    @Override
    public final void a(float f7) {
        this.f79a.h(f7);
    }

    @Override
    public final boolean b() {
        g0 g0Var = this.f81c;
        long j10 = g0Var.f113j;
        if (j10 != -9223372036854775807L && g0Var.f112i == j10) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface c() {
        Surface surface = this.e;
        surface.getClass();
        return surface;
    }

    @Override
    public final boolean d(b2.w wVar) {
        return true;
    }

    @Override
    public final void e() {
        this.f80b.b();
        a0 a0Var = this.f79a;
        a0Var.d = false;
        a0Var.f61i = -9223372036854775807L;
        f0 f0Var = a0Var.f57b;
        f0Var.d = false;
        c0 c0Var = f0Var.f88c;
        if (c0Var != null) {
            c0Var.b();
        }
        f0Var.a();
    }

    @Override
    public final void f() {
        this.f80b.b();
        this.f79a.d();
    }

    @Override
    public final void g(a6.i iVar) {
        this.h = iVar;
        this.f84i = j9.r.f14401a;
    }

    @Override
    public final void h(long j10) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        g0 g0Var = this.f81c;
        if (g0Var.h == -9223372036854775807L) {
            g0Var.h = Long.MIN_VALUE;
            g0Var.f112i = Long.MIN_VALUE;
        }
        g0Var.f113j = g0Var.h;
    }

    @Override
    public final void j(int i10) {
        f0 f0Var = this.f79a.f57b;
        if (f0Var.f92j == i10) {
            return;
        }
        f0Var.f92j = i10;
        f0Var.d(true);
    }

    @Override
    public final void k() {
        this.e = null;
        this.f79a.g(null);
    }

    @Override
    public final void l(b2.w wVar, long j10, int i10, List list) {
        long j11;
        long j12;
        u6.p(list.isEmpty());
        int i11 = wVar.f4141z;
        int i12 = wVar.A;
        b2.w wVar2 = this.f82f;
        int i13 = wVar2.f4141z;
        g0 g0Var = this.f81c;
        if (i11 != i13 || i12 != wVar2.A) {
            e2.j0 j0Var = g0Var.d;
            long j13 = g0Var.h;
            if (j13 == -9223372036854775807L) {
                j11 = 0;
            } else {
                j11 = j13 + 1;
            }
            j0Var.a(new a2(i11, i12), j11);
        }
        float f7 = wVar.D;
        if (f7 != this.f82f.D) {
            this.f79a.f(f7);
        }
        this.f82f = wVar;
        if (j10 != this.f83g) {
            if (g0Var.f110f.f8287c == 0) {
                g0Var.f108b.e(i10);
                g0Var.f115l = j10;
            } else {
                e2.j0 j0Var2 = g0Var.e;
                long j14 = g0Var.h;
                if (j14 == -9223372036854775807L) {
                    j12 = -4611686018427387904L;
                } else {
                    j12 = j14 + 1;
                }
                j0Var2.a(Long.valueOf(j10), j12);
            }
            this.f83g = j10;
        }
    }

    @Override
    public final void m(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            a0 a0Var = this.f79a;
            a0Var.f57b.b();
            a0Var.h = -9223372036854775807L;
            a0Var.f59f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.f61i = -9223372036854775807L;
            a0Var.f66n = false;
        }
        this.f80b.b();
        g0 g0Var = this.f81c;
        e2.j0 j0Var = g0Var.d;
        e2.s sVar = g0Var.f110f;
        sVar.f8285a = 0;
        sVar.f8286b = -1;
        sVar.f8287c = 0;
        g0Var.h = -9223372036854775807L;
        g0Var.f112i = -9223372036854775807L;
        g0Var.f113j = -9223372036854775807L;
        e2.j0 j0Var2 = g0Var.e;
        if (j0Var2.j() > 0) {
            if (j0Var2.j() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            u6.g(z11);
            while (j0Var2.j() > 1) {
                j0Var2.f();
            }
            Object f7 = j0Var2.f();
            f7.getClass();
            g0Var.f115l = ((Long) f7).longValue();
        }
        if (j0Var.j() > 0) {
            if (j0Var.j() > 0) {
                z12 = true;
            }
            u6.g(z12);
            while (j0Var.j() > 1) {
                j0Var.f();
            }
            Object f10 = j0Var.f();
            f10.getClass();
            j0Var.a((a2) f10, 0L);
        }
        this.d.clear();
    }

    @Override
    public final boolean n(long j10, j jVar) {
        this.d.add(jVar);
        g0 g0Var = this.f81c;
        e2.s sVar = g0Var.f110f;
        int i10 = sVar.f8287c;
        long[] jArr = (long[]) sVar.e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i11 = sVar.f8285a;
                int i12 = length2 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) sVar.e, 0, jArr2, i12, i11);
                sVar.f8285a = 0;
                sVar.f8286b = sVar.f8287c - 1;
                sVar.e = jArr2;
                sVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (sVar.f8286b + 1) & sVar.d;
        sVar.f8286b = i13;
        ((long[]) sVar.e)[i13] = j10;
        sVar.f8287c++;
        g0Var.h = j10;
        g0Var.f113j = -9223372036854775807L;
        this.f84i.execute(new d(this, 0));
        return true;
    }

    @Override
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void p(long j10, long j11) {
        try {
            this.f81c.a(j10, j11);
        } catch (i2.m e) {
            throw new o0(e, this.f82f);
        }
    }

    @Override
    public final void q(boolean z10) {
        this.f79a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f79a.b(z10);
    }

    @Override
    public final void s(Surface surface, e2.y yVar) {
        this.e = surface;
        this.f79a.g(surface);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(y yVar) {
        this.f85j = yVar;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        a0 a0Var = this.f79a;
        if (a0Var.e == 0) {
            a0Var.e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
