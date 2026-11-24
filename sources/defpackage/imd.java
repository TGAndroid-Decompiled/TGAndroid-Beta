package defpackage;

import java.io.Serializable;
public final class imd extends kld implements Serializable {
    public final kld a;

    public imd(kld kldVar) {
        this.a = kldVar;
    }

    @Override
    public final kld a() {
        return this.a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imd) {
            return this.a.equals(((imd) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString().concat(".reverse()");
    }
}
