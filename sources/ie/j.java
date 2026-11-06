package ie;

import ee.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends r {
    public final AtomicReferenceArray f15472e;

    public j(long j3, j jVar, int i7) {
        super(j3, jVar, i7);
        this.f15472e = new AtomicReferenceArray(i.f15471f);
    }

    @Override
    public final int g() {
        return i.f15471f;
    }

    @Override
    public final void h(int i7, id.h hVar) {
        this.f15472e.set(i7, i.f15470e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f10794c + ", hashCode=" + hashCode() + ']';
    }
}
