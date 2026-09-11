package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16759a;
    public final Object f16760b;
    public c f16761c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16759a = obj;
        this.f16760b = obj2;
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
        if (this.f16759a.equals(cVar.f16759a) && this.f16760b.equals(cVar.f16760b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16759a;
    }

    @Override
    public final Object getValue() {
        return this.f16760b;
    }

    @Override
    public final int hashCode() {
        return this.f16759a.hashCode() ^ this.f16760b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16759a + "=" + this.f16760b;
    }
}
