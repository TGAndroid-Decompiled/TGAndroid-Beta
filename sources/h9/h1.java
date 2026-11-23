package h9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class h1 extends AbstractMap {
    public final Map f13993a;
    public final g1 f13994b;

    public h1(Map map, g1 g1Var) {
        map.getClass();
        this.f13993a = map;
        this.f13994b = g1Var;
    }

    @Override
    public final void clear() {
        this.f13993a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f13993a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f13993a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f13994b.u(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f13993a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f13993a;
        if (map.containsKey(obj)) {
            return this.f13994b.u(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f13993a.size();
    }

    @Override
    public final Collection values() {
        return new a8.n((AbstractMap) this, 7);
    }
}
