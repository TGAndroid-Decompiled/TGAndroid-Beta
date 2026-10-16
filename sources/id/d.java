package id;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f11382a;
    public final Object f11383b;

    public d(Object obj, Object obj2) {
        this.f11382a = obj;
        this.f11383b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f11382a, dVar.f11382a) && kotlin.jvm.internal.i.a(this.f11383b, dVar.f11383b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f11382a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f11383b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f11382a + ", " + this.f11383b + ')';
    }
}
