package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f13901a;
    public final Object f13902b;
    public c f13903c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f13901a = obj;
        this.f13902b = obj2;
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
        if (this.f13901a.equals(cVar.f13901a) && this.f13902b.equals(cVar.f13902b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f13901a;
    }

    @Override
    public final Object getValue() {
        return this.f13902b;
    }

    @Override
    public final int hashCode() {
        return this.f13901a.hashCode() ^ this.f13902b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f13901a + "=" + this.f13902b;
    }
}
