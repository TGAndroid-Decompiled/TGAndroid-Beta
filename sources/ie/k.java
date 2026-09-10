package ie;

import ee.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends t {
    public final AtomicReferenceArray e;

    public k(long j3, k kVar, int i10) {
        super(j3, kVar, i10);
        this.e = new AtomicReferenceArray(j.f10583f);
    }

    @Override
    public final int g() {
        return j.f10583f;
    }

    @Override
    public final void h(int i10, id.h hVar) {
        this.e.set(i10, j.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f7499c + ", hashCode=" + hashCode() + ']';
    }
}
