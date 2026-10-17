package id;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f12771a;
    public final Object f12772b;

    public d(Object obj, Object obj2) {
        this.f12771a = obj;
        this.f12772b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f12771a, dVar.f12771a) && kotlin.jvm.internal.i.a(this.f12772b, dVar.f12772b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f12771a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f12772b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f12771a + ", " + this.f12772b + ')';
    }
}
