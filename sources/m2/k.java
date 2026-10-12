package m2;

import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f15355n;

    public k(x xVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, nVar, arrayList, list, list2);
        this.f15355n = nVar;
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j10) {
        return this.f15355n.g(j10);
    }

    @Override
    public final long c(long j10, long j11) {
        return this.f15355n.e(j10, j11);
    }

    @Override
    public final long e(long j10, long j11) {
        return this.f15355n.c(j10, j11);
    }

    @Override
    public final j f() {
        return null;
    }

    @Override
    public final long h(long j10, long j11) {
        n nVar = this.f15355n;
        if (nVar.f15362f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f15364i;
    }

    @Override
    public final j i(long j10) {
        return this.f15355n.h(this, j10);
    }

    @Override
    public final long o(long j10, long j11) {
        return this.f15355n.f(j10, j11);
    }

    @Override
    public final boolean t() {
        return this.f15355n.i();
    }

    @Override
    public final long u() {
        return this.f15355n.d;
    }

    @Override
    public final long w(long j10) {
        return this.f15355n.d(j10);
    }

    @Override
    public final long x(long j10, long j11) {
        return this.f15355n.b(j10, j11);
    }

    @Override
    public final l2.i d() {
        return this;
    }
}
