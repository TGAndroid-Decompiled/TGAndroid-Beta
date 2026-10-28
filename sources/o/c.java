package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f18911a;
    public final Object f18912b;
    public c f18913c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f18911a = obj;
        this.f18912b = obj2;
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
        if (this.f18911a.equals(cVar.f18911a) && this.f18912b.equals(cVar.f18912b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f18911a;
    }

    @Override
    public final Object getValue() {
        return this.f18912b;
    }

    @Override
    public final int hashCode() {
        return this.f18911a.hashCode() ^ this.f18912b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f18911a + "=" + this.f18912b;
    }
}
