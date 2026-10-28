package f9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class h1 extends AbstractMap {
    public final Map f10284a;
    public final g1 f10285b;

    public h1(Map map, g1 g1Var) {
        map.getClass();
        this.f10284a = map;
        this.f10285b = g1Var;
    }

    @Override
    public final void clear() {
        this.f10284a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f10284a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f10284a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f10285b.l(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f10284a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f10284a;
        if (map.containsKey(obj)) {
            return this.f10285b.l(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f10284a.size();
    }

    @Override
    public final Collection values() {
        return new a8.f((AbstractMap) this, 5);
    }
}
