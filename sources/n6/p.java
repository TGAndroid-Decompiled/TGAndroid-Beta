package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f16584b = new p(null);
    public final String f16585a;

    public p(String str) {
        this.f16585a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f16585a, ((p) obj).f16585a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16585a});
    }
}
