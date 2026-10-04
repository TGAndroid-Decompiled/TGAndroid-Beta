package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16917a;
    public final Object f16918b;
    public c f16919c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16917a = obj;
        this.f16918b = obj2;
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
        if (this.f16917a.equals(cVar.f16917a) && this.f16918b.equals(cVar.f16918b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16917a;
    }

    @Override
    public final Object getValue() {
        return this.f16918b;
    }

    @Override
    public final int hashCode() {
        return this.f16917a.hashCode() ^ this.f16918b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16917a + "=" + this.f16918b;
    }
}
