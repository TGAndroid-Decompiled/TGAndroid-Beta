package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class v2a extends qx9 {
    public final AtomicReferenceArray g;

    public v2a(long j, v2a v2aVar, int i) {
        super(j, v2aVar, i);
        this.g = new AtomicReferenceArray(u2a.f);
    }

    @Override
    public final int g() {
        return u2a.f;
    }

    @Override
    public final void h(int i, cy2 cy2Var) {
        this.g.set(i, u2a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
