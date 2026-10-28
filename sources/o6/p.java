package o6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f19167b = new p(null);
    public final String f19168a;

    public p(String str) {
        this.f19168a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f19168a, ((p) obj).f19168a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f19168a});
    }
}
