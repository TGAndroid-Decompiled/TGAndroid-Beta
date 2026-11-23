package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21577a;
    public final Object f21578b;
    public c f21579c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21577a = obj;
        this.f21578b = obj2;
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
        if (this.f21577a.equals(cVar.f21577a) && this.f21578b.equals(cVar.f21578b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21577a;
    }

    @Override
    public final Object getValue() {
        return this.f21578b;
    }

    @Override
    public final int hashCode() {
        return this.f21577a.hashCode() ^ this.f21578b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21577a + "=" + this.f21578b;
    }
}
