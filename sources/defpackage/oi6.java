package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class oi6 extends AbstractMap {
    public final Map a;
    public final ni6 b;

    public oi6(Map map, ni6 ni6Var) {
        map.getClass();
        this.a = map;
        this.b = ni6Var;
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
        return new b3(this, (byte) 1);
    }

    @Override
    public final Object get(Object obj) {
        Map map = this.a;
        Object obj2 = map.get(obj);
        if (obj2 == null && !map.containsKey(obj)) {
            return null;
        }
        return this.b.e(obj, obj2);
    }

    @Override
    public final Set keySet() {
        return this.a.keySet();
    }

    @Override
    public final Object remove(Object obj) {
        Map map = this.a;
        if (map.containsKey(obj)) {
            return this.b.e(obj, map.remove(obj));
        }
        return null;
    }

    @Override
    public final int size() {
        return this.a.size();
    }

    @Override
    public final Collection values() {
        return new p3((AbstractMap) this, (byte) 3);
    }
}
