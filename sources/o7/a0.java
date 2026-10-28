package o7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f19198a;

    public a0(w wVar) {
        this.f19198a = wVar;
    }

    @Override
    public final w a() {
        return this.f19198a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f19198a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f19198a.equals(((a0) obj).f19198a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f19198a.hashCode();
    }

    public final String toString() {
        return this.f19198a.toString().concat(".reverse()");
    }
}
