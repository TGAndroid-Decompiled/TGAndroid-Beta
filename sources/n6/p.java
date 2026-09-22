package n6;

import java.util.Arrays;
public final class p implements com.google.android.gms.common.api.b {
    public static final p f15311b = new p(null);
    public final String f15312a;

    public p(String str) {
        this.f15312a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        return l.l(this.f15312a, ((p) obj).f15312a);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f15312a});
    }
}
