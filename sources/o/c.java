package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15477a;
    public final Object f15478b;
    public c f15479c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15477a = obj;
        this.f15478b = obj2;
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
        if (this.f15477a.equals(cVar.f15477a) && this.f15478b.equals(cVar.f15478b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15477a;
    }

    @Override
    public final Object getValue() {
        return this.f15478b;
    }

    @Override
    public final int hashCode() {
        return this.f15477a.hashCode() ^ this.f15478b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15477a + "=" + this.f15478b;
    }
}
