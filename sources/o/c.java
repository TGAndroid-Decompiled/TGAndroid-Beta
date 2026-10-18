package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17500a;
    public final Object f17501b;
    public c f17502c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17500a = obj;
        this.f17501b = obj2;
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
        if (this.f17500a.equals(cVar.f17500a) && this.f17501b.equals(cVar.f17501b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17500a;
    }

    @Override
    public final Object getValue() {
        return this.f17501b;
    }

    @Override
    public final int hashCode() {
        return this.f17500a.hashCode() ^ this.f17501b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17500a + "=" + this.f17501b;
    }
}
