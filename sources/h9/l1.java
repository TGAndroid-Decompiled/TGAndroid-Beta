package h9;

import di.v6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class l1 extends l implements a1 {
    public final a1 f14011e;
    public final h6.o f14012f;

    public l1(a1 a1Var, h6.o oVar) {
        a1Var.getClass();
        this.f14011e = a1Var;
        this.f14012f = oVar;
    }

    @Override
    public final void clear() {
        this.f14011e.clear();
    }

    @Override
    public final Map d() {
        return new h1(this.f14011e.b(), new v6(this, 16));
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        return this.f14011e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f14011e.a().iterator(), new ob.c(this.f14012f, 26));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f14011e.get(obj), new q4.q(this.f14012f, obj, false, 24));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f14011e.size();
    }
}
