package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends ee.r {
    public final c f3220e;
    public final AtomicReferenceArray f3221f;

    public k(long j3, k kVar, c cVar, int i7) {
        super(j3, kVar, i7);
        this.f3220e = cVar;
        this.f3221f = new AtomicReferenceArray(e.f3198b * 2);
    }

    @Override
    public final int g() {
        return e.f3198b;
    }

    @Override
    public final void h(int r5, id.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: be.k.h(int, id.h):void");
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f3221f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f3221f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z9) {
        if (z9) {
            c cVar = this.f3220e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f10799c * e.f3198b) + i7);
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f3221f.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f3221f.set((i7 * 2) + 1, obj);
    }
}
