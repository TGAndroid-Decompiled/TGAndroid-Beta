package defpackage;

import java.util.Arrays;
public final class kve {
    public final ave a;
    public final Integer b;

    public kve(k7b k7bVar) {
        this.a = (ave) k7bVar.b;
        this.b = (Integer) k7bVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kve)) {
            return false;
        }
        kve kveVar = (kve) obj;
        if (vue.a(this.a, kveVar.a) && vue.a(this.b, kveVar.b) && vue.a(null, null) && vue.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
