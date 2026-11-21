package d3;

import a8.la;
import android.view.Surface;
import e2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class e implements k0 {
    public final x f7692a;
    public final y f7693b;
    public final d0 f7694c;
    public final ArrayDeque d;
    public Surface f7695e;
    public e2.u f7696f;
    public long f7697g;
    public i0 h;
    public Executor f7698i;
    public v f7699j;

    public e(x xVar, y yVar, h2.g0 g0Var) {
        this.f7692a = xVar;
        this.f7693b = yVar;
        xVar.f7799l = g0Var;
        this.f7694c = new d0(new q4.q(this), xVar, yVar);
        this.d = new ArrayDeque();
        this.f7696f = new e2.u(new e2.t());
        this.f7697g = -9223372036854775807L;
        this.h = i0.f7723k;
        this.f7698i = new b(0);
        this.f7699j = new Object();
    }

    @Override
    public final boolean a() {
        d0 d0Var = this.f7694c;
        long j3 = d0Var.f7689j;
        if (j3 != -9223372036854775807L && d0Var.f7688i == j3) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface b() {
        Surface surface = this.f7695e;
        surface.getClass();
        return surface;
    }

    @Override
    public final void c(v vVar) {
        this.f7699j = vVar;
    }

    @Override
    public final void d(float f10) {
        this.f7692a.h(f10);
    }

    @Override
    public final void e() {
        this.f7693b.b();
        x xVar = this.f7692a;
        xVar.d = false;
        xVar.f7796i = -9223372036854775807L;
        c0 c0Var = xVar.f7791b;
        c0Var.d = false;
        z zVar = c0Var.f7665c;
        if (zVar != null) {
            zVar.b();
        }
        c0Var.a();
    }

    @Override
    public final void f(Surface surface, h2.y yVar) {
        this.f7695e = surface;
        this.f7692a.g(surface);
    }

    @Override
    public final void g(d6.i iVar) {
        this.h = iVar;
        this.f7698i = m9.r.f20980a;
    }

    @Override
    public final void h() {
        this.f7693b.b();
        this.f7692a.d();
    }

    @Override
    public final void i(long j3) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final boolean j(e2.u uVar) {
        return true;
    }

    @Override
    public final void k() {
        d0 d0Var = this.f7694c;
        if (d0Var.h == -9223372036854775807L) {
            d0Var.h = Long.MIN_VALUE;
            d0Var.f7688i = Long.MIN_VALUE;
        }
        d0Var.f7689j = d0Var.h;
    }

    @Override
    public final void l(int i7) {
        c0 c0Var = this.f7692a.f7791b;
        if (c0Var.f7670j == i7) {
            return;
        }
        c0Var.f7670j = i7;
        c0Var.d(true);
    }

    @Override
    public final void m() {
        this.f7695e = null;
        this.f7692a.g(null);
    }

    @Override
    public final boolean n(long j3, i iVar) {
        this.d.add(iVar);
        d0 d0Var = this.f7694c;
        h2.s sVar = d0Var.f7686f;
        int i7 = sVar.f13848c;
        long[] jArr = (long[]) sVar.f13849e;
        if (i7 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i10 = sVar.f13846a;
                int i11 = length2 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy((long[]) sVar.f13849e, 0, jArr2, i11, i10);
                sVar.f13846a = 0;
                sVar.f13847b = sVar.f13848c - 1;
                sVar.f13849e = jArr2;
                sVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i12 = (sVar.f13847b + 1) & sVar.d;
        sVar.f13847b = i12;
        ((long[]) sVar.f13849e)[i12] = j3;
        sVar.f13848c++;
        d0Var.h = j3;
        d0Var.f7689j = -9223372036854775807L;
        this.f7698i.execute(new ca.r(this, 6));
        return true;
    }

    @Override
    public final void o(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            x xVar = this.f7692a;
            xVar.f7791b.b();
            xVar.h = -9223372036854775807L;
            xVar.f7794f = -9223372036854775807L;
            xVar.f7793e = Math.min(xVar.f7793e, 1);
            xVar.f7796i = -9223372036854775807L;
            xVar.f7801n = false;
        }
        this.f7693b.b();
        d0 d0Var = this.f7694c;
        h2.j0 j0Var = d0Var.d;
        h2.s sVar = d0Var.f7686f;
        sVar.f13846a = 0;
        sVar.f13847b = -1;
        sVar.f13848c = 0;
        d0Var.h = -9223372036854775807L;
        d0Var.f7688i = -9223372036854775807L;
        d0Var.f7689j = -9223372036854775807L;
        h2.j0 j0Var2 = d0Var.f7685e;
        if (j0Var2.p() > 0) {
            if (j0Var2.p() > 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            la.f(z11);
            while (j0Var2.p() > 1) {
                j0Var2.i();
            }
            Object i7 = j0Var2.i();
            i7.getClass();
            d0Var.f7691l = ((Long) i7).longValue();
        }
        if (j0Var.p() > 0) {
            if (j0Var.p() > 0) {
                z12 = true;
            }
            la.f(z12);
            while (j0Var.p() > 1) {
                j0Var.i();
            }
            Object i10 = j0Var.i();
            i10.getClass();
            j0Var.a((x1) i10, 0L);
        }
        this.d.clear();
    }

    @Override
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void q(long j3, long j10) {
        try {
            this.f7694c.a(j3, j10);
        } catch (l2.l e10) {
            throw new j0(e10, this.f7696f);
        }
    }

    @Override
    public final void r(boolean z10) {
        this.f7692a.c(z10);
    }

    @Override
    public final boolean s(boolean z10) {
        return this.f7692a.b(z10);
    }

    @Override
    public final void t() {
        throw new UnsupportedOperationException();
    }

    @Override
    public final void u(e2.u uVar, long j3, int i7, List list) {
        long j10;
        long j11;
        la.p(list.isEmpty());
        int i10 = uVar.f10801z;
        int i11 = uVar.A;
        e2.u uVar2 = this.f7696f;
        int i12 = uVar2.f10801z;
        d0 d0Var = this.f7694c;
        if (i10 != i12 || i11 != uVar2.A) {
            h2.j0 j0Var = d0Var.d;
            long j12 = d0Var.h;
            if (j12 == -9223372036854775807L) {
                j10 = 0;
            } else {
                j10 = j12 + 1;
            }
            j0Var.a(new x1(i10, i11), j10);
        }
        float f10 = uVar.D;
        if (f10 != this.f7696f.D) {
            this.f7692a.f(f10);
        }
        this.f7696f = uVar;
        if (j3 != this.f7697g) {
            if (d0Var.f7686f.f13848c == 0) {
                d0Var.f7683b.e(i7);
                d0Var.f7691l = j3;
            } else {
                h2.j0 j0Var2 = d0Var.f7685e;
                long j13 = d0Var.h;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                j0Var2.a(Long.valueOf(j3), j11);
            }
            this.f7697g = j3;
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        x xVar = this.f7692a;
        if (xVar.f7793e == 0) {
            xVar.f7793e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
