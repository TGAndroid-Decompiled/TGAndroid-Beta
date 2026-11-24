package defpackage;

import java.util.Map;
public abstract class m3 implements Map.Entry {
    public final byte a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (bqe.a(getKey(), entry.getKey()) && bqe.a(getValue(), entry.getValue())) {
                        return true;
                    }
                }
                return false;
            case 1:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry2 = (Map.Entry) obj;
                    if (s3f.a(getKey(), entry2.getKey()) && s3f.a(getValue(), entry2.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry3 = (Map.Entry) obj;
                    if (m1f.a(getKey(), entry3.getKey()) && m1f.a(getValue(), entry3.getValue())) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int i = 0;
        switch (this.a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                if (key == null) {
                    hashCode = 0;
                } else {
                    hashCode = key.hashCode();
                }
                if (value != null) {
                    i = value.hashCode();
                    break;
                }
                break;
            case 1:
                Object key2 = getKey();
                Object value2 = getValue();
                if (key2 == null) {
                    hashCode = 0;
                } else {
                    hashCode = key2.hashCode();
                }
                if (value2 != null) {
                    i = value2.hashCode();
                    break;
                }
                break;
            default:
                Object key3 = getKey();
                Object value3 = getValue();
                if (key3 == null) {
                    hashCode = 0;
                } else {
                    hashCode = key3.hashCode();
                }
                if (value3 != null) {
                    i = value3.hashCode();
                    break;
                }
                break;
        }
        return hashCode ^ i;
    }

    @Override
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        switch (this.a) {
            case 0:
                return getKey() + "=" + getValue();
            case 1:
                return getKey() + "=" + getValue();
            default:
                return tb4.y(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }
}
