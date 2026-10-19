package de;

import ge.t;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.k;
public final class h extends t {
    public final b e;
    public final AtomicReferenceArray f7967f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.e = bVar;
        this.f7967f = new AtomicReferenceArray(d.f7951b * 2);
    }

    @Override
    public final int g() {
        return d.f7951b;
    }

    @Override
    public final void h(int r5, kd.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: de.h.h(int, kd.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f7967f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f7967f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.e;
            kotlin.jvm.internal.i.b(bVar);
            bVar.q((this.f11039c * d.f7951b) + i10);
        }
        i();
    }

    public final void n(int i10, k kVar) {
        this.f7967f.set(i10 * 2, kVar);
    }

    public final void o(int i10, Object obj) {
        this.f7967f.set((i10 * 2) + 1, obj);
    }
}
