package defpackage;

import java.util.Arrays;
public final class b2f {
    public final Float a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b2f)) {
            return false;
        }
        b2f b2fVar = (b2f) obj;
        if (vue.a(null, null) && vue.a(this.a, b2fVar.a) && vue.a(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null, this.a, null});
    }
}
