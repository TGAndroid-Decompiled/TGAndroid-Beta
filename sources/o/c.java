package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16879a;
    public final Object f16880b;
    public c f16881c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16879a = obj;
        this.f16880b = obj2;
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
        if (this.f16879a.equals(cVar.f16879a) && this.f16880b.equals(cVar.f16880b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16879a;
    }

    @Override
    public final Object getValue() {
        return this.f16880b;
    }

    @Override
    public final int hashCode() {
        return this.f16879a.hashCode() ^ this.f16880b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16879a + "=" + this.f16880b;
    }
}
