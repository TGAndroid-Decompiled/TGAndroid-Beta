package b8;

import java.util.Map;
public abstract class bh implements Map.Entry {
    public final int f2493a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.f2493a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                if (!m1.a(getKey(), entry.getKey()) || !m1.a(getValue(), entry.getValue())) {
                    return false;
                }
                return true;
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                if (!x7.w6.a(getKey(), entry2.getKey()) || !x7.w6.a(getValue(), entry2.getValue())) {
                    return false;
                }
                return true;
        }
    }

    @Override
    public final int hashCode() {
        int hashCode;
        int hashCode2;
        switch (this.f2493a) {
            case 0:
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
        switch (this.f2493a) {
            case 0:
                return a1.g.C(String.valueOf(getKey()), "=", String.valueOf(getValue()));
            default:
                return getKey() + "=" + getValue();
        }
    }

    public bh(int i3, boolean z10) {
        this.f2493a = i3;
    }
}
