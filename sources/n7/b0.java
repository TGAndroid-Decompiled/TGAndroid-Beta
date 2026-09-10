package n7;

import java.io.Serializable;
public final class b0 extends x implements Serializable {
    public final x f13941a;

    public b0(x xVar) {
        this.f13941a = xVar;
    }

    @Override
    public final x a() {
        return this.f13941a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13941a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            return this.f13941a.equals(((b0) obj).f13941a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13941a.hashCode();
    }

    public final String toString() {
        return this.f13941a.toString().concat(".reverse()");
    }
}
