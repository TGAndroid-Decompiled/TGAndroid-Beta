package oc;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f19189a;
    public final Object f19190b;

    public d(Object obj, Object obj2) {
        this.f19189a = obj;
        this.f19190b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f19189a, dVar.f19189a) && kotlin.jvm.internal.i.a(this.f19190b, dVar.f19190b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i9 = 0;
        Object obj = this.f19189a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f19190b;
        if (obj2 != null) {
            i9 = obj2.hashCode();
        }
        return i10 + i9;
    }

    public final String toString() {
        return "(" + this.f19189a + ", " + this.f19190b + ')';
    }
}
