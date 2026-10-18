package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f17227b = new p(null);
    public final String f17228a;

    public p(String str) {
        this.f17228a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f17228a, ((p) obj).f17228a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17228a});
    }
}
