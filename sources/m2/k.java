package m2;

import b2.w;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f16443n;

    public k(w wVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(wVar, n0Var, nVar, arrayList, list, list2);
        this.f16443n = nVar;
    }

    @Override
    public final long a(long j10) {
        return this.f16443n.g(j10);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long d(long j10, long j11) {
        return this.f16443n.e(j10, j11);
    }

    @Override
    public final long e(long j10, long j11) {
        return this.f16443n.c(j10, j11);
    }

    @Override
    public final long f(long j10, long j11) {
        n nVar = this.f16443n;
        if (nVar.f16450f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f16452i;
    }

    @Override
    public final j g(long j10) {
        return this.f16443n.h(this, j10);
    }

    @Override
    public final j h() {
        return null;
    }

    @Override
    public final long o(long j10, long j11) {
        return this.f16443n.f(j10, j11);
    }

    @Override
    public final boolean s() {
        return this.f16443n.i();
    }

    @Override
    public final long u() {
        return this.f16443n.d;
    }

    @Override
    public final long w(long j10) {
        return this.f16443n.d(j10);
    }

    @Override
    public final long x(long j10, long j11) {
        return this.f16443n.b(j10, j11);
    }

    @Override
    public final l2.i c() {
        return this;
    }
}
