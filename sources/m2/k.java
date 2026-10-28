package m2;

import b2.x;
import f9.i0;
import java.util.ArrayList;
import java.util.List;
public final class k extends m implements l2.h {
    public final n f17968n;

    public k(x xVar, i0 i0Var, n nVar, ArrayList arrayList, List list, List list2) {
        super(xVar, i0Var, nVar, arrayList, list, list2);
        this.f17968n = nVar;
    }

    @Override
    public final boolean N() {
        return this.f17968n.i();
    }

    @Override
    public final long R() {
        return this.f17968n.d;
    }

    @Override
    public final long V(long j10) {
        return this.f17968n.d(j10);
    }

    @Override
    public final long W(long j10, long j11) {
        return this.f17968n.b(j10, j11);
    }

    @Override
    public final long a(long j10) {
        return this.f17968n.g(j10);
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
    public final long e(long j10, long j11) {
        return this.f17968n.e(j10, j11);
    }

    @Override
    public final long g(long j10, long j11) {
        return this.f17968n.c(j10, j11);
    }

    @Override
    public final long k(long j10, long j11) {
        n nVar = this.f17968n;
        if (nVar.f17975f != null) {
            return -9223372036854775807L;
        }
        long b10 = nVar.b(j10, j11) + nVar.c(j10, j11);
        return (nVar.e(b10, j10) + nVar.g(b10)) - nVar.f17977i;
    }

    @Override
    public final j l(long j10) {
        return this.f17968n.h(this, j10);
    }

    @Override
    public final long t(long j10, long j11) {
        return this.f17968n.f(j10, j11);
    }

    @Override
    public final l2.h c() {
        return this;
    }
}
