package id;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f12799a;
    public final Object f12800b;

    public d(Object obj, Object obj2) {
        this.f12799a = obj;
        this.f12800b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f12799a, dVar.f12799a) && kotlin.jvm.internal.i.a(this.f12800b, dVar.f12800b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f12799a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f12800b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f12799a + ", " + this.f12800b + ')';
    }
}
