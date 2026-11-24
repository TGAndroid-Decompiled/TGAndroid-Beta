package defpackage;

import sun.misc.Unsafe;
public abstract class qx2 extends og0 {
    private final cy2 _context;
    private transient px2 intercepted;

    public qx2(defpackage.px2 r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qx2.<init>(px2):void");
    }

    @Override
    public cy2 getContext() {
        cy2 cy2Var = this._context;
        cy2Var.getClass();
        return cy2Var;
    }

    public final px2 intercepted() {
        px2 px2Var;
        px2 px2Var2 = this.intercepted;
        if (px2Var2 == null) {
            fy2 fy2Var = (fy2) getContext().get(jk2.b);
            if (fy2Var != null) {
                px2Var = new rp3(fy2Var, this);
            } else {
                px2Var = this;
            }
            this.intercepted = px2Var;
            return px2Var;
        }
        return px2Var2;
    }

    @Override
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        vb1 vb1Var;
        px2 px2Var = this.intercepted;
        if (px2Var != null && px2Var != this) {
            ay2 ay2Var = getContext().get(jk2.b);
            ay2Var.getClass();
            fy2 fy2Var = (fy2) ay2Var;
            rp3 rp3Var = (rp3) px2Var;
            do {
                unsafe = fy.a;
                j = rp3.n;
            } while (unsafe.getObjectVolatile(rp3Var, j) == r5c.b);
            Object objectVolatile = unsafe.getObjectVolatile(rp3Var, j);
            if (objectVolatile instanceof vb1) {
                vb1Var = (vb1) objectVolatile;
            } else {
                vb1Var = null;
            }
            if (vb1Var != null) {
                vb1Var.n();
            }
        }
        this.intercepted = pq2.b;
    }

    public qx2(px2 px2Var, cy2 cy2Var) {
        super(px2Var);
        this._context = cy2Var;
    }
}
