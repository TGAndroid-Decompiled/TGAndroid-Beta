package i2;

import g9.c2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class r extends g9.o implements Map {
    public final Map f14585b;

    public r(Map map) {
        this.f14585b = map;
    }

    @Override
    public final void clear() {
        this.f14585b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f14585b.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((c2) entrySet()).iterator();
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
        return g9.o.l(this.f14585b.entrySet(), new q(0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && g9.o.j(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f14585b.get(obj);
    }

    @Override
    public final int hashCode() {
        return g9.o.o(entrySet());
    }

    @Override
    public final Object i() {
        return this.f14585b;
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f14585b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return g9.o.l(this.f14585b.keySet(), new q(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f14585b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f14585b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f14585b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f14585b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f14585b.values();
    }
}
