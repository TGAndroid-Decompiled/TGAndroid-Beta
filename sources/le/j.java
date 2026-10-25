package le;

import he.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends t {
    public final AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f17004f);
    }

    @Override
    public final int g() {
        return i.f17004f;
    }

    @Override
    public final void h(int i10, ld.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f12818c + ", hashCode=" + hashCode() + ']';
    }
}
