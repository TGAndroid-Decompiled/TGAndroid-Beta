package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f13657a;

    public a0(w wVar) {
        this.f13657a = wVar;
    }

    @Override
    public final w a() {
        return this.f13657a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f13657a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f13657a.equals(((a0) obj).f13657a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f13657a.hashCode();
    }

    public final String toString() {
        return this.f13657a.toString().concat(".reverse()");
    }
}
