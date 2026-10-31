package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f13626b = new p(null);
    public final String f13627a;

    public p(String str) {
        this.f13627a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.k(this.f13627a, ((p) obj).f13627a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13627a});
    }
}
