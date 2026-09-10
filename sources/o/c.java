package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f14075a;
    public final Object f14076b;
    public c f14077c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f14075a = obj;
        this.f14076b = obj2;
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
        if (this.f14075a.equals(cVar.f14075a) && this.f14076b.equals(cVar.f14076b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f14075a;
    }

    @Override
    public final Object getValue() {
        return this.f14076b;
    }

    @Override
    public final int hashCode() {
        return this.f14075a.hashCode() ^ this.f14076b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f14075a + "=" + this.f14076b;
    }
}
