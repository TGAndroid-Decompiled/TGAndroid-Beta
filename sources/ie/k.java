package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends t {
    public final AtomicReferenceArray f11975e;

    public k(long j3, k kVar, int i10) {
        super(j3, kVar, i10);
        this.f11975e = new AtomicReferenceArray(j.f11974f);
    }

    @Override
    public final int g() {
        return j.f11974f;
    }

    @Override
    public final void h(int i10, id.h hVar) {
        this.f11975e.set(i10, j.f11973e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f9092c + ", hashCode=" + hashCode() + ']';
    }
}
