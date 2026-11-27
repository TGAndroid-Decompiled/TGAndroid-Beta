package defpackage;

import java.io.Serializable;
public final class zqd extends bqd implements Serializable {
    public final bqd a;

    public zqd(bqd bqdVar) {
        this.a = bqdVar;
    }

    @Override
    public final bqd a() {
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
        if (obj instanceof zqd) {
            return this.a.equals(((zqd) obj).a);
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
