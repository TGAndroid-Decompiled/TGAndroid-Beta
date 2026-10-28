package jd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f15571a;
    public final Object f15572b;

    public d(Object obj, Object obj2) {
        this.f15571a = obj;
        this.f15572b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f15571a, dVar.f15571a) && kotlin.jvm.internal.i.a(this.f15572b, dVar.f15572b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f15571a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f15572b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f15571a + ", " + this.f15572b + ')';
    }
}
