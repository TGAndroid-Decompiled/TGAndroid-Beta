package jd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f15572a;
    public final Object f15573b;

    public d(Object obj, Object obj2) {
        this.f15572a = obj;
        this.f15573b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f15572a, dVar.f15572a) && kotlin.jvm.internal.i.a(this.f15573b, dVar.f15573b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f15572a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f15573b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f15572a + ", " + this.f15573b + ')';
    }
}
