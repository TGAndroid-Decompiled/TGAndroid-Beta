package defpackage;

import java.util.Arrays;
public final class jkb implements wn {
    public static final jkb b = new jkb(null);
    public final String a;

    public jkb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jkb)) {
            return false;
        }
        return vue.a(this.a, ((jkb) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
