package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21543a;
    public final Object f21544b;
    public c f21545c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21543a = obj;
        this.f21544b = obj2;
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
        if (this.f21543a.equals(cVar.f21543a) && this.f21544b.equals(cVar.f21544b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21543a;
    }

    @Override
    public final Object getValue() {
        return this.f21544b;
    }

    @Override
    public final int hashCode() {
        return this.f21543a.hashCode() ^ this.f21544b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21543a + "=" + this.f21544b;
    }
}
