package defpackage;

import java.util.ArrayList;
public final class sb9 extends ub9 implements j63 {
    public final iz9 f;

    public sb9(ko4 ko4Var, po5 po5Var, iz9 iz9Var, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        super(ko4Var, po5Var, iz9Var, arrayList, arrayList2, arrayList3);
        this.f = iz9Var;
    }

    @Override
    public final long I(long j, long j2) {
        return this.f.g(j, j2);
    }

    @Override
    public final boolean R() {
        return this.f.j();
    }

    @Override
    public final long V() {
        return this.f.d;
    }

    @Override
    public final long Y(long j) {
        return this.f.e(j);
    }

    @Override
    public final long a0(long j, long j2) {
        return this.f.c(j, j2);
    }

    @Override
    public final long f(long j) {
        return this.f.h(j);
    }

    @Override
    public final long j(long j, long j2) {
        return this.f.f(j, j2);
    }

    @Override
    public final long r(long j, long j2) {
        return this.f.d(j, j2);
    }

    @Override
    public final long v(long j, long j2) {
        iz9 iz9Var = this.f;
        if (iz9Var.f != null) {
            return -9223372036854775807L;
        }
        long c = iz9Var.c(j, j2) + iz9Var.d(j, j2);
        return (iz9Var.f(c, j) + iz9Var.h(c)) - iz9Var.i;
    }

    @Override
    public final n29 z(long j) {
        return this.f.i(this, j);
    }

    @Override
    public final j63 b() {
        return this;
    }
}
