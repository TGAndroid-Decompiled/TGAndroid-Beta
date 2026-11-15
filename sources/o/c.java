package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21185a;
    public final Object f21186b;
    public c f21187c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21185a = obj;
        this.f21186b = obj2;
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
        if (this.f21185a.equals(cVar.f21185a) && this.f21186b.equals(cVar.f21186b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21185a;
    }

    @Override
    public final Object getValue() {
        return this.f21186b;
    }

    @Override
    public final int hashCode() {
        return this.f21185a.hashCode() ^ this.f21186b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21185a + "=" + this.f21186b;
    }
}
