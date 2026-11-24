package defpackage;

import java.io.Serializable;
public final class lod extends mnd implements Serializable {
    public final mnd a;

    public lod(mnd mndVar) {
        this.a = mndVar;
    }

    @Override
    public final mnd a() {
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
        if (obj instanceof lod) {
            return this.a.equals(((lod) obj).a);
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
