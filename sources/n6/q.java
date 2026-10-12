package n6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f16135b = new q(null);
    public final String f16136a;

    public q(String str) {
        this.f16136a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return l.l(this.f16136a, ((q) obj).f16136a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16136a});
    }
}
