package defpackage;

import sun.misc.Unsafe;
public class gv5 extends sv5 {
    public final boolean d;

    public gv5() {
        super(true);
        yg2 yg2Var;
        yg2 yg2Var2;
        boolean z = true;
        y(null);
        Unsafe unsafe = fx.a;
        long j = sv5.a;
        xg2 xg2Var = (xg2) unsafe.getObjectVolatile(this, j);
        if (xg2Var instanceof yg2) {
            yg2Var = (yg2) xg2Var;
        } else {
            yg2Var = null;
        }
        if (yg2Var != null) {
            sv5 j2 = yg2Var.j();
            while (!j2.s()) {
                xg2 xg2Var2 = (xg2) fx.a.getObjectVolatile(j2, j);
                if (xg2Var2 instanceof yg2) {
                    yg2Var2 = (yg2) xg2Var2;
                } else {
                    yg2Var2 = null;
                }
                if (yg2Var2 != null) {
                    j2 = yg2Var2.j();
                }
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    @Override
    public final boolean s() {
        return this.d;
    }

    @Override
    public final boolean t() {
        return true;
    }
}
