package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
public class no5 extends ih0 implements Serializable {
    public final transient d89 e;
    public final transient int f;

    public no5(d89 d89Var, int i) {
        this.e = d89Var;
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
        return new so5(this);
    }

    @Override
    public final Collection g() {
        return (go5) super.g();
    }

    @Override
    public final Iterator h() {
        return new ro5(this);
    }

    @Override
    public final Collection i(Object obj) {
        mo5 mo5Var = (mo5) this.e.get(obj);
        if (mo5Var == null) {
            ko5 ko5Var = mo5.b;
            return y79.e;
        }
        return mo5Var;
    }

    @Override
    public final Set j() {
        d89 d89Var = this.e;
        yo5 yo5Var = d89Var.b;
        if (yo5Var == null) {
            b89 d = d89Var.d();
            d89Var.b = d;
            return d;
        }
        return yo5Var;
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
    public qo5 a() {
        return this.e;
    }
}
