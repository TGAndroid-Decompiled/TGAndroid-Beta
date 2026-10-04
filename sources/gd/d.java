package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f10445a;
    public final Object f10446b;

    public d(Object obj, Object obj2) {
        this.f10445a = obj;
        this.f10446b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f10445a, dVar.f10445a) && kotlin.jvm.internal.i.a(this.f10446b, dVar.f10446b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f10445a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f10446b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f10445a + ", " + this.f10446b + ')';
    }
}
