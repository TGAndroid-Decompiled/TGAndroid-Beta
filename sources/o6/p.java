package o6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f19168b = new p(null);
    public final String f19169a;

    public p(String str) {
        this.f19169a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f19169a, ((p) obj).f19169a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19169a});
    }
}
