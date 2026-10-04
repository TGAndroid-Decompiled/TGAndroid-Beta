package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends t {
    public final AtomicReferenceArray f12079e;

    public k(long j3, k kVar, int i10) {
        super(j3, kVar, i10);
        this.f12079e = new AtomicReferenceArray(j.f12078f);
    }

    @Override
    public final int g() {
        return j.f12078f;
    }

    @Override
    public final void h(int i10, id.h hVar) {
        this.f12079e.set(i10, j.f12077e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f8892c + ", hashCode=" + hashCode() + ']';
    }
}
