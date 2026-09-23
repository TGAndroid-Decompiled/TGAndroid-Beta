package n7;

import java.io.Serializable;
public final class b0 extends x implements Serializable {
    public final x f15086a;

    public b0(x xVar) {
        this.f15086a = xVar;
    }

    @Override
    public final x a() {
        return this.f15086a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15086a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f15086a.equals(((b0) obj).f15086a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15086a.hashCode();
    }

    public final String toString() {
        return this.f15086a.toString().concat(".reverse()");
    }
}
