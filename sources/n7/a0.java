package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f15350a;

    public a0(w wVar) {
        this.f15350a = wVar;
    }

    @Override
    public final w a() {
        return this.f15350a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15350a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f15350a.equals(((a0) obj).f15350a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15350a.hashCode();
    }

    public final String toString() {
        return this.f15350a.toString().concat(".reverse()");
    }
}
