package l7;

import java.util.Map;
public abstract class f implements Map.Entry {
    public final int f11840a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.f11840a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!k7.j.a(getKey(), entry.getKey()) || !k7.j.a(getValue(), entry.getValue())) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!k7.e0.a(getKey(), entry2.getKey()) || !k7.e0.a(getValue(), entry2.getValue())) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f11840a) {
            case 0:
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
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                int i11 = 0;
                if (key2 == null) {
                    hashCode2 = 0;
                } else {
                    hashCode2 = key2.hashCode();
                }
                if (value2 != null) {
                    i11 = value2.hashCode();
                }
                return hashCode2 ^ i11;
        }
    }

    public final String toString() {
        switch (this.f11840a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return android.support.v4.media.a.z(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public f(int i10, boolean z4) {
        this.f11840a = i10;
    }
}
