package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f18736a;
    public final Object f18737b;
    public c f18738c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f18736a = obj;
        this.f18737b = obj2;
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
        if (this.f18736a.equals(cVar.f18736a) && this.f18737b.equals(cVar.f18737b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f18736a;
    }

    @Override
    public final Object getValue() {
        return this.f18737b;
    }

    @Override
    public final int hashCode() {
        return this.f18736a.hashCode() ^ this.f18737b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f18736a + "=" + this.f18737b;
    }
}
