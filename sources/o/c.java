package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15288a;
    public final Object f15289b;
    public c f15290c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15288a = obj;
        this.f15289b = obj2;
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
        if (this.f15288a.equals(cVar.f15288a) && this.f15289b.equals(cVar.f15289b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15288a;
    }

    @Override
    public final Object getValue() {
        return this.f15289b;
    }

    @Override
    public final int hashCode() {
        return this.f15288a.hashCode() ^ this.f15289b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15288a + "=" + this.f15289b;
    }
}
