package defpackage;

import java.util.Arrays;
public final class g8f {
    public final d8f a;
    public final Integer b;

    public g8f(zhc zhcVar) {
        this.a = (d8f) zhcVar.b;
        this.b = (Integer) zhcVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g8f)) {
            return false;
        }
        g8f g8fVar = (g8f) obj;
        if (vue.a(this.a, g8fVar.a) && vue.a(this.b, g8fVar.b) && vue.a(null, null) && vue.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, null, null});
    }
}
