package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends r {
    public final AtomicReferenceArray f16336e;

    public j(long j3, j jVar, int i7) {
        super(j3, jVar, i7);
        this.f16336e = new AtomicReferenceArray(i.f16335f);
    }

    @Override
    public final int g() {
        return i.f16335f;
    }

    @Override
    public final void h(int i7, id.h hVar) {
        this.f16336e.set(i7, i.f16334e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10938c + ", hashCode=" + hashCode() + ']';
    }
}
