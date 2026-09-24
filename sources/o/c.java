package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15457a;
    public final Object f15458b;
    public c f15459c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15457a = obj;
        this.f15458b = obj2;
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
        if (this.f15457a.equals(cVar.f15457a) && this.f15458b.equals(cVar.f15458b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15457a;
    }

    @Override
    public final Object getValue() {
        return this.f15458b;
    }

    @Override
    public final int hashCode() {
        return this.f15457a.hashCode() ^ this.f15458b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15457a + "=" + this.f15458b;
    }
}
