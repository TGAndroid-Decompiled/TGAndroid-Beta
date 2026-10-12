package je;

import fe.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends t {
    public final AtomicReferenceArray f14147e;

    public k(long j3, k kVar, int i10) {
        super(j3, kVar, i10);
        this.f14147e = new AtomicReferenceArray(j.f14146f);
    }

    @Override
    public final int g() {
        return j.f14146f;
    }

    @Override
    public final void h(int i10, jd.h hVar) {
        this.f14147e.set(i10, j.f14145e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f9913c + ", hashCode=" + hashCode() + ']';
    }
}
