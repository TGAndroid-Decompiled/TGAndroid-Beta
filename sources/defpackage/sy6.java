package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class sy6 {
    public wy6 a;

    public sy6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    wy6 wy6Var = new wy6(str, i, i2);
                    l35.b(i, i2, str);
                    this.a = wy6Var;
                    return;
                }
                this.a = new wy6(str, i, i2);
                return;
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
        if (!(obj instanceof sy6)) {
            return false;
        }
        return this.a.equals(((sy6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
