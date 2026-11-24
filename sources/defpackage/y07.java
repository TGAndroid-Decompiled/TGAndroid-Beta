package defpackage;

import java.util.List;
public final class y07 implements k64 {
    public final k64 a;
    public final sxb b;

    public y07(k64 k64Var, sxb sxbVar) {
        this.a = k64Var;
        this.b = sxbVar;
    }

    @Override
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override
    public final void b(long j, long j2, long j3, List list, bk6[] bk6VarArr) {
        this.a.b(j, j2, j3, list, bk6VarArr);
    }

    @Override
    public final sxb c() {
        return this.b;
    }

    @Override
    public final int d() {
        return this.a.d();
    }

    @Override
    public final int e(fm4 fm4Var) {
        return this.a.v(this.b.a(fm4Var));
    }

    public final boolean equals(Object obj) {
        if (w(obj) && (obj instanceof y07)) {
            return this.b.equals(((y07) obj).b);
        }
        return false;
    }

    @Override
    public final void f() {
        this.a.f();
    }

    @Override
    public final boolean g(long j, zg2 zg2Var, List list) {
        return this.a.g(j, zg2Var, list);
    }

    @Override
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override
    public final fm4 i(int i) {
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
    public final fm4 o() {
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
        if (!(obj instanceof y07)) {
            return false;
        }
        return this.a.equals(((y07) obj).a);
    }
}
