package defpackage;

import java.util.Arrays;
public final class ngb implements vn {
    public static final ngb b = new ngb(null);
    public final String a;

    public ngb(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ngb)) {
            return false;
        }
        return cqe.a(this.a, ((ngb) obj).a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }
}
