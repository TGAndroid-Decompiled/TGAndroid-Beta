package n7;

import java.io.Serializable;
public final class b0 extends x implements Serializable {
    public final x f15121a;

    public b0(x xVar) {
        this.f15121a = xVar;
    }

    @Override
    public final x a() {
        return this.f15121a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f15121a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f15121a.equals(((b0) obj).f15121a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f15121a.hashCode();
    }

    public final String toString() {
        return this.f15121a.toString().concat(".reverse()");
    }
}
