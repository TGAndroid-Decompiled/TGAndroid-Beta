package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f9609a;
    public final Object f9610b;

    public d(Object obj, Object obj2) {
        this.f9609a = obj;
        this.f9610b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f9609a, dVar.f9609a) && kotlin.jvm.internal.i.a(this.f9610b, dVar.f9610b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f9609a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f9610b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f9609a + ", " + this.f9610b + ')';
    }
}
