package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16786a;
    public final Object f16787b;
    public c f16788c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16786a = obj;
        this.f16787b = obj2;
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
        if (this.f16786a.equals(cVar.f16786a) && this.f16787b.equals(cVar.f16787b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16786a;
    }

    @Override
    public final Object getValue() {
        return this.f16787b;
    }

    @Override
    public final int hashCode() {
        return this.f16786a.hashCode() ^ this.f16787b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16786a + "=" + this.f16787b;
    }
}
