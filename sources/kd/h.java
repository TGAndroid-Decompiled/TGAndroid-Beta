package kd;

import id.j2;
import java.util.concurrent.atomic.AtomicReferenceArray;
import k1.k;
import nd.t;

public final class h extends t {

    public final b f15183e;

    public final AtomicReferenceArray f15184f;

    public h(long j10, h hVar, b bVar, int i10) {
        super(j10, hVar, i10);
        this.f15183e = bVar;
        this.f15184f = new AtomicReferenceArray(d.f15166b * 2);
    }

    @Override
    public final int g() {
        return d.f15166b;
    }

    @Override
    public final void h(int i10, rc.h hVar) {
        b bVar;
        int i11 = d.f15166b;
        boolean z10 = i10 >= i11;
        if (z10) {
            i10 -= i11;
        }
        this.f15184f.get(i10 * 2);
        while (true) {
            Object objL = l(i10);
            boolean z11 = objL instanceof j2;
            bVar = this.f15183e;
            if (z11 || (objL instanceof j)) {
                if (k(i10, objL, z10 ? d.f15172j : d.f15173k)) {
                    n(i10, null);
                    m(i10, !z10);
                    if (z10) {
                        kotlin.jvm.internal.j.b(bVar);
                        return;
                    }
                    return;
                }
            } else {
                if (objL == d.f15172j || objL == d.f15173k) {
                    break;
                }
                if (objL != d.f15170g && objL != d.f15169f) {
                    if (objL == d.f15171i || objL == d.d || objL == d.f15174l) {
                        return;
                    }
                    throw new IllegalStateException(("unexpected state: " + objL).toString());
                }
            }
        }
        n(i10, null);
        if (z10) {
            kotlin.jvm.internal.j.b(bVar);
        }
    }

    public final boolean k(int i10, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i11 = (i10 * 2) + 1;
        do {
            atomicReferenceArray = this.f15184f;
            if (atomicReferenceArray.compareAndSet(i11, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i11) == obj);
        return false;
    }

    public final Object l(int i10) {
        return this.f15184f.get((i10 * 2) + 1);
    }

    public final void m(int i10, boolean z10) {
        if (z10) {
            b bVar = this.f15183e;
            kotlin.jvm.internal.j.b(bVar);
            bVar.q((this.f18506c * ((long) d.f15166b)) + ((long) i10));
        }
        i();
    }

    public final void n(int i10, k kVar) {
        this.f15184f.set(i10 * 2, kVar);
    }

    public final void o(int i10, Object obj) {
        this.f15184f.set((i10 * 2) + 1, obj);
    }
}
