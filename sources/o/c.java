package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15473a;
    public final Object f15474b;
    public c f15475c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15473a = obj;
        this.f15474b = obj2;
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
        if (this.f15473a.equals(cVar.f15473a) && this.f15474b.equals(cVar.f15474b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15473a;
    }

    @Override
    public final Object getValue() {
        return this.f15474b;
    }

    @Override
    public final int hashCode() {
        return this.f15473a.hashCode() ^ this.f15474b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15473a + "=" + this.f15474b;
    }
}
