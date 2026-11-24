package defpackage;

import sun.misc.Unsafe;
public class dt5 extends pt5 {
    public final boolean d;

    public dt5() {
        super(true);
        gg2 gg2Var;
        gg2 gg2Var2;
        boolean z = true;
        y(null);
        Unsafe unsafe = ex.a;
        long j = pt5.a;
        fg2 fg2Var = (fg2) unsafe.getObjectVolatile(this, j);
        if (fg2Var instanceof gg2) {
            gg2Var = (gg2) fg2Var;
        } else {
            gg2Var = null;
        }
        if (gg2Var != null) {
            pt5 j2 = gg2Var.j();
            while (!j2.s()) {
                fg2 fg2Var2 = (fg2) ex.a.getObjectVolatile(j2, j);
                if (fg2Var2 instanceof gg2) {
                    gg2Var2 = (gg2) fg2Var2;
                } else {
                    gg2Var2 = null;
                }
                if (gg2Var2 != null) {
                    j2 = gg2Var2.j();
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
