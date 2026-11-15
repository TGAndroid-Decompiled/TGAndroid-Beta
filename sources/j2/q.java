package j2;

import h9.c2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class q extends h9.o implements Map {
    public final Map f16824b;

    public q(Map map) {
        this.f16824b = map;
    }

    @Override
    public final void clear() {
        this.f16824b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f16824b.containsKey(obj)) {
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
        return h9.o.l(this.f16824b.entrySet(), new p(0));
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
        return (List) this.f16824b.get(obj);
    }

    @Override
    public final int hashCode() {
        return h9.o.o(entrySet());
    }

    @Override
    public final Object i() {
        return this.f16824b;
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f16824b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return h9.o.l(this.f16824b.keySet(), new p(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f16824b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f16824b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f16824b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f16824b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f16824b.values();
    }
}
