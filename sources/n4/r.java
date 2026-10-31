package n4;

import android.os.Build;
import android.text.TextUtils;
public final class r {
    public t f13528a;

    public r(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f13528a = new t(str, i10, i11);
                    return;
                } else {
                    this.f13528a = new t(str, i10, i11);
                    return;
                }
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        return this.f13528a.equals(((r) obj).f13528a);
    }

    public final int hashCode() {
        return this.f13528a.hashCode();
    }
}
