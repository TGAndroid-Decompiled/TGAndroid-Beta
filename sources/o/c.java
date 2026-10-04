package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16922a;
    public final Object f16923b;
    public c f16924c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16922a = obj;
        this.f16923b = obj2;
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
        if (this.f16922a.equals(cVar.f16922a) && this.f16923b.equals(cVar.f16923b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16922a;
    }

    @Override
    public final Object getValue() {
        return this.f16923b;
    }

    @Override
    public final int hashCode() {
        return this.f16922a.hashCode() ^ this.f16923b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16922a + "=" + this.f16923b;
    }
}
