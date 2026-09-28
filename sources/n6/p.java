package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f15304b = new p(null);
    public final String f15305a;

    public p(String str) {
        this.f15305a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f15305a, ((p) obj).f15305a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15305a});
    }
}
