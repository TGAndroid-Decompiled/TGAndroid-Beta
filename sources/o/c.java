package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f18977a;
    public final Object f18978b;
    public c f18979c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f18977a = obj;
        this.f18978b = obj2;
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
        if (this.f18977a.equals(cVar.f18977a) && this.f18978b.equals(cVar.f18978b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f18977a;
    }

    @Override
    public final Object getValue() {
        return this.f18978b;
    }

    @Override
    public final int hashCode() {
        return this.f18977a.hashCode() ^ this.f18978b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f18977a + "=" + this.f18978b;
    }
}
