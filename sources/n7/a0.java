package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f15369a;

    public a0(w wVar) {
        this.f15369a = wVar;
    }

    @Override
    public final w a() {
        return this.f15369a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15369a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f15369a.equals(((a0) obj).f15369a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15369a.hashCode();
    }

    public final String toString() {
        return this.f15369a.toString().concat(".reverse()");
    }
}
