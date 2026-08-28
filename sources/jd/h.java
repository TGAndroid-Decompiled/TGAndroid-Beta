package jd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.k;
import md.t;
public final class h extends t {
    public final b f14334e;
    public final AtomicReferenceArray f14335f;

    public h(long j10, h hVar, b bVar, int i9) {
        super(j10, hVar, i9);
        this.f14334e = bVar;
        this.f14335f = new AtomicReferenceArray(d.f14317b * 2);
    }

    @Override
    public final int g() {
        return d.f14317b;
    }

    @Override
    public final void h(int r5, qc.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: jd.h.h(int, qc.h):void");
    }

    public final boolean k(int i9, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i10 = (i9 * 2) + 1;
        do {
            atomicReferenceArray = this.f14335f;
            if (atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i10) == obj);
        return false;
    }

    public final Object l(int i9) {
        return this.f14335f.get((i9 * 2) + 1);
    }

    public final void m(int i9, boolean z10) {
        if (z10) {
            b bVar = this.f14334e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.f17670c * d.f14317b) + i9);
        }
        i();
    }

    public final void n(int i9, k kVar) {
        this.f14335f.set(i9 * 2, kVar);
    }

    public final void o(int i9, Object obj) {
        this.f14335f.set((i9 * 2) + 1, obj);
    }
}
