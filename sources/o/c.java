package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17501a;
    public final Object f17502b;
    public c f17503c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17501a = obj;
        this.f17502b = obj2;
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
        if (this.f17501a.equals(cVar.f17501a) && this.f17502b.equals(cVar.f17502b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17501a;
    }

    @Override
    public final Object getValue() {
        return this.f17502b;
    }

    @Override
    public final int hashCode() {
        return this.f17501a.hashCode() ^ this.f17502b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17501a + "=" + this.f17502b;
    }
}
