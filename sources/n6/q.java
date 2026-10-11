package n6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f16751b = new q(null);
    public final String f16752a;

    public q(String str) {
        this.f16752a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f16752a, ((q) obj).f16752a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16752a});
    }
}
