package defpackage;

import java.util.List;
public final class f37 implements e74 {
    public final e74 a;
    public final t1c b;

    public f37(e74 e74Var, t1c t1cVar) {
        this.a = e74Var;
        this.b = t1cVar;
    }

    @Override
    public final boolean a(int i, long j) {
        return this.a.a(i, j);
    }

    @Override
    public final void b(long j, long j2, long j3, List list, gm6[] gm6VarArr) {
        this.a.b(j, j2, j3, list, gm6VarArr);
    }

    @Override
    public final t1c c() {
        return this.b;
    }

    @Override
    public final int d() {
        return this.a.d();
    }

    @Override
    public final int e(ko4 ko4Var) {
        return this.a.u(this.b.a(ko4Var));
    }

    @Override
    public final void enable() {
        this.a.enable();
    }

    public final boolean equals(Object obj) {
        if (v(obj) && (obj instanceof f37)) {
            return this.b.equals(((f37) obj).b);
        }
        return false;
    }

    @Override
    public final void f() {
        this.a.f();
    }

    @Override
    public final boolean g(long j, rh2 rh2Var, List list) {
        return this.a.g(j, rh2Var, list);
    }

    @Override
    public final void h(boolean z) {
        this.a.h(z);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override
    public final ko4 i(int i) {
        return this.b.d[this.a.j(i)];
    }

    @Override
    public final int j(int i) {
        return this.a.j(i);
    }

    @Override
    public final int k(long j, List list) {
        return this.a.k(j, list);
    }

    @Override
    public final void l() {
        this.a.l();
    }

    @Override
    public final int length() {
        return this.a.length();
    }

    @Override
    public final int m() {
        return this.a.m();
    }

    @Override
    public final ko4 n() {
        return this.b.d[this.a.m()];
    }

    @Override
    public final int o() {
        return this.a.o();
    }

    @Override
    public final boolean p(int i, long j) {
        return this.a.p(i, j);
    }

    @Override
    public final void q(float f) {
        this.a.q(f);
    }

    @Override
    public final Object r() {
        return this.a.r();
    }

    @Override
    public final void s() {
        this.a.s();
    }

    @Override
    public final void t() {
        this.a.t();
    }

    @Override
    public final int u(int i) {
        return this.a.u(i);
    }

    public final boolean v(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f37)) {
            return false;
        }
        return this.a.equals(((f37) obj).a);
    }
}
