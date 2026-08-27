package n4;

import h3.t0;
import java.util.ArrayList;
import java.util.List;
import p8.z;

public final class k extends m implements m4.h {

    public final n f18254n;

    public k(t0 t0Var, z zVar, n nVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, nVar, arrayList, list, list2);
        this.f18254n = nVar;
    }

    @Override
    public final boolean B() {
        return this.f18254n.i();
    }

    @Override
    public final long E() {
        return this.f18254n.d;
    }

    @Override
    public final long F(long j10) {
        return this.f18254n.d(j10);
    }

    @Override
    public final long G(long j10, long j11) {
        return this.f18254n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f18254n.g(j10);
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
    public final long l(long j10, long j11) {
        return this.f18254n.e(j10, j11);
    }

    @Override
    public final long r(long j10, long j11) {
        return this.f18254n.c(j10, j11);
    }

    @Override
    public final long s(long j10, long j11) {
        n nVar = this.f18254n;
        if (nVar.f18263f != null) {
            return -9223372036854775807L;
        }
        long jB = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(jB, j10) + nVar.g(jB)) - nVar.f18265i;
    }

    @Override
    public final j w(long j10) {
        return this.f18254n.h(this, j10);
    }

    @Override
    public final long y(long j10, long j11) {
        return this.f18254n.f(j10, j11);
    }

    @Override
    public final m4.h c() {
        return this;
    }
}
