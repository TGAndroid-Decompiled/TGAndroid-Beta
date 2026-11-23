package h9;

import di.v6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class m1 extends l implements a1 {
    public final a1 f14056e;
    public final g1 f14057f;

    public m1(a1 a1Var, g1 g1Var) {
        a1Var.getClass();
        this.f14056e = a1Var;
        this.f14057f = g1Var;
    }

    @Override
    public final void clear() {
        this.f14056e.clear();
    }

    @Override
    public final Map d() {
        return new i1(this.f14056e.b(), new v6(this, 16));
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        return this.f14056e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f14056e.a().iterator(), new ob.c(this.f14057f, 27));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f14056e.get(obj), new q4.q(this.f14057f, obj, false, 24));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f14056e.size();
    }
}
