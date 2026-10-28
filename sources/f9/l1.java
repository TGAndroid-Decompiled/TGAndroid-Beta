package f9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class l1 extends l implements a1 {
    public final a1 e;
    public final b6.i f10299f;

    public l1(a1 a1Var, b6.i iVar) {
        a1Var.getClass();
        this.e = a1Var;
        this.f10299f = iVar;
    }

    @Override
    public final void clear() {
        this.e.clear();
    }

    @Override
    public final Map d() {
        return new h1(this.e.b(), new e1.c(this, 4));
    }

    @Override
    public final Collection e() {
        return new a8.f(this, 2);
    }

    @Override
    public final Set f() {
        return this.e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.e.a().iterator(), new za.c(this.f10299f, 19));
    }

    @Override
    public final Collection get(Object obj) {
        return o.x((List) this.e.get(obj), new n4.s(17, this.f10299f, obj));
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
