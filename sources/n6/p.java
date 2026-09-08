package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f16611b = new p(null);
    public final String f16612a;

    public p(String str) {
        this.f16612a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f16612a, ((p) obj).f16612a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16612a});
    }
}
