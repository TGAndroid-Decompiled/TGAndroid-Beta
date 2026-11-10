package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends r {
    public final AtomicReferenceArray f15477e;

    public j(long j3, j jVar, int i7) {
        super(j3, jVar, i7);
        this.f15477e = new AtomicReferenceArray(i.f15476f);
    }

    @Override
    public final int g() {
        return i.f15476f;
    }

    @Override
    public final void h(int i7, id.h hVar) {
        this.f15477e.set(i7, i.f15475e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10799c + ", hashCode=" + hashCode() + ']';
    }
}
