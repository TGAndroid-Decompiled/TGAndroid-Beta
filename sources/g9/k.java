package g9;

import b8.yb;
import java.util.Map;
public abstract class k implements Map.Entry {
    @Override
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (yb.a(getKey(), entry.getKey()) && yb.a(getValue(), entry.getValue())) {
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
        int i3 = 0;
        if (key == null) {
            hashCode = 0;
        } else {
            hashCode = key.hashCode();
        }
        if (value != null) {
            i3 = value.hashCode();
        }
        return hashCode ^ i3;
    }

    @Override
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
