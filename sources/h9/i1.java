package h9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class i1 extends AbstractMap {
    public final Map f14332a;
    public final h1 f14333b;

    public i1(Map map, h1 h1Var) {
        map.getClass();
        this.f14332a = map;
        this.f14333b = h1Var;
    }

    @Override
    public final void clear() {
        this.f14332a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f14332a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f14332a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f14333b.j(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f14332a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f14332a;
        if (map.containsKey(obj)) {
            return this.f14333b.j(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f14332a.size();
    }

    @Override
    public final Collection values() {
        return new a8.n((AbstractMap) this, 7);
    }
}
