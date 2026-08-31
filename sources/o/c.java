package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16272a;
    public final Object f16273b;
    public c f16274c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16272a = obj;
        this.f16273b = obj2;
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
        if (this.f16272a.equals(cVar.f16272a) && this.f16273b.equals(cVar.f16273b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16272a;
    }

    @Override
    public final Object getValue() {
        return this.f16273b;
    }

    @Override
    public final int hashCode() {
        return this.f16272a.hashCode() ^ this.f16273b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16272a + "=" + this.f16273b;
    }
}
