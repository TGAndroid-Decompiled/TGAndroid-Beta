package n4;

import android.os.Build;
import android.text.TextUtils;
public final class t {
    public v f17123a;

    public t(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f17123a = new v(str, i10, i11);
                    return;
                } else {
                    this.f17123a = new v(str, i10, i11);
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
        if (!(obj instanceof t)) {
            return false;
        }
        return this.f17123a.equals(((t) obj).f17123a);
    }

    public final int hashCode() {
        return this.f17123a.hashCode();
    }
}
