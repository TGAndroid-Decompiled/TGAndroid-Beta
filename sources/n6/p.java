package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f13627b = new p(null);
    public final String f13628a;

    public p(String str) {
        this.f13628a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.k(this.f13628a, ((p) obj).f13628a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f13628a});
    }
}
