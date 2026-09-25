package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15472a;
    public final Object f15473b;
    public c f15474c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15472a = obj;
        this.f15473b = obj2;
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
        if (this.f15472a.equals(cVar.f15472a) && this.f15473b.equals(cVar.f15473b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15472a;
    }

    @Override
    public final Object getValue() {
        return this.f15473b;
    }

    @Override
    public final int hashCode() {
        return this.f15472a.hashCode() ^ this.f15473b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15472a + "=" + this.f15473b;
    }
}
