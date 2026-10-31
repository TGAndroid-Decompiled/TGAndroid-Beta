package ad;

import java.io.Serializable;
public final class e implements Serializable {
    public final Object f393a;
    public final Object f394b;

    public e(Object obj, Object obj2) {
        this.f393a = obj;
        this.f394b = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (kotlin.jvm.internal.i.a(this.f393a, eVar.f393a) && kotlin.jvm.internal.i.a(this.f394b, eVar.f394b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Object obj = this.f393a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i11 = hashCode * 31;
        Object obj2 = this.f394b;
        if (obj2 != null) {
            i10 = obj2.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "(" + this.f393a + ", " + this.f394b + ')';
    }
}
