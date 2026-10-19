package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17503a;
    public final Object f17504b;
    public c f17505c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17503a = obj;
        this.f17504b = obj2;
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
        if (this.f17503a.equals(cVar.f17503a) && this.f17504b.equals(cVar.f17504b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17503a;
    }

    @Override
    public final Object getValue() {
        return this.f17504b;
    }

    @Override
    public final int hashCode() {
        return this.f17503a.hashCode() ^ this.f17504b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17503a + "=" + this.f17504b;
    }
}
