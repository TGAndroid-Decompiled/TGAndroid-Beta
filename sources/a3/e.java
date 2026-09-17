package a3;

import android.view.Surface;
import b2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class e implements m0 {
    public final z f78a;
    public final e0 f79b;
    public final ArrayDeque f80c;
    public Surface d;
    public b2.s f81e;
    public long f82f;
    public k0 f83g;
    public Executor h;
    public x f84i;

    public e(z zVar, e2.x xVar) {
        this.f78a = zVar;
        zVar.f205l = xVar;
        this.f79b = new e0(new n4.y(this), zVar);
        this.f80c = new ArrayDeque();
        this.f81e = new b2.s(new b2.r());
        this.f82f = -9223372036854775807L;
        this.f83g = k0.f132g;
        this.h = new a(0);
        this.f84i = new Object();
    }

    @Override
    public final void a(float f7) {
        this.f78a.i(f7);
    }

    @Override
    public final boolean b() {
        e0 e0Var = this.f79b;
        long j3 = e0Var.f91i;
        if (j3 != -9223372036854775807L && e0Var.h == j3) {
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
        this.f78a.e();
    }

    @Override
    public final void f() {
        this.f78a.d();
    }

    @Override
    public final void g(a6.i iVar) {
        this.f83g = iVar;
        this.h = i9.q.f11920a;
    }

    @Override
    public final void h(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        e0 e0Var = this.f79b;
        if (e0Var.f90g == -9223372036854775807L) {
            e0Var.f90g = Long.MIN_VALUE;
            e0Var.h = Long.MIN_VALUE;
        }
        e0Var.f91i = e0Var.f90g;
    }

    @Override
    public final void j(int i10) {
        d0 d0Var = this.f78a.f197b;
        if (d0Var.f70j == i10) {
            return;
        }
        d0Var.f70j = i10;
        d0Var.d(true);
    }

    @Override
    public final void k() {
        this.d = null;
        this.f78a.h(null);
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        long j10;
        long j11;
        e2.d.g(list.isEmpty());
        int i11 = sVar.f2376y;
        int i12 = sVar.f2377z;
        b2.s sVar2 = this.f81e;
        int i13 = sVar2.f2376y;
        e0 e0Var = this.f79b;
        if (i11 != i13 || i12 != sVar2.f2377z) {
            e2.a0 a0Var = e0Var.d;
            long j12 = e0Var.f90g;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            a0Var.a(new x1(i11, i12), j10);
        }
        float f7 = sVar.C;
        if (f7 != this.f81e.C) {
            this.f78a.g(f7);
        }
        this.f81e = sVar;
        if (j3 != this.f82f) {
            if (e0Var.f89f.f8776c == 0) {
                e0Var.f86b.f(i10);
                e0Var.f93k = j3;
            } else {
                e2.a0 a0Var2 = e0Var.f88e;
                long j13 = e0Var.f90g;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                a0Var2.a(Long.valueOf(j3), j11);
            }
            this.f82f = j3;
        }
    }

    @Override
    public final void m(boolean z10) {
        boolean z11;
        if (z10) {
            z zVar = this.f78a;
            d0 d0Var = zVar.f197b;
            d0Var.f73m = 0L;
            d0Var.f76p = -1L;
            d0Var.f74n = -1L;
            zVar.h = -9223372036854775807L;
            zVar.f200f = -9223372036854775807L;
            zVar.f199e = Math.min(zVar.f199e, 1);
            zVar.f202i = -9223372036854775807L;
        }
        e0 e0Var = this.f79b;
        e2.a0 a0Var = e0Var.d;
        e2.q qVar = e0Var.f89f;
        boolean z12 = false;
        qVar.f8774a = 0;
        qVar.f8775b = -1;
        qVar.f8776c = 0;
        e0Var.f90g = -9223372036854775807L;
        e0Var.h = -9223372036854775807L;
        e0Var.f91i = -9223372036854775807L;
        e2.a0 a0Var2 = e0Var.f88e;
        if (a0Var2.i() > 0) {
            if (a0Var2.i() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            e2.d.b(z11);
            while (a0Var2.i() > 1) {
                a0Var2.f();
            }
            Object f7 = a0Var2.f();
            f7.getClass();
            e0Var.f93k = ((Long) f7).longValue();
        }
        if (a0Var.i() > 0) {
            if (a0Var.i() > 0) {
                z12 = true;
            }
            e2.d.b(z12);
            while (a0Var.i() > 1) {
                a0Var.f();
            }
            Object f10 = a0Var.f();
            f10.getClass();
            a0Var.a((x1) f10, 0L);
        }
        this.f80c.clear();
    }

    @Override
    public final boolean n(long j3, i iVar) {
        this.f80c.add(iVar);
        e0 e0Var = this.f79b;
        e2.q qVar = e0Var.f89f;
        int i10 = qVar.f8776c;
        long[] jArr = (long[]) qVar.f8777e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i11 = qVar.f8774a;
                int i12 = length2 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) qVar.f8777e, 0, jArr2, i12, i11);
                qVar.f8774a = 0;
                qVar.f8775b = qVar.f8776c - 1;
                qVar.f8777e = jArr2;
                qVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (qVar.f8775b + 1) & qVar.d;
        qVar.f8775b = i13;
        ((long[]) qVar.f8777e)[i13] = j3;
        qVar.f8776c++;
        e0Var.f90g = j3;
        e0Var.f91i = -9223372036854775807L;
        this.h.execute(new c(this, 0));
        return true;
    }

    @Override
    public final void o(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void p(long j3, long j10) {
        try {
            this.f79b.a(j3, j10);
        } catch (i2.o e7) {
            throw new l0(e7, this.f81e);
        }
    }

    @Override
    public final void q(boolean z10) {
        this.f78a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f78a.b(z10);
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        this.d = surface;
        this.f78a.h(surface);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(x xVar) {
        this.f84i = xVar;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        z zVar = this.f78a;
        if (zVar.f199e == 0) {
            zVar.f199e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
