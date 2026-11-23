package h9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class i1 extends AbstractMap {
    public final Map f14036a;
    public final h1 f14037b;

    public i1(Map map, h1 h1Var) {
        map.getClass();
        this.f14036a = map;
        this.f14037b = h1Var;
    }

    @Override
    public final void clear() {
        this.f14036a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f14036a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f14036a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f14037b.m(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f14036a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f14036a;
        if (map.containsKey(obj)) {
            return this.f14037b.m(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f14036a.size();
    }

    @Override
    public final Collection values() {
        return new a8.n((AbstractMap) this, 7);
    }
}
