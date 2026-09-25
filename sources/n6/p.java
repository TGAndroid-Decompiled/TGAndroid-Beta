package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f15303b = new p(null);
    public final String f15304a;

    public p(String str) {
        this.f15304a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f15304a, ((p) obj).f15304a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15304a});
    }
}
