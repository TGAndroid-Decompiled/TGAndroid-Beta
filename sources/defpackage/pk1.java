package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
public final class pk1 extends qx9 {
    public final y11 g;
    public final AtomicReferenceArray h;

    public pk1(long j, pk1 pk1Var, y11 y11Var, int i) {
        super(j, pk1Var, i);
        this.g = y11Var;
        this.h = new AtomicReferenceArray(a21.b << 1);
    }

    @Override
    public final int g() {
        return a21.b;
    }

    @Override
    public final void h(int r5, defpackage.cy2 r6) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk1.h(int, cy2):void");
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
            y11 y11Var = this.g;
            y11Var.getClass();
            y11Var.F((this.d * a21.b) + i);
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.h.set(i << 1, obj);
    }

    public final void o(int i, du2 du2Var) {
        this.h.set((i << 1) + 1, du2Var);
    }
}
