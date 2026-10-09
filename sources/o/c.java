package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16875a;
    public final Object f16876b;
    public c f16877c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16875a = obj;
        this.f16876b = obj2;
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
        if (this.f16875a.equals(cVar.f16875a) && this.f16876b.equals(cVar.f16876b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16875a;
    }

    @Override
    public final Object getValue() {
        return this.f16876b;
    }

    @Override
    public final int hashCode() {
        return this.f16875a.hashCode() ^ this.f16876b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16875a + "=" + this.f16876b;
    }
}
