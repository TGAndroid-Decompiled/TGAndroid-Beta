package m2;

import b2.x;
import e9.n0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.i {
    public final n f12664n;

    public k(x xVar, n0 n0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, n0Var, nVar, arrayList, list, list2);
        this.f12664n = nVar;
    }

    @Override
    public final long A(long j10, long j11) {
        return this.f12664n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f12664n.g(j10);
    }

    @Override
    public final String b() {
        return null;
    }

    @Override
    public final long c(long j10, long j11) {
        return this.f12664n.e(j10, j11);
    }

    @Override
    public final long e(long j10, long j11) {
        return this.f12664n.c(j10, j11);
    }

    @Override
    public final long f(long j10, long j11) {
        n nVar = this.f12664n;
        if (nVar.f12671f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f12673i;
    }

    @Override
    public final j g(long j10) {
        return this.f12664n.h(this, j10);
    }

    @Override
    public final j h() {
        return null;
    }

    @Override
    public final long o(long j10, long j11) {
        return this.f12664n.f(j10, j11);
    }

    @Override
    public final boolean t() {
        return this.f12664n.i();
    }

    @Override
    public final long u() {
        return this.f12664n.d;
    }

    @Override
    public final long z(long j10) {
        return this.f12664n.d(j10);
    }

    @Override
    public final l2.i d() {
        return this;
    }
}
