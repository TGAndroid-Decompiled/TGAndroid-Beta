package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f9608a;
    public final Object f9609b;

    public d(Object obj, Object obj2) {
        this.f9608a = obj;
        this.f9609b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f9608a, dVar.f9608a) && kotlin.jvm.internal.i.a(this.f9609b, dVar.f9609b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f9608a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f9609b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f9608a + ", " + this.f9609b + ')';
    }
}
