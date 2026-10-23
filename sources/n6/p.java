package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f17288b = new p(null);
    public final String f17289a;

    public p(String str) {
        this.f17289a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f17289a, ((p) obj).f17289a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f17289a});
    }
}
