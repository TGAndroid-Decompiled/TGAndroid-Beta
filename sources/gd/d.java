package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f10580a;
    public final Object f10581b;

    public d(Object obj, Object obj2) {
        this.f10580a = obj;
        this.f10581b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f10580a, dVar.f10580a) && kotlin.jvm.internal.i.a(this.f10581b, dVar.f10581b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f10580a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f10581b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f10580a + ", " + this.f10581b + ')';
    }
}
