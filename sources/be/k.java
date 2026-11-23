package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends ee.r {
    public final c f3192e;
    public final AtomicReferenceArray f3193f;

    public k(long j3, k kVar, c cVar, int i7) {
        super(j3, kVar, i7);
        this.f3192e = cVar;
        this.f3193f = new AtomicReferenceArray(e.f3170b * 2);
    }

    @Override
    public final int g() {
        return e.f3170b;
    }

    @Override
    public final void h(int r5, id.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: be.k.h(int, id.h):void");
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f3193f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f3193f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z10) {
        if (z10) {
            c cVar = this.f3192e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f10977c * e.f3170b) + i7);
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f3193f.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f3193f.set((i7 * 2) + 1, obj);
    }
}
