package a3;

import android.view.Surface;
import b2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class f implements o0 {
    public final a0 f102a;
    public final f0 f103b;
    public final ArrayDeque f104c;
    public Surface d;
    public b2.s f105e;
    public long f106f;
    public m0 f107g;
    public Executor h;
    public y f108i;

    public f(a0 a0Var, e2.x xVar) {
        this.f102a = a0Var;
        a0Var.f70l = xVar;
        this.f103b = new f0(new n4.y(this), a0Var);
        this.f104c = new ArrayDeque();
        this.f105e = new b2.s(new b2.r());
        this.f106f = -9223372036854775807L;
        this.f107g = m0.f158g;
        this.h = new b(0);
        this.f108i = new Object();
    }

    @Override
    public final void a(float f7) {
        this.f102a.i(f7);
    }

    @Override
    public final boolean b() {
        f0 f0Var = this.f103b;
        long j3 = f0Var.f115i;
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
        this.f102a.e();
    }

    @Override
    public final void f() {
        this.f102a.d();
    }

    @Override
    public final void g(a6.i iVar) {
        this.f107g = iVar;
        this.h = i9.q.f11946a;
    }

    @Override
    public final void h(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void i() {
        f0 f0Var = this.f103b;
        if (f0Var.f114g == -9223372036854775807L) {
            f0Var.f114g = Long.MIN_VALUE;
            f0Var.h = Long.MIN_VALUE;
        }
        f0Var.f115i = f0Var.f114g;
    }

    @Override
    public final void j(int i10) {
        e0 e0Var = this.f102a.f62b;
        if (e0Var.f94j == i10) {
            return;
        }
        e0Var.f94j = i10;
        e0Var.d(true);
    }

    @Override
    public final void k() {
        this.d = null;
        this.f102a.h(null);
    }

    @Override
    public final void l(b2.s sVar, long j3, int i10, List list) {
        long j10;
        long j11;
        e2.d.g(list.isEmpty());
        int i11 = sVar.f2403y;
        int i12 = sVar.f2404z;
        b2.s sVar2 = this.f105e;
        int i13 = sVar2.f2403y;
        f0 f0Var = this.f103b;
        if (i11 != i13 || i12 != sVar2.f2404z) {
            e2.a0 a0Var = f0Var.d;
            long j12 = f0Var.f114g;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            a0Var.a(new x1(i11, i12), j10);
        }
        float f7 = sVar.C;
        if (f7 != this.f105e.C) {
            this.f102a.g(f7);
        }
        this.f105e = sVar;
        if (j3 != this.f106f) {
            if (f0Var.f113f.f8804c == 0) {
                f0Var.f110b.f(i10);
                f0Var.f117k = j3;
            } else {
                e2.a0 a0Var2 = f0Var.f112e;
                long j13 = f0Var.f114g;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                a0Var2.a(Long.valueOf(j3), j11);
            }
            this.f106f = j3;
        }
    }

    @Override
    public final void m(boolean z10) {
        boolean z11;
        if (z10) {
            a0 a0Var = this.f102a;
            e0 e0Var = a0Var.f62b;
            e0Var.f97m = 0L;
            e0Var.f100p = -1L;
            e0Var.f98n = -1L;
            a0Var.h = -9223372036854775807L;
            a0Var.f65f = -9223372036854775807L;
            a0Var.f64e = Math.min(a0Var.f64e, 1);
            a0Var.f67i = -9223372036854775807L;
        }
        f0 f0Var = this.f103b;
        e2.a0 a0Var2 = f0Var.d;
        e2.q qVar = f0Var.f113f;
        boolean z12 = false;
        qVar.f8802a = 0;
        qVar.f8803b = -1;
        qVar.f8804c = 0;
        f0Var.f114g = -9223372036854775807L;
        f0Var.h = -9223372036854775807L;
        f0Var.f115i = -9223372036854775807L;
        e2.a0 a0Var3 = f0Var.f112e;
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
            f0Var.f117k = ((Long) f7).longValue();
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
        this.f104c.clear();
    }

    @Override
    public final boolean n(long j3, j jVar) {
        this.f104c.add(jVar);
        f0 f0Var = this.f103b;
        e2.q qVar = f0Var.f113f;
        int i10 = qVar.f8804c;
        long[] jArr = (long[]) qVar.f8805e;
        if (i10 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i11 = qVar.f8802a;
                int i12 = length2 - i11;
                System.arraycopy(jArr, i11, jArr2, 0, i12);
                System.arraycopy((long[]) qVar.f8805e, 0, jArr2, i12, i11);
                qVar.f8802a = 0;
                qVar.f8803b = qVar.f8804c - 1;
                qVar.f8805e = jArr2;
                qVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i13 = (qVar.f8803b + 1) & qVar.d;
        qVar.f8803b = i13;
        ((long[]) qVar.f8805e)[i13] = j3;
        qVar.f8804c++;
        f0Var.f114g = j3;
        f0Var.f115i = -9223372036854775807L;
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
            this.f103b.a(j3, j10);
        } catch (i2.o e7) {
            throw new n0(e7, this.f105e);
        }
    }

    @Override
    public final void q(boolean z10) {
        this.f102a.c(z10);
    }

    @Override
    public final boolean r(boolean z10) {
        return this.f102a.b(z10);
    }

    @Override
    public final void s(Surface surface, e2.w wVar) {
        this.d = surface;
        this.f102a.h(surface);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(y yVar) {
        this.f108i = yVar;
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        a0 a0Var = this.f102a;
        if (a0Var.f64e == 0) {
            a0Var.f64e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
