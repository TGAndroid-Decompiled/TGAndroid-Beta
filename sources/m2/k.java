package m2;

import e9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f15974n;

    public k(b2.s sVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(sVar, i0Var, nVar, arrayList, list, list2);
        this.f15974n = nVar;
    }

    @Override
    public final long A(long j3, long j10) {
        return this.f15974n.b(j3, j10);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j3) {
        return this.f15974n.g(j3);
    }

    @Override
    public final long d(long j3, long j10) {
        return this.f15974n.e(j3, j10);
    }

    @Override
    public final long e(long j3, long j10) {
        return this.f15974n.c(j3, j10);
    }

    @Override
    public final long f(long j3, long j10) {
        n nVar = this.f15974n;
        if (nVar.f15983f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j3, j10) + nVar.c(j3, j10);
        return (nVar.e(b10, j3) + nVar.g(b10)) - nVar.f15985i;
    }

    @Override
    public final j g() {
        return null;
    }

    @Override
    public final j k(long j3) {
        return this.f15974n.h(this, j3);
    }

    @Override
    public final long n(long j3, long j10) {
        return this.f15974n.f(j3, j10);
    }

    @Override
    public final boolean t() {
        return this.f15974n.i();
    }

    @Override
    public final long u() {
        return this.f15974n.d;
    }

    @Override
    public final long w(long j3) {
        return this.f15974n.d(j3);
    }

    @Override
    public final l2.i c() {
        return this;
    }
}
