package o;

import java.util.Map;
public final class c implements Map.Entry {
    public final Object f20466a;
    public final Object f20467b;
    public c f20468c;
    public c d;

    public c(Object obj, Object obj2) {
        this.f20466a = obj;
        this.f20467b = obj2;
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
        if (this.f20466a.equals(cVar.f20466a) && this.f20467b.equals(cVar.f20467b)) {
            return true;
        }
        return false;
    }

    @Override
    public final Object getKey() {
        return this.f20466a;
    }

    @Override
    public final Object getValue() {
        return this.f20467b;
    }

    @Override
    public final int hashCode() {
        return this.f20466a.hashCode() ^ this.f20467b.hashCode();
    }

    @Override
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f20466a + "=" + this.f20467b;
    }
}
