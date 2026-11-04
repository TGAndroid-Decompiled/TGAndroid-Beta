package g9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class h1 extends AbstractMap {
    public final Map f12081a;
    public final g1 f12082b;

    public h1(Map map, g1 g1Var) {
        map.getClass();
        this.f12081a = map;
        this.f12082b = g1Var;
    }

    @Override
    public final void clear() {
        this.f12081a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f12081a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f12081a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f12082b.l(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f12081a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f12081a;
        if (map.containsKey(obj)) {
            return this.f12082b.l(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f12081a.size();
    }

    @Override
    public final Collection values() {
        return new b8.f((AbstractMap) this, 5);
    }
}
