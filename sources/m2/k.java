package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.h {
    public final n f14669n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f14669n = nVar;
    }

    @Override
    public final long A(long j3, long j10) {
        return this.f14669n.b(j3, j10);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j3) {
        return this.f14669n.g(j3);
    }

    @Override
    public final long c(long j3, long j10) {
        return this.f14669n.e(j3, j10);
    }

    @Override
    public final j e() {
        return null;
    }

    @Override
    public final long f(long j3, long j10) {
        return this.f14669n.c(j3, j10);
    }

    @Override
    public final long j(long j3, long j10) {
        n nVar = this.f14669n;
        if (nVar.f14676f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f14678i;
    }

    @Override
    public final j k(long j3) {
        return this.f14669n.h(this, j3);
    }

    @Override
    public final long s(long j3, long j10) {
        return this.f14669n.f(j3, j10);
    }

    @Override
    public final boolean w() {
        return this.f14669n.i();
    }

    @Override
    public final long y() {
        return this.f14669n.d;
    }

    @Override
    public final long z(long j3) {
        return this.f14669n.d(j3);
    }

    @Override
    public final l2.h d() {
        return this;
    }
}
