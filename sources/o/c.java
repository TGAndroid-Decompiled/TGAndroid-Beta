package o;

import java.util.Map;

public final class c implements Map.Entry {

    public final Object f19078a;

    public final Object f19079b;

    public c f19080c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f19078a = obj;
        this.f19079b = obj2;
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
        return this.f19078a.equals(cVar.f19078a) && this.f19079b.equals(cVar.f19079b);
    }

    @Override
    public final Object getKey() {
        return this.f19078a;
    }

    @Override
    public final Object getValue() {
        return this.f19079b;
    }

    @Override
    public final int hashCode() {
        return this.f19078a.hashCode() ^ this.f19079b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f19078a + "=" + this.f19079b;
    }
}
