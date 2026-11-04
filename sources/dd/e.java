package dd;

import java.io.Serializable;
public final class e implements Serializable {
    public final Object f8790a;
    public final Object f8791b;

    public e(Object obj, Object obj2) {
        this.f8790a = obj;
        this.f8791b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.j.a(this.f8790a, eVar.f8790a) && kotlin.jvm.internal.j.a(this.f8791b, eVar.f8791b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i3 = 0;
        Object obj = this.f8790a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i10 = hashCode * 31;
        Object obj2 = this.f8791b;
        if (obj2 != null) {
            i3 = obj2.hashCode();
        }
        return i10 + i3;
    }

    public final String toString() {
        return "(" + this.f8790a + ", " + this.f8791b + ')';
    }
}
