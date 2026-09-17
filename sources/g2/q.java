package g2;

import e9.j1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class q extends e9.q implements Map {
    public final Map f10350b;

    public q(Map map) {
        this.f10350b = map;
    }

    @Override
    public final void clear() {
        this.f10350b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f10350b.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((j1) entrySet()).iterator();
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
        return e9.q.j(this.f10350b.entrySet(), new p(0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && e9.q.h(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object g() {
        return this.f10350b;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f10350b.get(obj);
    }

    @Override
    public final int hashCode() {
        return e9.q.m(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f10350b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return e9.q.j(this.f10350b.keySet(), new p(1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f10350b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f10350b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f10350b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f10350b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.f10350b.values();
    }
}
