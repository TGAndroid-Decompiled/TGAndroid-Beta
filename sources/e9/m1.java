package e9;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class m1 extends AbstractMap {
    public final Map f6388a;
    public final l1 f6389b;

    public m1(Map map, l1 l1Var) {
        map.getClass();
        this.f6388a = map;
        this.f6389b = l1Var;
    }

    @Override
    public final void clear() {
        this.f6388a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.f6388a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c(this, 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.f6388a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.f6389b.c(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.f6388a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.f6388a;
        if (map.containsKey(obj)) {
            return this.f6389b.c(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.f6388a.size();
    }

    @Override
    public final Collection values() {
        return new o((AbstractMap) this, 3);
    }
}
