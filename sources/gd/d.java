package gd;

import java.io.Serializable;
public final class d implements Serializable {
    public final Object f10608a;
    public final Object f10609b;

    public d(Object obj, Object obj2) {
        this.f10608a = obj;
        this.f10609b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (kotlin.jvm.internal.i.a(this.f10608a, dVar.f10608a) && kotlin.jvm.internal.i.a(this.f10609b, dVar.f10609b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f10608a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f10609b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f10608a + ", " + this.f10609b + ')';
    }
}
