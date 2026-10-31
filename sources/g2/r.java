package g2;

import e9.h2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class r extends e9.s implements Map {
    public final Map f7332b;

    public r(Map map) {
        this.f7332b = map;
    }

    @Override
    public final void clear() {
        this.f7332b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f7332b.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((h2) entrySet()).iterator();
        it.getClass();
        if (obj == null) {
            while (it.hasNext()) {
                if (((Map.Entry) it.next()).getValue() == null) {
                    return true;
                }
            }
            return false;
        }
        while (it.hasNext()) {
            if (obj.equals(((Map.Entry) it.next()).getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Set entrySet() {
        return e9.s.k(this.f7332b.entrySet(), new q(0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && e9.s.i(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f7332b.get(obj);
    }

    @Override
    public final Object h() {
        return this.f7332b;
    }

    @Override
    public final int hashCode() {
        return e9.s.n(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f7332b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return e9.s.k(this.f7332b.keySet(), new q(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f7332b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f7332b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f7332b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f7332b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f7332b.values();
    }
}
