package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class ry6 {
    public uy6 a;

    public ry6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new uy6(str, i, i2);
                    return;
                } else {
                    this.a = new uy6(str, i, i2);
                    return;
                }
            }
            lq5.j("packageName should be nonempty");
            throw null;
        }
        p3d.h("package shouldn't be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ry6)) {
            return false;
        }
        return this.a.equals(((ry6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
