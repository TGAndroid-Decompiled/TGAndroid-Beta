package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f13900a;
    public final Object f13901b;
    public c f13902c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f13900a = obj;
        this.f13901b = obj2;
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
        if (this.f13900a.equals(cVar.f13900a) && this.f13901b.equals(cVar.f13901b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f13900a;
    }

    @Override
    public final Object getValue() {
        return this.f13901b;
    }

    @Override
    public final int hashCode() {
        return this.f13900a.hashCode() ^ this.f13901b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f13900a + "=" + this.f13901b;
    }
}
