package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class qo5 extends ig0 implements Serializable {
    public final transient o99 e;
    public final transient int f;

    public qo5(o99 o99Var, int i) {
        this.e = o99Var;
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
        return new vo5(this);
    }

    @Override
    public final Collection g() {
        return (jo5) super.g();
    }

    @Override
    public final Iterator h() {
        return new uo5(this);
    }

    @Override
    public final Collection i(Object obj) {
        po5 po5Var = (po5) this.e.get(obj);
        if (po5Var == null) {
            no5 no5Var = po5.b;
            return j99.e;
        }
        return po5Var;
    }

    @Override
    public final Set j() {
        o99 o99Var = this.e;
        bp5 bp5Var = o99Var.b;
        if (bp5Var == null) {
            m99 d = o99Var.d();
            o99Var.b = d;
            return d;
        }
        return bp5Var;
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
    public to5 a() {
        return this.e;
    }
}
