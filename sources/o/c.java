package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f17564a;
    public final Object f17565b;
    public c f17566c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f17564a = obj;
        this.f17565b = obj2;
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
        if (this.f17564a.equals(cVar.f17564a) && this.f17565b.equals(cVar.f17565b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f17564a;
    }

    @Override
    public final Object getValue() {
        return this.f17565b;
    }

    @Override
    public final int hashCode() {
        return this.f17564a.hashCode() ^ this.f17565b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f17564a + "=" + this.f17565b;
    }
}
