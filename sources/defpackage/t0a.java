package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class t0a extends nv9 {
    public final AtomicReferenceArray g;

    public t0a(long j, t0a t0aVar, int i) {
        super(j, t0aVar, i);
        this.g = new AtomicReferenceArray(s0a.f);
    }

    @Override
    public final int g() {
        return s0a.f;
    }

    @Override
    public final void h(int i, sw2 sw2Var) {
        this.g.set(i, s0a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
