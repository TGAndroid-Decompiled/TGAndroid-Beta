package b6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f1769b = new q(null);
    public final String f1770a;

    public q(String str) {
        this.f1770a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f1770a, ((q) obj).f1770a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1770a});
    }
}
