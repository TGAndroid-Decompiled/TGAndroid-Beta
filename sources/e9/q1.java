package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class q1 extends p implements f1 {
    public final f1 e;
    public final k6.h f8607f;

    public q1(f1 f1Var, k6.h hVar) {
        f1Var.getClass();
        this.e = f1Var;
        this.f8607f = hVar;
    }

    @Override
    public final void clear() {
        this.e.clear();
    }

    @Override
    public final Map d() {
        return new m1(this.e.b(), new a1.c(this, 29));
    }

    @Override
    public final Collection e() {
        return new o(this, 0);
    }

    @Override
    public final Set f() {
        return this.e.keySet();
    }

    @Override
    public final Iterator g() {
        return new b1(this.e.a().iterator(), new a6.i(this.f8607f, 16));
    }

    @Override
    public final Collection get(Object obj) {
        return s.x((List) this.e.get(obj), new n4.s(14, this.f8607f, obj));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.e.size();
    }
}
