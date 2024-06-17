package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class EmptyMap implements Map, Serializable {
    public static final EmptyMap INSTANCE = new EmptyMap();

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object obj) {
        return false;
    }

    public boolean containsValue(Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    @Override
    public Void get(Object obj) {
        return null;
    }

    public int getSize() {
        return 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public Void remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public String toString() {
        return "{}";
    }

    private EmptyMap() {
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return containsValue((Void) obj);
        }
        return false;
    }

    @Override
    public final Set<Map.Entry> entrySet() {
        return getEntries();
    }

    @Override
    public final Set<Object> keySet() {
        return getKeys();
    }

    @Override
    public final int size() {
        return getSize();
    }

    @Override
    public final Collection values() {
        return getValues();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    public Set<Map.Entry> getEntries() {
        return EmptySet.INSTANCE;
    }

    public Set<Object> getKeys() {
        return EmptySet.INSTANCE;
    }

    public Collection getValues() {
        return EmptyList.INSTANCE;
    }
}
