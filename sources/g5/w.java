package g5;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class w implements Map {
    public final Map f6460a;

    public w(Map map) {
        this.f6460a = map;
    }

    @Override
    public final void clear() {
        this.f6460a.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.f6460a.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        Iterator it = ((s8.r0) entrySet()).iterator();
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
        return s8.l.f(this.f6460a.entrySet(), new v(1));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && s8.l.d(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.f6460a.get(obj);
    }

    @Override
    public final int hashCode() {
        return s8.l.i(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.f6460a;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return s8.l.f(this.f6460a.keySet(), new v(0));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.f6460a.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.f6460a.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.f6460a.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.f6460a;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    public final String toString() {
        return this.f6460a.toString();
    }

    @Override
    public final Collection values() {
        return this.f6460a.values();
    }
}
