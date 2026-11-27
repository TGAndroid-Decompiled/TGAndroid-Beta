package defpackage;
public abstract class aie {
    public static final Object a(long j, zw2 zw2Var) {
        if (j > 0) {
            va1 va1Var = new va1(1, xpe.a(zw2Var));
            va1Var.s();
            if (j < Long.MAX_VALUE) {
                b(va1Var.e).b(j, va1Var);
            }
            Object q = va1Var.q();
            if (q == vx2.a) {
                return q;
            }
        }
        return f9c.a;
    }

    public static final vd3 b(mx2 mx2Var) {
        vd3 vd3Var;
        kx2 kx2Var = mx2Var.get(rj2.b);
        if (kx2Var instanceof vd3) {
            vd3Var = (vd3) kx2Var;
        } else {
            vd3Var = null;
        }
        if (vd3Var == null) {
            return bb3.a;
        }
        return vd3Var;
    }
}
