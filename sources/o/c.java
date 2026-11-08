package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f20664a;
    public final Object f20665b;
    public c f20666c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f20664a = obj;
        this.f20665b = obj2;
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
        if (this.f20664a.equals(cVar.f20664a) && this.f20665b.equals(cVar.f20665b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f20664a;
    }

    @Override
    public final Object getValue() {
        return this.f20665b;
    }

    @Override
    public final int hashCode() {
        return this.f20664a.hashCode() ^ this.f20665b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f20664a + "=" + this.f20665b;
    }
}
