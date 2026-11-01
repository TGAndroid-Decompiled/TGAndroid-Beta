package ce;

import java.util.concurrent.atomic.AtomicReferenceArray;
import yd.t;
public final class k extends t {
    public final AtomicReferenceArray e;

    public k(long j10, k kVar, int i10) {
        super(j10, kVar, i10);
        this.e = new AtomicReferenceArray(j.f4141f);
    }

    @Override
    public final int g() {
        return j.f4141f;
    }

    @Override
    public final void h(int i10, cd.h hVar) {
        this.e.set(i10, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f54440c + ", hashCode=" + hashCode() + ']';
    }
}
