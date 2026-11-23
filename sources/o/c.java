package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21642a;
    public final Object f21643b;
    public c f21644c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21642a = obj;
        this.f21643b = obj2;
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
        if (this.f21642a.equals(cVar.f21642a) && this.f21643b.equals(cVar.f21643b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21642a;
    }

    @Override
    public final Object getValue() {
        return this.f21643b;
    }

    @Override
    public final int hashCode() {
        return this.f21642a.hashCode() ^ this.f21643b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21642a + "=" + this.f21643b;
    }
}
