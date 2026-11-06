package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f20661a;
    public final Object f20662b;
    public c f20663c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f20661a = obj;
        this.f20662b = obj2;
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
        if (this.f20661a.equals(cVar.f20661a) && this.f20662b.equals(cVar.f20662b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f20661a;
    }

    @Override
    public final Object getValue() {
        return this.f20662b;
    }

    @Override
    public final int hashCode() {
        return this.f20661a.hashCode() ^ this.f20662b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f20661a + "=" + this.f20662b;
    }
}
