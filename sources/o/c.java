package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f21552a;
    public final Object f21553b;
    public c f21554c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f21552a = obj;
        this.f21553b = obj2;
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
        if (this.f21552a.equals(cVar.f21552a) && this.f21553b.equals(cVar.f21553b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f21552a;
    }

    @Override
    public final Object getValue() {
        return this.f21553b;
    }

    @Override
    public final int hashCode() {
        return this.f21552a.hashCode() ^ this.f21553b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f21552a + "=" + this.f21553b;
    }
}
