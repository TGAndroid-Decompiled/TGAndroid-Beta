package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f15342a;

    public a0(w wVar) {
        this.f15342a = wVar;
    }

    @Override
    public final w a() {
        return this.f15342a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15342a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f15342a.equals(((a0) obj).f15342a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15342a.hashCode();
    }

    public final String toString() {
        return this.f15342a.toString().concat(".reverse()");
    }
}
