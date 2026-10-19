package id;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f12767a;
    public final Object f12768b;

    public d(Object obj, Object obj2) {
        this.f12767a = obj;
        this.f12768b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f12767a, dVar.f12767a) && kotlin.jvm.internal.i.a(this.f12768b, dVar.f12768b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f12767a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f12768b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f12767a + ", " + this.f12768b + ')';
    }
}
