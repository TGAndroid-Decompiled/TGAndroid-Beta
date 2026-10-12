package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16627a;
    public final Object f16628b;
    public c f16629c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16627a = obj;
        this.f16628b = obj2;
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
        if (this.f16627a.equals(cVar.f16627a) && this.f16628b.equals(cVar.f16628b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16627a;
    }

    @Override
    public final Object getValue() {
        return this.f16628b;
    }

    @Override
    public final int hashCode() {
        return this.f16627a.hashCode() ^ this.f16628b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16627a + "=" + this.f16628b;
    }
}
