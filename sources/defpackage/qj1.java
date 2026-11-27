package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class qj1 extends hz9 {
    public final z01 g;
    public final AtomicReferenceArray h;

    public qj1(long j, qj1 qj1Var, z01 z01Var, int i) {
        super(j, qj1Var, i);
        this.g = z01Var;
        this.h = new AtomicReferenceArray(b11.b << 1);
    }

    @Override
    public final int g() {
        return b11.b;
    }

    @Override
    public final void h(int r5, defpackage.mx2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qj1.h(int, mx2):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i << 1) + 1;
        do {
            atomicReferenceArray = this.h;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.h.get((i << 1) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            z01 z01Var = this.g;
            z01Var.getClass();
            z01Var.F((this.d * b11.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, ow5 ow5Var) {
        this.h.set((i << 1) + 1, ow5Var);
    }
}
