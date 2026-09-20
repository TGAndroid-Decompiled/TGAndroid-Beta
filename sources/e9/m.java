package e9;

import java.util.Map;
import v7.t6;
public abstract class m implements Map.Entry {
    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (t6.a(getKey(), entry.getKey()) && t6.a(getValue(), entry.getValue())) {
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
        int i10 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i10 = value.hashCode();
        }
        return hashCode ^ i10;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
