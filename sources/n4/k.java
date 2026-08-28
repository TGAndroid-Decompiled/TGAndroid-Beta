package n4;

import h3.t0;
import java.util.ArrayList;
import java.util.List;
import o8.z;
public final class k extends m implements m4.h {
    public final n f18427n;

    public k(t0 t0Var, z zVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, nVar, arrayList, list, list2);
        this.f18427n = nVar;
    }

    @Override
    public final long C(long j10, long j11) {
        return this.f18427n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f18427n.g(j10);
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
    public final long f(long j10, long j11) {
        return this.f18427n.e(j10, j11);
    }

    @Override
    public final long i(long j10, long j11) {
        return this.f18427n.c(j10, j11);
    }

    @Override
    public final long j(long j10, long j11) {
        n nVar = this.f18427n;
        if (nVar.f18436f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f18438i;
    }

    @Override
    public final j l(long j10) {
        return this.f18427n.h(this, j10);
    }

    @Override
    public final long q(long j10, long j11) {
        return this.f18427n.f(j10, j11);
    }

    @Override
    public final boolean v() {
        return this.f18427n.i();
    }

    @Override
    public final long x() {
        return this.f18427n.d;
    }

    @Override
    public final long z(long j10) {
        return this.f18427n.d(j10);
    }

    @Override
    public final m4.h c() {
        return this;
    }
}
