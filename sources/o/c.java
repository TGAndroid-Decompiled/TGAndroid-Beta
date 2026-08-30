package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f16139a;
    public final Object f16140b;
    public c f16141c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f16139a = obj;
        this.f16140b = obj2;
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
        if (this.f16139a.equals(cVar.f16139a) && this.f16140b.equals(cVar.f16140b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f16139a;
    }

    @Override
    public final Object getValue() {
        return this.f16140b;
    }

    @Override
    public final int hashCode() {
        return this.f16139a.hashCode() ^ this.f16140b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f16139a + "=" + this.f16140b;
    }
}
