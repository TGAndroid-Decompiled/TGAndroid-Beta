package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f17223b = new p(null);
    public final String f17224a;

    public p(String str) {
        this.f17224a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f17224a, ((p) obj).f17224a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17224a});
    }
}
