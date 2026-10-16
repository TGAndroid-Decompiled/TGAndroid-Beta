package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16103a;
    public final Object f16104b;
    public c f16105c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16103a = obj;
        this.f16104b = obj2;
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
        if (this.f16103a.equals(cVar.f16103a) && this.f16104b.equals(cVar.f16104b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16103a;
    }

    @Override
    public final Object getValue() {
        return this.f16104b;
    }

    @Override
    public final int hashCode() {
        return this.f16103a.hashCode() ^ this.f16104b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16103a + "=" + this.f16104b;
    }
}
