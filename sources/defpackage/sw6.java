package defpackage;

import java.util.Arrays;
public final class sw6 {
    public final long a;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof sw6) && this.a == ((sw6) obj).a && vue.a(null, null)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), 0, Boolean.FALSE, null});
    }
}
