package d3;

import a8.la;
import android.view.Surface;
import e2.x1;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;
public final class e implements k0 {
    public final x f7666a;
    public final y f7667b;
    public final d0 f7668c;
    public final ArrayDeque d;
    public Surface f7669e;
    public e2.u f7670f;
    public long f7671g;
    public i0 h;
    public Executor f7672i;
    public v f7673j;

    public e(x xVar, y yVar, h2.g0 g0Var) {
        this.f7666a = xVar;
        this.f7667b = yVar;
        xVar.f7773l = g0Var;
        this.f7668c = new d0(new q4.q(this), xVar, yVar);
        this.d = new ArrayDeque();
        this.f7670f = new e2.u(new e2.t());
        this.f7671g = -9223372036854775807L;
        this.h = i0.f7697k;
        this.f7672i = new b(0);
        this.f7673j = new Object();
    }

    @Override
    public final boolean a() {
        d0 d0Var = this.f7668c;
        long j3 = d0Var.f7663j;
        if (j3 != -9223372036854775807L && d0Var.f7662i == j3) {
            return true;
        }
        return false;
    }

    @Override
    public final Surface b() {
        Surface surface = this.f7669e;
        surface.getClass();
        return surface;
    }

    @Override
    public final void c(v vVar) {
        this.f7673j = vVar;
    }

    @Override
    public final void d(float f10) {
        this.f7666a.h(f10);
    }

    @Override
    public final void e() {
        this.f7667b.b();
        x xVar = this.f7666a;
        xVar.d = false;
        xVar.f7770i = -9223372036854775807L;
        c0 c0Var = xVar.f7765b;
        c0Var.d = false;
        z zVar = c0Var.f7639c;
        if (zVar != null) {
            zVar.b();
        }
        c0Var.a();
    }

    @Override
    public final void f(Surface surface, h2.y yVar) {
        this.f7669e = surface;
        this.f7666a.g(surface);
    }

    @Override
    public final void g(d6.i iVar) {
        this.h = iVar;
        this.f7672i = m9.r.f20955a;
    }

    @Override
    public final void h() {
        this.f7667b.b();
        this.f7666a.d();
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
        d0 d0Var = this.f7668c;
        if (d0Var.h == -9223372036854775807L) {
            d0Var.h = Long.MIN_VALUE;
            d0Var.f7662i = Long.MIN_VALUE;
        }
        d0Var.f7663j = d0Var.h;
    }

    @Override
    public final void l(int i7) {
        c0 c0Var = this.f7666a.f7765b;
        if (c0Var.f7644j == i7) {
            return;
        }
        c0Var.f7644j = i7;
        c0Var.d(true);
    }

    @Override
    public final void m() {
        this.f7669e = null;
        this.f7666a.g(null);
    }

    @Override
    public final boolean n(long j3, i iVar) {
        this.d.add(iVar);
        d0 d0Var = this.f7668c;
        h2.s sVar = d0Var.f7660f;
        int i7 = sVar.f13822c;
        long[] jArr = (long[]) sVar.f13823e;
        if (i7 == jArr.length) {
            int length = jArr.length << 1;
            if (length >= 0) {
                long[] jArr2 = new long[length];
                int length2 = jArr.length;
                int i10 = sVar.f13820a;
                int i11 = length2 - i10;
                System.arraycopy(jArr, i10, jArr2, 0, i11);
                System.arraycopy((long[]) sVar.f13823e, 0, jArr2, i11, i10);
                sVar.f13820a = 0;
                sVar.f13821b = sVar.f13822c - 1;
                sVar.f13823e = jArr2;
                sVar.d = length - 1;
            } else {
                throw new IllegalStateException();
            }
        }
        int i12 = (sVar.f13821b + 1) & sVar.d;
        sVar.f13821b = i12;
        ((long[]) sVar.f13823e)[i12] = j3;
        sVar.f13822c++;
        d0Var.h = j3;
        d0Var.f7663j = -9223372036854775807L;
        this.f7672i.execute(new ca.r(this, 6));
        return true;
    }

    @Override
    public final void o(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (z10) {
            x xVar = this.f7666a;
            xVar.f7765b.b();
            xVar.h = -9223372036854775807L;
            xVar.f7768f = -9223372036854775807L;
            xVar.f7767e = Math.min(xVar.f7767e, 1);
            xVar.f7770i = -9223372036854775807L;
            xVar.f7775n = false;
        }
        this.f7667b.b();
        d0 d0Var = this.f7668c;
        h2.j0 j0Var = d0Var.d;
        h2.s sVar = d0Var.f7660f;
        sVar.f13820a = 0;
        sVar.f13821b = -1;
        sVar.f13822c = 0;
        d0Var.h = -9223372036854775807L;
        d0Var.f7662i = -9223372036854775807L;
        d0Var.f7663j = -9223372036854775807L;
        h2.j0 j0Var2 = d0Var.f7659e;
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
            d0Var.f7665l = ((Long) i7).longValue();
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
            this.f7668c.a(j3, j10);
        } catch (l2.l e10) {
            throw new j0(e10, this.f7670f);
        }
    }

    @Override
    public final void r(boolean z10) {
        this.f7666a.c(z10);
    }

    @Override
    public final boolean s(boolean z10) {
        return this.f7666a.b(z10);
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
        int i10 = uVar.f10775z;
        int i11 = uVar.A;
        e2.u uVar2 = this.f7670f;
        int i12 = uVar2.f10775z;
        d0 d0Var = this.f7668c;
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
        if (f10 != this.f7670f.D) {
            this.f7666a.f(f10);
        }
        this.f7670f = uVar;
        if (j3 != this.f7671g) {
            if (d0Var.f7660f.f13822c == 0) {
                d0Var.f7657b.e(i7);
                d0Var.f7665l = j3;
            } else {
                h2.j0 j0Var2 = d0Var.f7659e;
                long j13 = d0Var.h;
                if (j13 == -9223372036854775807L) {
                    j11 = -4611686018427387904L;
                } else {
                    j11 = j13 + 1;
                }
                j0Var2.a(Long.valueOf(j3), j11);
            }
            this.f7671g = j3;
        }
    }

    @Override
    public final boolean v() {
        return true;
    }

    @Override
    public final void w() {
        x xVar = this.f7666a;
        if (xVar.f7767e == 0) {
            xVar.f7767e = 1;
        }
    }

    @Override
    public final void release() {
    }
}
