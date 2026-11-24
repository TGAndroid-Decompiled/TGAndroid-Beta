package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
public final class va3 extends cie implements Map {
    public final Map b;

    public va3(Map map) {
        this.b = map;
    }

    @Override
    public final void clear() {
        this.b.clear();
    }

    @Override
    public final boolean containsKey(Object obj) {
        if (obj != null && this.b.containsKey(obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        xyb xybVar = new xyb(entrySet().iterator());
        if (obj == null) {
            while (xybVar.hasNext()) {
                if (xybVar.next() == null) {
                    return true;
                }
            }
            return false;
        }
        while (xybVar.hasNext()) {
            if (obj.equals(xybVar.next())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final Object d() {
        return this.b;
    }

    @Override
    public final Set entrySet() {
        return yte.b(this.b.entrySet(), new ua3((byte) 0));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != null && coe.b(this, obj)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) this.b.get(obj);
    }

    @Override
    public final int hashCode() {
        return yte.c(entrySet());
    }

    @Override
    public final boolean isEmpty() {
        Map map = this.b;
        if (map.isEmpty() || (map.size() == 1 && map.containsKey(null))) {
            return true;
        }
        return false;
    }

    @Override
    public final Set keySet() {
        return yte.b(this.b.keySet(), new ua3((byte) 1));
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        return this.b.put(obj, obj2);
    }

    @Override
    public final void putAll(Map map) {
        this.b.putAll(map);
    }

    @Override
    public final Object remove(Object obj) {
        return this.b.remove(obj);
    }

    @Override
    public final int size() {
        Map map = this.b;
        return map.size() - (map.containsKey(null) ? 1 : 0);
    }

    @Override
    public final Collection values() {
        return this.b.values();
    }
}
