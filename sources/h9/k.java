package h9;

import a8.ha;
import java.util.Map;
public abstract class k implements Map.Entry {
    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (ha.a(getKey(), entry.getKey()) && ha.a(getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final int hashCode() {
        int hashCode;
        Object key = getKey();
        Object value = getValue();
        int i7 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i7 = value.hashCode();
        }
        return hashCode ^ i7;
    }

    @Override
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
