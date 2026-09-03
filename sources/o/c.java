package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16274a;
    public final Object f16275b;
    public c f16276c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16274a = obj;
        this.f16275b = obj2;
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
        if (this.f16274a.equals(cVar.f16274a) && this.f16275b.equals(cVar.f16275b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16274a;
    }

    @Override
    public final Object getValue() {
        return this.f16275b;
    }

    @Override
    public final int hashCode() {
        return this.f16274a.hashCode() ^ this.f16275b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16274a + "=" + this.f16275b;
    }
}
