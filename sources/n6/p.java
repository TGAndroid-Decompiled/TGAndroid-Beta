package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f13905b = new p(null);
    public final String f13906a;

    public p(String str) {
        this.f13906a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f13906a, ((p) obj).f13906a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13906a});
    }
}
