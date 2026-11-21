package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21574a;
    public final Object f21575b;
    public c f21576c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21574a = obj;
        this.f21575b = obj2;
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
        if (this.f21574a.equals(cVar.f21574a) && this.f21575b.equals(cVar.f21575b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21574a;
    }

    @Override
    public final Object getValue() {
        return this.f21575b;
    }

    @Override
    public final int hashCode() {
        return this.f21574a.hashCode() ^ this.f21575b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21574a + "=" + this.f21575b;
    }
}
