package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class hj1 extends nv9 {
    public final q01 g;
    public final AtomicReferenceArray h;

    public hj1(long j, hj1 hj1Var, q01 q01Var, int i) {
        super(j, hj1Var, i);
        this.g = q01Var;
        this.h = new AtomicReferenceArray(s01.b << 1);
    }

    @Override
    public final int g() {
        return s01.b;
    }

    @Override
    public final void h(int r5, defpackage.sw2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hj1.h(int, sw2):void");
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
            q01 q01Var = this.g;
            q01Var.getClass();
            q01Var.F((this.d * s01.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, lo5 lo5Var) {
        this.h.set((i << 1) + 1, lo5Var);
    }
}
