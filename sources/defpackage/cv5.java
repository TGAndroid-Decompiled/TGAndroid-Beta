package defpackage;

import sun.misc.Unsafe;
public class cv5 extends ov5 {
    public final boolean d;

    public cv5() {
        super(true);
        uh2 uh2Var;
        uh2 uh2Var2;
        boolean z = true;
        y(null);
        Unsafe unsafe = fy.a;
        long j = ov5.a;
        th2 th2Var = (th2) unsafe.getObjectVolatile(this, j);
        if (th2Var instanceof uh2) {
            uh2Var = (uh2) th2Var;
        } else {
            uh2Var = null;
        }
        if (uh2Var != null) {
            ov5 j2 = uh2Var.j();
            while (!j2.s()) {
                th2 th2Var2 = (th2) fy.a.getObjectVolatile(j2, j);
                if (th2Var2 instanceof uh2) {
                    uh2Var2 = (uh2) th2Var2;
                } else {
                    uh2Var2 = null;
                }
                if (uh2Var2 != null) {
                    j2 = uh2Var2.j();
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
