package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class nm5 extends hg0 implements Serializable {
    public final transient b69 e;
    public final transient int f;

    public nm5(b69 b69Var, int i) {
        this.e = b69Var;
        this.f = i;
    }

    @Override
    public final boolean c(Object obj) {
        if (obj != null && super.c(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Collection e() {
        return new sm5(this);
    }

    @Override
    public final Collection g() {
        return (gm5) super.g();
    }

    @Override
    public final Iterator h() {
        return new rm5(this);
    }

    @Override
    public final Collection i(Object obj) {
        mm5 mm5Var = (mm5) this.e.get(obj);
        if (mm5Var == null) {
            km5 km5Var = mm5.b;
            return w59.e;
        }
        return mm5Var;
    }

    @Override
    public final Set j() {
        b69 b69Var = this.e;
        ym5 ym5Var = b69Var.b;
        if (ym5Var == null) {
            z59 d = b69Var.d();
            b69Var.b = d;
            return d;
        }
        return ym5Var;
    }

    @Override
    public final boolean k(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public final int l() {
        return this.f;
    }

    @Override
    public qm5 a() {
        return this.e;
    }
}
