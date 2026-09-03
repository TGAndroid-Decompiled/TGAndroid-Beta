package nd;

import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.m;
import qd.t;
public final class h extends t {
    public final b f15958e;
    public final AtomicReferenceArray f15959f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.f15958e = bVar;
        this.f15959f = new AtomicReferenceArray(d.f15941b * 2);
    }

    @Override
    public final int g() {
        return d.f15941b;
    }

    @Override
    public final void h(int r5, uc.h r6) {
        throw new UnsupportedOperationException("Method not decompiled: nd.h.h(int, uc.h):void");
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f15959f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f15959f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z4) {
        if (z4) {
            b bVar = this.f15958e;
            kotlin.jvm.internal.j.b(bVar);
            bVar.q((this.f44851c * d.f15941b) + i10);
        }
        i();
    }

    public final void n(int i10, m mVar) {
        this.f15959f.set(i10 * 2, mVar);
    }

    public final void o(int i10, Object obj) {
        this.f15959f.set((i10 * 2) + 1, obj);
    }
}
