package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16961a;
    public final Object f16962b;
    public c f16963c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16961a = obj;
        this.f16962b = obj2;
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
        if (this.f16961a.equals(cVar.f16961a) && this.f16962b.equals(cVar.f16962b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16961a;
    }

    @Override
    public final Object getValue() {
        return this.f16962b;
    }

    @Override
    public final int hashCode() {
        return this.f16961a.hashCode() ^ this.f16962b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16961a + "=" + this.f16962b;
    }
}
