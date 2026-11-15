package a8;

import java.util.Map;
public abstract class g implements Map.Entry {
    public final int f409a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.f409a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!w0.a(getKey(), entry.getKey()) || !w0.a(getValue(), entry.getValue())) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!f8.a(getKey(), entry2.getKey()) || !f8.a(getValue(), entry2.getValue())) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f409a) {
            case 0:
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
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                int i10 = 0;
                if (key2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = key2.hashCode();
                }
                if (value2 != null) {
                    i10 = value2.hashCode();
                }
                return hashCode2 ^ i10;
        }
    }

    public final String toString() {
        switch (this.f409a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return p0.E(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public g(int i7, boolean z10) {
        this.f409a = i7;
    }
}
