package e9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class m1 extends AbstractMap {
    public final Map f8475a;
    public final l1 f8476b;

    public m1(Map map, l1 l1Var) {
        map.getClass();
        this.f8475a = map;
        this.f8476b = l1Var;
    }

    @Override
    public final void clear() {
        this.f8475a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f8475a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f8475a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f8476b.p(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f8475a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f8475a;
        if (map.containsKey(obj)) {
            return this.f8476b.p(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f8475a.size();
    }

    @Override
    public final Collection values() {
        return new o((AbstractMap) this, 3);
    }
}
