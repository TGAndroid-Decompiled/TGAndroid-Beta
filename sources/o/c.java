package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f15429a;
    public final Object f15430b;
    public c f15431c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f15429a = obj;
        this.f15430b = obj2;
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
        if (this.f15429a.equals(cVar.f15429a) && this.f15430b.equals(cVar.f15430b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f15429a;
    }

    @Override
    public final Object getValue() {
        return this.f15430b;
    }

    @Override
    public final int hashCode() {
        return this.f15429a.hashCode() ^ this.f15430b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f15429a + "=" + this.f15430b;
    }
}
