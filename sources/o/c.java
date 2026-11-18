package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21549a;
    public final Object f21550b;
    public c f21551c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21549a = obj;
        this.f21550b = obj2;
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
        if (this.f21549a.equals(cVar.f21549a) && this.f21550b.equals(cVar.f21550b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21549a;
    }

    @Override
    public final Object getValue() {
        return this.f21550b;
    }

    @Override
    public final int hashCode() {
        return this.f21549a.hashCode() ^ this.f21550b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21549a + "=" + this.f21550b;
    }
}
