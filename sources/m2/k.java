package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f16014n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f16014n = nVar;
    }

    @Override
    public final long H(long j3, long j10) {
        return this.f16014n.f(j3, j10);
    }

    @Override
    public final long a(long j3) {
        return this.f16014n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final boolean e0() {
        return this.f16014n.i();
    }

    @Override
    public final long i(long j3, long j10) {
        return this.f16014n.e(j3, j10);
    }

    @Override
    public final long j0() {
        return this.f16014n.d;
    }

    @Override
    public final long n(long j3, long j10) {
        return this.f16014n.c(j3, j10);
    }

    @Override
    public final long p(long j3, long j10) {
        n nVar = this.f16014n;
        if (nVar.f16023f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f16025i;
    }

    @Override
    public final long p0(long j3) {
        return this.f16014n.d(j3);
    }

    @Override
    public final j q(long j3) {
        return this.f16014n.h(this, j3);
    }

    @Override
    public final long q0(long j3, long j10) {
        return this.f16014n.b(j3, j10);
    }

    @Override
    public final l2.i c() {
        return this;
    }
}
