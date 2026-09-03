package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16119a;
    public final Object f16120b;
    public c f16121c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16119a = obj;
        this.f16120b = obj2;
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
        if (this.f16119a.equals(cVar.f16119a) && this.f16120b.equals(cVar.f16120b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16119a;
    }

    @Override
    public final Object getValue() {
        return this.f16120b;
    }

    @Override
    public final int hashCode() {
        return this.f16119a.hashCode() ^ this.f16120b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16119a + "=" + this.f16120b;
    }
}
