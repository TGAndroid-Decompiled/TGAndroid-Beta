package a3;

import android.view.Surface;
import b2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class f implements o0 {
    public final a0 f97a;
    public final f0 f98b;
    public final ArrayDeque f99c;
    public Surface d;
    public b2.s e;
    public long f100f;
    public m0 f101g;
    public Executor h;
    public y f102i;

    public f(a0 a0Var, e2.x xVar) {
        this.f97a = a0Var;
        a0Var.f67l = xVar;
        ?? obj = new Object();
        obj.f15218b = this;
        this.f98b = new f0(obj, a0Var);
        this.f99c = new ArrayDeque();
        this.e = new b2.s(new b2.r());
        this.f100f = -9223372036854775807L;
        this.f101g = m0.f147g;
        this.h = new b(0);
        this.f102i = new Object();
    }

    @Override
    public final void a(float f7) {
        this.f97a.i(f7);
    }

    @Override
    public final boolean b() {
        f0 f0Var = this.f98b;
        long j3 = f0Var.f108i;
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
        this.f97a.e();
    }

    @Override
    public final void f() {
        this.f97a.d();
    }

    @Override
    public final void g(a6.i iVar) {
        this.f101g = iVar;
        this.h = i9.q.f11053a;
    }

    @Override
    public final void h(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        f0 f0Var = this.f98b;
        if (f0Var.f107g == -9223372036854775807L) {
            f0Var.f107g = Long.MIN_VALUE;
            f0Var.h = Long.MIN_VALUE;
        }
        f0Var.f108i = f0Var.f107g;
    }

    @Override
    public final void j(int i10) {
        e0 e0Var = this.f97a.f60b;
        if (e0Var.f89j == i10) {
            return;
        }
        e0Var.f89j = i10;
        e0Var.d(true);
    }

    @Override
    public final void k() {
        this.d = null;
        this.f97a.h(null);
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        long j10;
        long j11;
        e2.d.g(list.isEmpty());
        int i11 = sVar.f3315y;
        int i12 = sVar.f3316z;
        b2.s sVar2 = this.e;
        int i13 = sVar2.f3315y;
        f0 f0Var = this.f98b;
        if (i11 != i13 || i12 != sVar2.f3316z) {
            e2.a0 a0Var = f0Var.d;
            long j12 = f0Var.f107g;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            a0Var.a(new x1(i11, i12), j10);
        }
        float f7 = sVar.C;
        if (f7 != this.e.C) {
            this.f97a.g(f7);
        }
        this.e = sVar;
        if (j3 != this.f100f) {
            if (f0Var.f106f.f7924c == 0) {
                f0Var.f104b.f(i10);
                f0Var.f110k = j3;
            } else {
                e2.a0 a0Var2 = f0Var.e;
                long j13 = f0Var.f107g;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                a0Var2.a(Long.valueOf(j3), j11);
            }
            this.f100f = j3;
        }
    }

    @Override
    public final void m(boolean z10) {
        boolean z11;
        if (z10) {
            a0 a0Var = this.f97a;
            e0 e0Var = a0Var.f60b;
            e0Var.f92m = 0L;
            e0Var.f95p = -1L;
            e0Var.f93n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f62f = -9223372036854775807L;
            a0Var.e = Math.min(a0Var.e, 1);
            a0Var.f64i = -9223372036854775807L;
        }
        f0 f0Var = this.f98b;
        e2.a0 a0Var2 = f0Var.d;
        e2.q qVar = f0Var.f106f;
        boolean z12 = false;
        qVar.f7922a = 0;
        qVar.f7923b = -1;
        qVar.f7924c = 0;
        f0Var.f107g = -9223372036854775807L;
        f0Var.h = -9223372036854775807L;
        f0Var.f108i = -9223372036854775807L;
        e2.a0 a0Var3 = f0Var.e;
        if (a0Var3.i() > 0) {
            if (a0Var3.i() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e2.d.b(z11);
            while (a0Var3.i() > 1) {
                a0Var3.f();
            }
            Object f7 = a0Var3.f();
            f7.getClass();
            f0Var.f110k = ((Long) f7).longValue();
        }
        if (a0Var2.i() > 0) {
            if (a0Var2.i() > 0) {
                z12 = true;
            }
            e2.d.b(z12);
            while (a0Var2.i() > 1) {
                a0Var2.f();
            }
            Object f10 = a0Var2.f();
            f10.getClass();
            a0Var2.a((x1) f10, 0L);
        }
        this.f99c.clear();
    }

    @Override
    public final boolean n(long j3, j jVar) {
        this.f99c.add(jVar);
        f0 f0Var = this.f98b;
        e2.q qVar = f0Var.f106f;
        int i10 = qVar.f7924c;
        long[] jArr = (long[]) qVar.e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i11 = qVar.f7922a;
                int i12 = length2 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) qVar.e, 0, jArr2, i12, i11);
                qVar.f7922a = 0;
                qVar.f7923b = qVar.f7924c - 1;
                qVar.e = jArr2;
                qVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (qVar.f7923b + 1) & qVar.d;
        qVar.f7923b = i13;
        ((long[]) qVar.e)[i13] = j3;
        qVar.f7924c++;
        f0Var.f107g = j3;
        f0Var.f108i = -9223372036854775807L;
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
            this.f98b.a(j3, j10);
        } catch (i2.n e) {
            throw new n0(e, this.e);
        }
    }

    @Override
    public final void q(boolean z10) {
        this.f97a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f97a.b(z10);
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        this.d = surface;
        this.f97a.h(surface);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(y yVar) {
        this.f102i = yVar;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        a0 a0Var = this.f97a;
        if (a0Var.e == 0) {
            a0Var.e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
