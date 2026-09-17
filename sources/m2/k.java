package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.h {
    public final n f15821n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f15821n = nVar;
    }

    @Override
    public final long a(long j3) {
        return this.f15821n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long c(long j3, long j10) {
        return this.f15821n.e(j3, j10);
    }

    @Override
    public final long e(long j3, long j10) {
        return this.f15821n.c(j3, j10);
    }

    @Override
    public final long f(long j3, long j10) {
        n nVar = this.f15821n;
        if (nVar.f15830f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f15832i;
    }

    @Override
    public final j g(long j3) {
        return this.f15821n.h(this, j3);
    }

    @Override
    public final j h() {
        return null;
    }

    @Override
    public final long o(long j3, long j10) {
        return this.f15821n.f(j3, j10);
    }

    @Override
    public final boolean t() {
        return this.f15821n.i();
    }

    @Override
    public final long u() {
        return this.f15821n.d;
    }

    @Override
    public final long w(long j3) {
        return this.f15821n.d(j3);
    }

    @Override
    public final long y(long j3, long j10) {
        return this.f15821n.b(j3, j10);
    }

    @Override
    public final l2.h d() {
        return this;
    }
}
