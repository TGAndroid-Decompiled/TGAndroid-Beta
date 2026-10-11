package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16925a;
    public final Object f16926b;
    public c f16927c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16925a = obj;
        this.f16926b = obj2;
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
        if (this.f16925a.equals(cVar.f16925a) && this.f16926b.equals(cVar.f16926b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16925a;
    }

    @Override
    public final Object getValue() {
        return this.f16926b;
    }

    @Override
    public final int hashCode() {
        return this.f16925a.hashCode() ^ this.f16926b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16925a + "=" + this.f16926b;
    }
}
