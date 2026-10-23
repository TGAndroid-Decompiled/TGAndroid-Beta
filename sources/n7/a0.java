package n7;

import java.io.Serializable;
public final class a0 extends w implements Serializable {
    public final w f17319a;

    public a0(w wVar) {
        this.f17319a = wVar;
    }

    @Override
    public final w a() {
        return this.f17319a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.f17319a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            return this.f17319a.equals(((a0) obj).f17319a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f17319a.hashCode();
    }

    public final String toString() {
        return this.f17319a.toString().concat(".reverse()");
    }
}
