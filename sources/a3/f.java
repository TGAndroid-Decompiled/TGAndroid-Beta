package a3;

import android.view.Surface;
import b2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class f implements o0 {
    public final a0 f104a;
    public final f0 f105b;
    public final ArrayDeque f106c;
    public Surface d;
    public b2.s f107e;
    public long f108f;
    public m0 f109g;
    public Executor h;
    public y f110i;

    public f(a0 a0Var, e2.x xVar) {
        this.f104a = a0Var;
        a0Var.f72l = xVar;
        this.f105b = new f0(new n4.x(this), a0Var);
        this.f106c = new ArrayDeque();
        this.f107e = new b2.s(new b2.r());
        this.f108f = -9223372036854775807L;
        this.f109g = m0.f160g;
        this.h = new b(0);
        this.f110i = new Object();
    }

    @Override
    public final void a(float f7) {
        this.f104a.i(f7);
    }

    @Override
    public final boolean b() {
        f0 f0Var = this.f105b;
        long j3 = f0Var.f117i;
        if (j3 != -9223372036854775807L && f0Var.h == j3) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface c() {
        Surface surface = this.d;
        e2.d.h(surface);
        return surface;
    }

    @Override
    public final boolean d(b2.s sVar) {
        return true;
    }

    @Override
    public final void e() {
        this.f104a.e();
    }

    @Override
    public final void f() {
        this.f104a.d();
    }

    @Override
    public final void g(a6.i iVar) {
        this.f109g = iVar;
        this.h = i9.q.f12074a;
    }

    @Override
    public final void h(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        f0 f0Var = this.f105b;
        if (f0Var.f116g == -9223372036854775807L) {
            f0Var.f116g = Long.MIN_VALUE;
            f0Var.h = Long.MIN_VALUE;
        }
        f0Var.f117i = f0Var.f116g;
    }

    @Override
    public final void j(int i10) {
        e0 e0Var = this.f104a.f64b;
        if (e0Var.f96j == i10) {
            return;
        }
        e0Var.f96j = i10;
        e0Var.d(true);
    }

    @Override
    public final void k() {
        this.d = null;
        this.f104a.h(null);
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        long j10;
        long j11;
        e2.d.g(list.isEmpty());
        int i11 = sVar.f3649y;
        int i12 = sVar.f3650z;
        b2.s sVar2 = this.f107e;
        int i13 = sVar2.f3649y;
        f0 f0Var = this.f105b;
        if (i11 != i13 || i12 != sVar2.f3650z) {
            e2.a0 a0Var = f0Var.d;
            long j12 = f0Var.f116g;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            a0Var.a(new x1(i11, i12), j10);
        }
        float f7 = sVar.C;
        if (f7 != this.f107e.C) {
            this.f104a.g(f7);
        }
        this.f107e = sVar;
        if (j3 != this.f108f) {
            if (f0Var.f115f.f8570c == 0) {
                f0Var.f112b.f(i10);
                f0Var.f119k = j3;
            } else {
                e2.a0 a0Var2 = f0Var.f114e;
                long j13 = f0Var.f116g;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                a0Var2.a(Long.valueOf(j3), j11);
            }
            this.f108f = j3;
        }
    }

    @Override
    public final void m(boolean z10) {
        boolean z11;
        if (z10) {
            a0 a0Var = this.f104a;
            e0 e0Var = a0Var.f64b;
            e0Var.f99m = 0L;
            e0Var.f102p = -1L;
            e0Var.f100n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f67f = -9223372036854775807L;
            a0Var.f66e = Math.min(a0Var.f66e, 1);
            a0Var.f69i = -9223372036854775807L;
        }
        f0 f0Var = this.f105b;
        e2.a0 a0Var2 = f0Var.d;
        e2.q qVar = f0Var.f115f;
        boolean z12 = false;
        qVar.f8568a = 0;
        qVar.f8569b = -1;
        qVar.f8570c = 0;
        f0Var.f116g = -9223372036854775807L;
        f0Var.h = -9223372036854775807L;
        f0Var.f117i = -9223372036854775807L;
        e2.a0 a0Var3 = f0Var.f114e;
        if (a0Var3.m() > 0) {
            if (a0Var3.m() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e2.d.b(z11);
            while (a0Var3.m() > 1) {
                a0Var3.h();
            }
            Object h = a0Var3.h();
            h.getClass();
            f0Var.f119k = ((Long) h).longValue();
        }
        if (a0Var2.m() > 0) {
            if (a0Var2.m() > 0) {
                z12 = true;
            }
            e2.d.b(z12);
            while (a0Var2.m() > 1) {
                a0Var2.h();
            }
            Object h10 = a0Var2.h();
            h10.getClass();
            a0Var2.a((x1) h10, 0L);
        }
        this.f106c.clear();
    }

    @Override
    public final boolean n(long j3, j jVar) {
        this.f106c.add(jVar);
        f0 f0Var = this.f105b;
        e2.q qVar = f0Var.f115f;
        int i10 = qVar.f8570c;
        long[] jArr = (long[]) qVar.f8571e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i11 = qVar.f8568a;
                int i12 = length2 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) qVar.f8571e, 0, jArr2, i12, i11);
                qVar.f8568a = 0;
                qVar.f8569b = qVar.f8570c - 1;
                qVar.f8571e = jArr2;
                qVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (qVar.f8569b + 1) & qVar.d;
        qVar.f8569b = i13;
        ((long[]) qVar.f8571e)[i13] = j3;
        qVar.f8570c++;
        f0Var.f116g = j3;
        f0Var.f117i = -9223372036854775807L;
        this.h.execute(new d(this, 0));
        return true;
    }

    @Override
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void p(long j3, long j10) {
        try {
            this.f105b.a(j3, j10);
        } catch (i2.n e7) {
            throw new n0(e7, this.f107e);
        }
    }

    @Override
    public final void q(boolean z10) {
        this.f104a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f104a.b(z10);
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        this.d = surface;
        this.f104a.h(surface);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(y yVar) {
        this.f110i = yVar;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        a0 a0Var = this.f104a;
        if (a0Var.f66e == 0) {
            a0Var.f66e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
