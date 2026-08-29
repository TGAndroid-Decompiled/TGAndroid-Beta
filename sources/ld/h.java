package ld;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.l;
import od.u;
public final class h extends u {
    public final b f15187e;
    public final AtomicReferenceArray f15188f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.f15187e = bVar;
        this.f15188f = new AtomicReferenceArray(d.f15170b * 2);
    }

    @Override
    public final int g() {
        return d.f15170b;
    }

    @Override
    public final void h(int r5, sc.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: ld.h.h(int, sc.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f15188f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f15188f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.f15187e;
            kotlin.jvm.internal.j.b(bVar);
            bVar.q((this.f19536c * d.f15170b) + i10);
        }
        i();
    }

    public final void n(int i10, l lVar) {
        this.f15188f.set(i10 * 2, lVar);
    }

    public final void o(int i10, Object obj) {
        this.f15188f.set((i10 * 2) + 1, obj);
    }
}
