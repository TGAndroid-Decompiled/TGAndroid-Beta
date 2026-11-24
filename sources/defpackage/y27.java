package defpackage;

import java.util.List;
public final class y27 implements t74 {
    public final t74 a;
    public final uzb b;

    public y27(t74 t74Var, uzb uzbVar) {
        this.a = t74Var;
        this.b = uzbVar;
    }

    @Override
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override
    public final void b(long j, long j2, long j3, List list, em6[] em6VarArr) {
        this.a.b(j, j2, j3, list, em6VarArr);
    }

    @Override
    public final uzb c() {
        return this.b;
    }

    @Override
    public final int d() {
        return this.a.d();
    }

    @Override
    public final int e(go4 go4Var) {
        return this.a.v(this.b.a(go4Var));
    }

    public final boolean equals(Object obj) {
        if (w(obj) && (obj instanceof y27)) {
            return this.b.equals(((y27) obj).b);
        }
        return false;
    }

    @Override
    public final void f() {
        this.a.f();
    }

    @Override
    public final boolean g(long j, ni2 ni2Var, List list) {
        return this.a.g(j, ni2Var, list);
    }

    @Override
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override
    public final go4 i(int i) {
        return this.b.d[this.a.k(i)];
    }

    @Override
    public final void j() {
        this.a.j();
    }

    @Override
    public final int k(int i) {
        return this.a.k(i);
    }

    @Override
    public final int l(long j, List list) {
        return this.a.l(j, list);
    }

    @Override
    public final int length() {
        return this.a.length();
    }

    @Override
    public final void m() {
        this.a.m();
    }

    @Override
    public final int n() {
        return this.a.n();
    }

    @Override
    public final go4 o() {
        return this.b.d[this.a.n()];
    }

    @Override
    public final int p() {
        return this.a.p();
    }

    @Override
    public final boolean q(int i, long j) {
        return this.a.q(i, j);
    }

    @Override
    public final void r(float f) {
        this.a.r(f);
    }

    @Override
    public final Object s() {
        return this.a.s();
    }

    @Override
    public final void t() {
        this.a.t();
    }

    @Override
    public final void u() {
        this.a.u();
    }

    @Override
    public final int v(int i) {
        return this.a.v(i);
    }

    public final boolean w(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y27)) {
            return false;
        }
        return this.a.equals(((y27) obj).a);
    }
}
