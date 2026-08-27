package i7;

import java.util.Map;

public abstract class f implements Map.Entry {

    public final int f10631a;

    @Override
    public final boolean equals(Object obj) {
        switch (this.f10631a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return g7.d8.a(getKey(), entry.getKey()) && g7.d8.a(getValue(), entry.getValue());
            default:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry2 = (Map.Entry) obj;
                return g7.x8.a(getKey(), entry2.getKey()) && g7.x8.a(getValue(), entry2.getValue());
        }
    }

    @Override
    public final int hashCode() {
        switch (this.f10631a) {
            case 0:
                Object key = getKey();
                Object value = getValue();
                return (key == null ? 0 : key.hashCode()) ^ (value != null ? value.hashCode() : 0);
            default:
                Object key2 = getKey();
                Object value2 = getValue();
                return (key2 == null ? 0 : key2.hashCode()) ^ (value2 != null ? value2.hashCode() : 0);
        }
    }

    public final String toString() {
        switch (this.f10631a) {
            case 0:
                return getKey() + "=" + getValue();
            default:
                return a9.p.w(String.valueOf(getKey()), "=", String.valueOf(getValue()));
        }
    }

    public f(int i10, boolean z10) {
        this.f10631a = i10;
    }
}
