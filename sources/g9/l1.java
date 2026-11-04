package g9;

import ei.y8;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class l1 extends l implements a1 {
    public final a1 f12099e;
    public final c6.i f12100f;

    public l1(a1 a1Var, c6.i iVar) {
        a1Var.getClass();
        this.f12099e = a1Var;
        this.f12100f = iVar;
    }

    @Override
    public final void clear() {
        this.f12099e.clear();
    }

    @Override
    public final Map d() {
        return new h1(this.f12099e.b(), new y8(this, 4));
    }

    @Override
    public final Collection e() {
        return new b8.f(this, 2);
    }

    @Override
    public final Set f() {
        return this.f12099e.keySet();
    }

    @Override
    public final Iterator g() {
        return new w0(this.f12099e.a().iterator(), new bb.c(this.f12100f, 27));
    }

    @Override
    public final Collection get(Object obj) {
        return o.y((List) this.f12099e.get(obj), new tf.b(this.f12100f, obj));
    }

    @Override
    public final boolean remove(Object obj, Object obj2) {
        return get(obj).remove(obj2);
    }

    @Override
    public final int size() {
        return this.f12099e.size();
    }
}
