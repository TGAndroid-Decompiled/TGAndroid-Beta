package g2;

import f9.c2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class q extends f9.o implements Map {
    public final Map f12274b;

    public q(Map map) {
        this.f12274b = map;
    }

    @Override
    public final void clear() {
        this.f12274b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f12274b.containsKey(obj)) {
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
        return f9.o.k(this.f12274b.entrySet(), new p(0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && f9.o.i(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f12274b.get(obj);
    }

    @Override
    public final Object h() {
        return this.f12274b;
    }

    @Override
    public final int hashCode() {
        return f9.o.n(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f12274b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return f9.o.k(this.f12274b.keySet(), new p(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f12274b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f12274b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f12274b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f12274b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f12274b.values();
    }
}
