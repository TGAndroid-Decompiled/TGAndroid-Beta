package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15290a;
    public final Object f15291b;
    public c f15292c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15290a = obj;
        this.f15291b = obj2;
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f15290a.equals(cVar.f15290a) && this.f15291b.equals(cVar.f15291b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15290a;
    }

    @Override
    public final Object getValue() {
        return this.f15291b;
    }

    @Override
    public final int hashCode() {
        return this.f15290a.hashCode() ^ this.f15291b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15290a + "=" + this.f15291b;
    }
}
