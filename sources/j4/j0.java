package j4;

import java.util.List;
public final class j0 implements b5.t {
    public final b5.t f13488a;
    public final i1 f13489b;

    public j0(b5.t tVar, i1 i1Var) {
        this.f13488a = tVar;
        this.f13489b = i1Var;
    }

    @Override
    public final int a(h3.t0 t0Var) {
        return this.f13488a.a(t0Var);
    }

    @Override
    public final i1 b() {
        return this.f13489b;
    }

    @Override
    public final boolean c(long j10, l4.e eVar, List list) {
        return this.f13488a.c(j10, eVar, list);
    }

    @Override
    public final int d() {
        return this.f13488a.d();
    }

    @Override
    public final boolean e(int i9, long j10) {
        return this.f13488a.e(i9, j10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        if (this.f13488a.equals(j0Var.f13488a) && this.f13489b.equals(j0Var.f13489b)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean f(int i9, long j10) {
        return this.f13488a.f(i9, j10);
    }

    @Override
    public final void g(boolean z10) {
        this.f13488a.g(z10);
    }

    @Override
    public final h3.t0 h(int i9) {
        return this.f13488a.h(i9);
    }

    public final int hashCode() {
        return this.f13488a.hashCode() + ((this.f13489b.hashCode() + 527) * 31);
    }

    @Override
    public final void i() {
        this.f13488a.i();
    }

    @Override
    public final int j(int i9) {
        return this.f13488a.j(i9);
    }

    @Override
    public final int k(long j10, List list) {
        return this.f13488a.k(j10, list);
    }

    @Override
    public final void l() {
        this.f13488a.l();
    }

    @Override
    public final int length() {
        return this.f13488a.length();
    }

    @Override
    public final void m(long j10, long j11, long j12, List list, l4.l[] lVarArr) {
        this.f13488a.m(j10, j11, j12, list, lVarArr);
    }

    @Override
    public final int n() {
        return this.f13488a.n();
    }

    @Override
    public final h3.t0 o() {
        return this.f13488a.o();
    }

    @Override
    public final int p() {
        return this.f13488a.p();
    }

    @Override
    public final void q(float f10) {
        this.f13488a.q(f10);
    }

    @Override
    public final Object r() {
        return this.f13488a.r();
    }

    @Override
    public final void s() {
        this.f13488a.s();
    }

    @Override
    public final void t() {
        this.f13488a.t();
    }

    @Override
    public final int u(int i9) {
        return this.f13488a.u(i9);
    }
}
