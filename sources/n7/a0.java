package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f16762a;

    public a0(w wVar) {
        this.f16762a = wVar;
    }

    @Override
    public final w a() {
        return this.f16762a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f16762a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f16762a.equals(((a0) obj).f16762a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f16762a.hashCode();
    }

    public final String toString() {
        return this.f16762a.toString().concat(".reverse()");
    }
}
