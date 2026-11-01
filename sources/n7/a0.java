package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f13658a;

    public a0(w wVar) {
        this.f13658a = wVar;
    }

    @Override
    public final w a() {
        return this.f13658a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13658a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f13658a.equals(((a0) obj).f13658a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13658a.hashCode();
    }

    public final String toString() {
        return this.f13658a.toString().concat(".reverse()");
    }
}
