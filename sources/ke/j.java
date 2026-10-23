package ke;

import ge.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends t {
    public final AtomicReferenceArray e;

    public j(long j10, j jVar, int i10) {
        super(j10, jVar, i10);
        this.e = new AtomicReferenceArray(i.f15091f);
    }

    @Override
    public final int g() {
        return i.f15091f;
    }

    @Override
    public final void h(int i10, kd.h hVar) {
        this.e.set(i10, i.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f11058c + ", hashCode=" + hashCode() + ']';
    }
}
