package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f8740a;
    public final Object f8741b;

    public d(Object obj, Object obj2) {
        this.f8740a = obj;
        this.f8741b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f8740a, dVar.f8740a) && kotlin.jvm.internal.i.a(this.f8741b, dVar.f8741b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f8740a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f8741b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f8740a + ", " + this.f8741b + ')';
    }
}
