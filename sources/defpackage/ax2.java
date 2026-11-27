package defpackage;

import sun.misc.Unsafe;
public abstract class ax2 extends qf0 {
    private final mx2 _context;
    private transient zw2 intercepted;

    public ax2(defpackage.zw2 r2) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ax2.<init>(zw2):void");
    }

    @Override
    public mx2 getContext() {
        mx2 mx2Var = this._context;
        mx2Var.getClass();
        return mx2Var;
    }

    public final zw2 intercepted() {
        zw2 zw2Var;
        zw2 zw2Var2 = this.intercepted;
        if (zw2Var2 == null) {
            px2 px2Var = (px2) getContext().get(rj2.b);
            if (px2Var != null) {
                zw2Var = new yo3(px2Var, this);
            } else {
                zw2Var = this;
            }
            this.intercepted = zw2Var;
            return zw2Var;
        }
        return zw2Var2;
    }

    @Override
    public void releaseIntercepted() {
        Unsafe unsafe;
        long j;
        va1 va1Var;
        zw2 zw2Var = this.intercepted;
        if (zw2Var != null && zw2Var != this) {
            kx2 kx2Var = getContext().get(rj2.b);
            kx2Var.getClass();
            px2 px2Var = (px2) kx2Var;
            yo3 yo3Var = (yo3) zw2Var;
            do {
                unsafe = fx.a;
                j = yo3.n;
            } while (unsafe.getObjectVolatile(yo3Var, j) == q7c.b);
            Object objectVolatile = unsafe.getObjectVolatile(yo3Var, j);
            if (objectVolatile instanceof va1) {
                va1Var = (va1) objectVolatile;
            } else {
                va1Var = null;
            }
            if (va1Var != null) {
                va1Var.n();
            }
        }
        this.intercepted = xp2.b;
    }

    public ax2(zw2 zw2Var, mx2 mx2Var) {
        super(zw2Var);
        this._context = mx2Var;
    }
}
