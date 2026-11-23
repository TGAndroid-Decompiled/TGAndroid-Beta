package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Object f13506a;
    public final Object f13507b;

    public e(Object obj, Object obj2) {
        this.f13506a = obj;
        this.f13507b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.j.a(this.f13506a, eVar.f13506a) && kotlin.jvm.internal.j.a(this.f13507b, eVar.f13507b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f13506a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f13507b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "(" + this.f13506a + ", " + this.f13507b + ')';
    }
}
