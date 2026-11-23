package be;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class k extends ee.r {
    public final c f3143e;
    public final AtomicReferenceArray f3144f;

    public k(long j3, k kVar, c cVar, int i7) {
        super(j3, kVar, i7);
        this.f3143e = cVar;
        this.f3144f = new AtomicReferenceArray(e.f3121b * 2);
    }

    @Override
    public final int g() {
        return e.f3121b;
    }

    @Override
    public final void h(int r5, id.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: be.k.h(int, id.h):void");
    }

    public final boolean k(int i7, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i7 * 2) + 1;
        do {
            atomicReferenceArray = this.f3144f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i7) {
        return this.f3144f.get((i7 * 2) + 1);
    }

    public final void m(int i7, boolean z10) {
        if (z10) {
            c cVar = this.f3143e;
            kotlin.jvm.internal.j.b(cVar);
            cVar.B((this.f10938c * e.f3121b) + i7);
        }
        i();
    }

    public final void n(int i7, Object obj) {
        this.f3144f.set(i7 * 2, obj);
    }

    public final void o(int i7, Object obj) {
        this.f3144f.set((i7 * 2) + 1, obj);
    }
}
