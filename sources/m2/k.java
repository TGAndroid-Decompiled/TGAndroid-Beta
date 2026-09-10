package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.j {
    public final n f13265n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f13265n = nVar;
    }

    @Override
    public final boolean E() {
        return this.f13265n.i();
    }

    @Override
    public final long J() {
        return this.f13265n.d;
    }

    @Override
    public final long K(long j3) {
        return this.f13265n.d(j3);
    }

    @Override
    public final long M(long j3, long j10) {
        return this.f13265n.b(j3, j10);
    }

    @Override
    public final long a(long j3) {
        return this.f13265n.g(j3);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long c(long j3, long j10) {
        return this.f13265n.e(j3, j10);
    }

    @Override
    public final j e() {
        return null;
    }

    @Override
    public final long i(long j3, long j10) {
        return this.f13265n.c(j3, j10);
    }

    @Override
    public final long k(long j3, long j10) {
        n nVar = this.f13265n;
        if (nVar.f13272f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f13274i;
    }

    @Override
    public final j m(long j3) {
        return this.f13265n.h(this, j3);
    }

    @Override
    public final long w(long j3, long j10) {
        return this.f13265n.f(j3, j10);
    }

    @Override
    public final l2.j d() {
        return this;
    }
}
