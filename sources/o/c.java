package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16918a;
    public final Object f16919b;
    public c f16920c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16918a = obj;
        this.f16919b = obj2;
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
        if (this.f16918a.equals(cVar.f16918a) && this.f16919b.equals(cVar.f16919b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16918a;
    }

    @Override
    public final Object getValue() {
        return this.f16919b;
    }

    @Override
    public final int hashCode() {
        return this.f16918a.hashCode() ^ this.f16919b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16918a + "=" + this.f16919b;
    }
}
