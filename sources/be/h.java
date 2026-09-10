package be;

import ee.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.k;
public final class h extends t {
    public final b e;
    public final AtomicReferenceArray f2228f;

    public h(long j3, h hVar, b bVar, int i10) {
        super(j3, hVar, i10);
        this.e = bVar;
        this.f2228f = new AtomicReferenceArray(d.f2212b * 2);
    }

    @Override
    public final int g() {
        return d.f2212b;
    }

    @Override
    public final void h(int r5, id.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: be.h.h(int, id.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f2228f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f2228f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.f7499c * d.f2212b) + i10);
        }
        i();
    }

    public final void n(int i10, k kVar) {
        this.f2228f.set(i10 * 2, kVar);
    }

    public final void o(int i10, Object obj) {
        this.f2228f.set((i10 * 2) + 1, obj);
    }
}
