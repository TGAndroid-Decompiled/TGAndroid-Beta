package l4;

import java.util.List;
public final class i0 implements d5.r {
    public final d5.r f14328a;
    public final j1 f14329b;

    public i0(d5.r rVar, j1 j1Var) {
        this.f14328a = rVar;
        this.f14329b = j1Var;
    }

    @Override
    public final j1 a() {
        return this.f14329b;
    }

    @Override
    public final void b(long j10, long j11, long j12, List list, n4.l[] lVarArr) {
        this.f14328a.b(j10, j11, j12, list, lVarArr);
    }

    @Override
    public final int c() {
        return this.f14328a.c();
    }

    @Override
    public final boolean d(int i10, long j10) {
        return this.f14328a.d(i10, j10);
    }

    @Override
    public final boolean e(int i10, long j10) {
        return this.f14328a.e(i10, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        if (this.f14328a.equals(i0Var.f14328a) && this.f14329b.equals(i0Var.f14329b)) {
            return true;
        }
        return false;
    }

    @Override
    public final void f(boolean z10) {
        this.f14328a.f(z10);
    }

    @Override
    public final j3.t0 g(int i10) {
        return this.f14328a.g(i10);
    }

    @Override
    public final void h() {
        this.f14328a.h();
    }

    public final int hashCode() {
        return this.f14328a.hashCode() + ((this.f14329b.hashCode() + 527) * 31);
    }

    @Override
    public final int i(int i10) {
        return this.f14328a.i(i10);
    }

    @Override
    public final int j(long j10, List list) {
        return this.f14328a.j(j10, list);
    }

    @Override
    public final void k() {
        this.f14328a.k();
    }

    @Override
    public final int l() {
        return this.f14328a.l();
    }

    @Override
    public final int length() {
        return this.f14328a.length();
    }

    @Override
    public final int m(j3.t0 t0Var) {
        return this.f14328a.m(t0Var);
    }

    @Override
    public final j3.t0 n() {
        return this.f14328a.n();
    }

    @Override
    public final int o() {
        return this.f14328a.o();
    }

    @Override
    public final boolean p(long j10, n4.e eVar, List list) {
        return this.f14328a.p(j10, eVar, list);
    }

    @Override
    public final void q(float f9) {
        this.f14328a.q(f9);
    }

    @Override
    public final Object r() {
        return this.f14328a.r();
    }

    @Override
    public final void s() {
        this.f14328a.s();
    }

    @Override
    public final void t() {
        this.f14328a.t();
    }

    @Override
    public final int u(int i10) {
        return this.f14328a.u(i10);
    }
}
