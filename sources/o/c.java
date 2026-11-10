package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f20669a;
    public final Object f20670b;
    public c f20671c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f20669a = obj;
        this.f20670b = obj2;
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
        if (this.f20669a.equals(cVar.f20669a) && this.f20670b.equals(cVar.f20670b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f20669a;
    }

    @Override
    public final Object getValue() {
        return this.f20670b;
    }

    @Override
    public final int hashCode() {
        return this.f20669a.hashCode() ^ this.f20670b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f20669a + "=" + this.f20670b;
    }
}
