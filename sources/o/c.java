package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f18912a;
    public final Object f18913b;
    public c f18914c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f18912a = obj;
        this.f18913b = obj2;
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
        if (this.f18912a.equals(cVar.f18912a) && this.f18913b.equals(cVar.f18913b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f18912a;
    }

    @Override
    public final Object getValue() {
        return this.f18913b;
    }

    @Override
    public final int hashCode() {
        return this.f18912a.hashCode() ^ this.f18913b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f18912a + "=" + this.f18913b;
    }
}
