package h9;

import di.z6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class l1 extends l implements a1 {
    public final a1 f13702e;
    public final ob.c f13703f;

    public l1(a1 a1Var, ob.c cVar) {
        a1Var.getClass();
        this.f13702e = a1Var;
        this.f13703f = cVar;
    }

    @Override
    public final void clear() {
        this.f13702e.clear();
    }

    @Override
    public final Map d() {
        return new h1(this.f13702e.b(), new z6(this, 15));
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        return this.f13702e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f13702e.a().iterator(), new d6.i(this.f13703f, 24));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f13702e.get(obj), new q4.q(this.f13703f, obj, false, 24));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f13702e.size();
    }
}
