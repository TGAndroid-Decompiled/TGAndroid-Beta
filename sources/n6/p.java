package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f16727b = new p(null);
    public final String f16728a;

    public p(String str) {
        this.f16728a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f16728a, ((p) obj).f16728a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16728a});
    }
}
