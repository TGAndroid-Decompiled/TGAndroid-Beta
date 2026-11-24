package defpackage;
public abstract class vw2 extends c2 implements qw2 {
    public static final uw2 b = new uw2(vi2.b, new tw2((byte) 0));

    public vw2() {
        super(vi2.b);
    }

    public void c(sw2 sw2Var, Runnable runnable) {
        xa3.d.c(sw2Var, runnable);
    }

    public boolean d(sw2 sw2Var) {
        return !(this instanceof q4c);
    }

    public vw2 e(int i) {
        rne.a(i);
        return new i26(this, i);
    }

    @Override
    public final qw2 get(rw2 rw2Var) {
        qw2 qw2Var;
        rw2Var.getClass();
        if (rw2Var instanceof uw2) {
            uw2 uw2Var = (uw2) rw2Var;
            rw2 rw2Var2 = this.a;
            if ((rw2Var2 != uw2Var && uw2Var.b != rw2Var2) || (qw2Var = (qw2) uw2Var.a.invoke(this)) == null) {
                return null;
            }
            return qw2Var;
        } else if (vi2.b != rw2Var) {
            return null;
        } else {
            return this;
        }
    }

    @Override
    public final sw2 minusKey(rw2 rw2Var) {
        rw2Var.getClass();
        if (rw2Var instanceof uw2) {
            uw2 uw2Var = (uw2) rw2Var;
            rw2 rw2Var2 = this.a;
            if (rw2Var2 != uw2Var && uw2Var.b != rw2Var2) {
                return this;
            }
            if (((qw2) uw2Var.a.invoke(this)) == null) {
                return this;
            }
        } else if (vi2.b != rw2Var) {
            return this;
        }
        return z14.a;
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + s83.a(this);
    }
}
