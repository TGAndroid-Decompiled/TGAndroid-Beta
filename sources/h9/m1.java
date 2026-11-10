package h9;

import di.r4;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class m1 extends l implements a1 {
    public final a1 f14352e;
    public final g6.d0 f14353f;

    public m1(a1 a1Var, g6.d0 d0Var) {
        a1Var.getClass();
        this.f14352e = a1Var;
        this.f14353f = d0Var;
    }

    @Override
    public final void clear() {
        this.f14352e.clear();
    }

    @Override
    public final Map d() {
        return new i1(this.f14352e.b(), new r4(this, 18));
    }

    @Override
    public final Collection e() {
        return new a8.n(this, 4);
    }

    @Override
    public final Set f() {
        return this.f14352e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f14352e.a().iterator(), new f1(this.f14353f, 0));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f14352e.get(obj), new q4.q(this.f14353f, obj, false, 26));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f14352e.size();
    }
}
