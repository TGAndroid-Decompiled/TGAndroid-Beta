package hd;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
public final class p implements Map, Serializable {
    public static final p f9309a = new Object();

    @Override
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final boolean containsKey(Object obj) {
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        return false;
    }

    @Override
    public final Set entrySet() {
        return q.f9310a;
    }

    @Override
    public final boolean equals(Object obj) {
        if ((obj instanceof Map) && ((Map) obj).isEmpty()) {
            return true;
        }
        return false;
    }

    @Override
    public final Object get(Object obj) {
        return null;
    }

    @Override
    public final int hashCode() {
        return 0;
    }

    @Override
    public final boolean isEmpty() {
        return true;
    }

    @Override
    public final Set keySet() {
        return q.f9310a;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public final int size() {
        return 0;
    }

    public final String toString() {
        return "{}";
    }

    @Override
    public final Collection values() {
        return o.f9308a;
    }
}
