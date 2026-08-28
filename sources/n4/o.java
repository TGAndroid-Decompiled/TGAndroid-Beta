package n4;

import java.util.List;
public final class o extends n {
    public final List f18439j;

    public o(j jVar, long j10, long j11, long j12, long j13, List list, long j14, List list2, long j15, long j16) {
        super(jVar, j10, j11, j12, j13, list, j14, j15, j16);
        this.f18439j = list2;
    }

    @Override
    public final long d(long j10) {
        return this.f18439j.size();
    }

    @Override
    public final j h(k kVar, long j10) {
        return (j) this.f18439j.get((int) (j10 - this.d));
    }

    @Override
    public final boolean i() {
        return true;
    }
}
