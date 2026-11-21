package j2;

import h9.d2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class q extends h9.o implements Map {
    public final Map f17231b;

    public q(Map map) {
        this.f17231b = map;
    }

    @Override
    public final void clear() {
        this.f17231b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f17231b.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((d2) entrySet()).iterator();
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
        return h9.o.l(this.f17231b.entrySet(), new p(0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && h9.o.j(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f17231b.get(obj);
    }

    @Override
    public final int hashCode() {
        return h9.o.o(entrySet());
    }

    @Override
    public final Object i() {
        return this.f17231b;
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f17231b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return h9.o.l(this.f17231b.keySet(), new p(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f17231b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f17231b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f17231b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f17231b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f17231b.values();
    }
}
