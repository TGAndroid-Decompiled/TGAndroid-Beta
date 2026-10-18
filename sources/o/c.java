package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17504a;
    public final Object f17505b;
    public c f17506c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17504a = obj;
        this.f17505b = obj2;
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
        if (this.f17504a.equals(cVar.f17504a) && this.f17505b.equals(cVar.f17505b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17504a;
    }

    @Override
    public final Object getValue() {
        return this.f17505b;
    }

    @Override
    public final int hashCode() {
        return this.f17504a.hashCode() ^ this.f17505b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17504a + "=" + this.f17505b;
    }
}
