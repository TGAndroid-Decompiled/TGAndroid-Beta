package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15464a;
    public final Object f15465b;
    public c f15466c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15464a = obj;
        this.f15465b = obj2;
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
        if (this.f15464a.equals(cVar.f15464a) && this.f15465b.equals(cVar.f15465b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15464a;
    }

    @Override
    public final Object getValue() {
        return this.f15465b;
    }

    @Override
    public final int hashCode() {
        return this.f15464a.hashCode() ^ this.f15465b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15464a + "=" + this.f15465b;
    }
}
