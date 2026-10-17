package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17497a;
    public final Object f17498b;
    public c f17499c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17497a = obj;
        this.f17498b = obj2;
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
        if (this.f17497a.equals(cVar.f17497a) && this.f17498b.equals(cVar.f17498b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17497a;
    }

    @Override
    public final Object getValue() {
        return this.f17498b;
    }

    @Override
    public final int hashCode() {
        return this.f17497a.hashCode() ^ this.f17498b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17497a + "=" + this.f17498b;
    }
}
