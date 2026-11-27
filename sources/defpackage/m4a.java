package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class m4a extends hz9 {
    public final AtomicReferenceArray g;

    public m4a(long j, m4a m4aVar, int i) {
        super(j, m4aVar, i);
        this.g = new AtomicReferenceArray(l4a.f);
    }

    @Override
    public final int g() {
        return l4a.f;
    }

    @Override
    public final void h(int i, mx2 mx2Var) {
        this.g.set(i, l4a.e);
        i();
    }

    public final String toString() {
        return "SemaphoreSegment[id=" + this.d + ", hashCode=" + hashCode() + ']';
    }
}
