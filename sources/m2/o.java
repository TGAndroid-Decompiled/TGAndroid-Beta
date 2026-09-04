package m2;

import java.util.List;
public final class o extends n {
    public final List f15806j;

    public o(j jVar, long j3, long j10, long j11, long j12, List list, long j13, List list2, long j14, long j15) {
        super(jVar, j3, j10, j11, j12, list, j13, j14, j15);
        this.f15806j = list2;
    }

    @Override
    public final long d(long j3) {
        return this.f15806j.size();
    }

    @Override
    public final j h(k kVar, long j3) {
        return (j) this.f15806j.get((int) (j3 - this.d));
    }

    @Override
    public final boolean i() {
        return true;
    }
}
