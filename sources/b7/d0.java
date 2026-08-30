package b7;

import java.io.Serializable;
public final class d0 extends z implements Serializable {
    public final z f1675a;

    public d0(z zVar) {
        this.f1675a = zVar;
    }

    @Override
    public final z a() {
        return this.f1675a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f1675a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d0) {
            return this.f1675a.equals(((d0) obj).f1675a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f1675a.hashCode();
    }

    public final String toString() {
        return this.f1675a.toString().concat(".reverse()");
    }
}
