package n4;

import android.os.Build;
import android.text.TextUtils;
public final class z {
    public b0 f16699a;

    public z(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f16699a = new b0(str, i10, i11);
                    return;
                } else {
                    this.f16699a = new b0(str, i10, i11);
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
        if (!(obj instanceof z)) {
            return false;
        }
        return this.f16699a.equals(((z) obj).f16699a);
    }

    public final int hashCode() {
        return this.f16699a.hashCode();
    }
}
