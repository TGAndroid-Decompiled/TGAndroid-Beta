package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class sk6 extends AbstractMap {
    public final Map a;
    public final rk6 b;

    public sk6(Map map, rk6 rk6Var) {
        map.getClass();
        this.a = map;
        this.b = rk6Var;
    }

    @Override
    public final void clear() {
        this.a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override
    public final Set entrySet() {
        return new c3(this, (byte) 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.b.c(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.a;
        if (map.containsKey(obj)) {
            return this.b.c(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Collection values() {
        return new q3((AbstractMap) this, (byte) 3);
    }
}
