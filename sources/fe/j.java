package fe;

import be.r;
import java.util.concurrent.atomic.AtomicReferenceArray;
public final class j extends r {
    public final AtomicReferenceArray f11586e;

    public j(long j10, j jVar, int i3) {
        super(j10, jVar, i3);
        this.f11586e = new AtomicReferenceArray(i.f11585f);
    }

    @Override
    public final int g() {
        return i.f11585f;
    }

    @Override
    public final void h(int i3, fd.h hVar) {
        this.f11586e.set(i3, i.f11584e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.f3282c + ", hashCode=" + hashCode() + ']';
    }
}
