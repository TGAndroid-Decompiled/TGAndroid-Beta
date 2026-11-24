package defpackage;

import sun.misc.Unsafe;
public abstract class gw2 extends of0 {
    private final sw2 _context;
    private transient fw2 intercepted;

    public gw2(defpackage.fw2 r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gw2.<init>(fw2):void");
    }

    @Override
    public sw2 getContext() {
        sw2 sw2Var = this._context;
        sw2Var.getClass();
        return sw2Var;
    }

    public final fw2 intercepted() {
        fw2 fw2Var;
        fw2 fw2Var2 = this.intercepted;
        if (fw2Var2 == null) {
            vw2 vw2Var = (vw2) getContext().get(vi2.b);
            if (vw2Var != null) {
                fw2Var = new ho3(vw2Var, this);
            } else {
                fw2Var = this;
            }
            this.intercepted = fw2Var;
            return fw2Var;
        }
        return fw2Var2;
    }

    @Override
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        na1 na1Var;
        fw2 fw2Var = this.intercepted;
        if (fw2Var != null && fw2Var != this) {
            qw2 qw2Var = getContext().get(vi2.b);
            qw2Var.getClass();
            vw2 vw2Var = (vw2) qw2Var;
            ho3 ho3Var = (ho3) fw2Var;
            do {
                unsafe = ex.a;
                j = ho3.n;
            } while (unsafe.getObjectVolatile(ho3Var, j) == r3c.b);
            Object objectVolatile = unsafe.getObjectVolatile(ho3Var, j);
            if (objectVolatile instanceof na1) {
                na1Var = (na1) objectVolatile;
            } else {
                na1Var = null;
            }
            if (na1Var != null) {
                na1Var.n();
            }
        }
        this.intercepted = ep2.b;
    }

    public gw2(fw2 fw2Var, sw2 sw2Var) {
        super(fw2Var);
        this._context = sw2Var;
    }
}
