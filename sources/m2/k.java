package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f15699n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f15699n = nVar;
    }

    @Override
    public final long C(long j3, long j10) {
        return this.f15699n.f(j3, j10);
    }

    @Override
    public final boolean T() {
        return this.f15699n.i();
    }

    @Override
    public final long Y() {
        return this.f15699n.d;
    }

    @Override
    public final long a(long j3) {
        return this.f15699n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long c0(long j3) {
        return this.f15699n.d(j3);
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final long d0(long j3, long j10) {
        return this.f15699n.b(j3, j10);
    }

    @Override
    public final long i(long j3, long j10) {
        return this.f15699n.e(j3, j10);
    }

    @Override
    public final long n(long j3, long j10) {
        return this.f15699n.c(j3, j10);
    }

    @Override
    public final long p(long j3, long j10) {
        n nVar = this.f15699n;
        if (nVar.f15708f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f15710i;
    }

    @Override
    public final j r(long j3) {
        return this.f15699n.h(this, j3);
    }

    @Override
    public final l2.i c() {
        return this;
    }
}
