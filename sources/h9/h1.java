package h9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class h1 extends AbstractMap {
    public final Map f13684a;
    public final g1 f13685b;

    public h1(Map map, g1 g1Var) {
        map.getClass();
        this.f13684a = map;
        this.f13685b = g1Var;
    }

    @Override
    public final void clear() {
        this.f13684a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f13684a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f13684a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f13685b.a(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f13684a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f13684a;
        if (map.containsKey(obj)) {
            return this.f13685b.a(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f13684a.size();
    }

    @Override
    public final Collection values() {
        return new a8.n((AbstractMap) this, 7);
    }
}
