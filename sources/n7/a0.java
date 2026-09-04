package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f16618a;

    public a0(w wVar) {
        this.f16618a = wVar;
    }

    @Override
    public final w a() {
        return this.f16618a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f16618a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f16618a.equals(((a0) obj).f16618a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f16618a.hashCode();
    }

    public final String toString() {
        return this.f16618a.toString().concat(".reverse()");
    }
}
