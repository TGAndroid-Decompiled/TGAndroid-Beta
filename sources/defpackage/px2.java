package defpackage;
public abstract class px2 extends d2 implements kx2 {
    public static final ox2 b = new ox2(rj2.b, new nx2((byte) 0));

    public px2() {
        super(rj2.b);
    }

    public void c(mx2 mx2Var, Runnable runnable) {
        qb3.d.c(mx2Var, runnable);
    }

    public boolean d(mx2 mx2Var) {
        return !(this instanceof p8c);
    }

    public px2 e(int i) {
        jse.a(i);
        return new m46(this, i);
    }

    @Override
    public final kx2 get(lx2 lx2Var) {
        kx2 kx2Var;
        lx2Var.getClass();
        if (lx2Var instanceof ox2) {
            ox2 ox2Var = (ox2) lx2Var;
            lx2 lx2Var2 = this.a;
            if ((lx2Var2 != ox2Var && ox2Var.b != lx2Var2) || (kx2Var = (kx2) ox2Var.a.invoke(this)) == null) {
                return null;
            }
            return kx2Var;
        } else if (rj2.b != lx2Var) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final mx2 minusKey(lx2 lx2Var) {
        lx2Var.getClass();
        if (lx2Var instanceof ox2) {
            ox2 ox2Var = (ox2) lx2Var;
            lx2 lx2Var2 = this.a;
            if (lx2Var2 != ox2Var && ox2Var.b != lx2Var2) {
                return this;
            }
            if (((kx2) ox2Var.a.invoke(this)) == null) {
                return this;
            }
        } else if (rj2.b != lx2Var) {
            return this;
        }
        return u24.a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + l93.a(this);
    }
}
