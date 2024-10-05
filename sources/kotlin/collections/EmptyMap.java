package kotlin.collections;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

public final class EmptyMap implements Map, Serializable {
    public static final EmptyMap INSTANCE = new EmptyMap();

    private EmptyMap() {
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override
    public boolean containsKey(Object obj) {
        return false;
    }

    @Override
    public final boolean containsValue(Object obj) {
        if (obj instanceof Void) {
            return containsValue((Void) obj);
        }
        return false;
    }

    public boolean containsValue(Void value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return false;
    }

    @Override
    public final Set entrySet() {
        return getEntries();
    }

    @Override
    public boolean equals(Object obj) {
        return (obj instanceof Map) && ((Map) obj).isEmpty();
    }

    @Override
    public Void get(Object obj) {
        return null;
    }

    public Set getEntries() {
        return EmptySet.INSTANCE;
    }

    public Set getKeys() {
        return EmptySet.INSTANCE;
    }

    public int getSize() {
        return 0;
    }

    public Collection getValues() {
        return EmptyList.INSTANCE;
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
    public final Set keySet() {
        return getKeys();
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

    @Override
    public final int size() {
        return getSize();
    }

    public String toString() {
        return "{}";
    }

    @Override
    public final Collection values() {
        return getValues();
    }
}
