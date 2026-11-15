package gd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Object f13162a;
    public final Object f13163b;

    public e(Object obj, Object obj2) {
        this.f13162a = obj;
        this.f13163b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.j.a(this.f13162a, eVar.f13162a) && kotlin.jvm.internal.j.a(this.f13163b, eVar.f13163b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i7 = 0;
        Object obj = this.f13162a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f13163b;
        if (obj2 != null) {
            i7 = obj2.hashCode();
        }
        return i10 + i7;
    }

    public final String toString() {
        return "(" + this.f13162a + ", " + this.f13163b + ')';
    }
}
