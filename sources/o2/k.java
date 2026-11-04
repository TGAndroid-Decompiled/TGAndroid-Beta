package o2;

import d2.v;
import g9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements n2.i {
    public final n f20550n;

    public k(v vVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(vVar, i0Var, nVar, arrayList, list, list2);
        this.f20550n = nVar;
    }

    @Override
    public final boolean A() {
        return this.f20550n.i();
    }

    @Override
    public final long C() {
        return this.f20550n.d;
    }

    @Override
    public final long H(long j10) {
        return this.f20550n.d(j10);
    }

    @Override
    public final long K(long j10, long j11) {
        return this.f20550n.b(j10, j11);
    }

    @Override
    public final String a() {
        return null;
    }

    @Override
    public final long b(long j10) {
        return this.f20550n.g(j10);
    }

    @Override
    public final j d() {
        return null;
    }

    @Override
    public final long i(long j10, long j11) {
        return this.f20550n.e(j10, j11);
    }

    @Override
    public final long j(long j10, long j11) {
        return this.f20550n.c(j10, j11);
    }

    @Override
    public final long l(long j10, long j11) {
        n nVar = this.f20550n;
        if (nVar.f20559f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f20561i;
    }

    @Override
    public final j m(long j10) {
        return this.f20550n.h(this, j10);
    }

    @Override
    public final long s(long j10, long j11) {
        return this.f20550n.f(j10, j11);
    }

    @Override
    public final n2.i c() {
        return this;
    }
}
