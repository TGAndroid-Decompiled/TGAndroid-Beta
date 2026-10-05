package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16927a;
    public final Object f16928b;
    public c f16929c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16927a = obj;
        this.f16928b = obj2;
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
        if (this.f16927a.equals(cVar.f16927a) && this.f16928b.equals(cVar.f16928b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16927a;
    }

    @Override
    public final Object getValue() {
        return this.f16928b;
    }

    @Override
    public final int hashCode() {
        return this.f16927a.hashCode() ^ this.f16928b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16927a + "=" + this.f16928b;
    }
}
