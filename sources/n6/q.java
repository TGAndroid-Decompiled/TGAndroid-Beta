package n6;

import java.util.Arrays;
public final class q implements com.google.android.gms.common.api.b {
    public static final q f16454b = new q(null);
    public final String f16455a;

    public q(String str) {
        this.f16455a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        return m.l(this.f16455a, ((q) obj).f16455a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f16455a});
    }
}
