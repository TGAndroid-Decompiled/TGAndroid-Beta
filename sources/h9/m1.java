package h9;

import di.r4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class m1 extends l implements a1 {
    public final a1 f14350e;
    public final g6.d0 f14351f;

    public m1(a1 a1Var, g6.d0 d0Var) {
        a1Var.getClass();
        this.f14350e = a1Var;
        this.f14351f = d0Var;
    }

    @Override
    public final void clear() {
        this.f14350e.clear();
    }

    @Override
    public final Map d() {
        return new i1(this.f14350e.b(), new r4(this, 18));
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        return this.f14350e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f14350e.a().iterator(), new f1(this.f14351f, 0));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f14350e.get(obj), new q4.q(this.f14351f, obj, false, 26));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f14350e.size();
    }
}
