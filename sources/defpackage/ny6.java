package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class ny6 {
    public ry6 a;

    public ny6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    ry6 ry6Var = new ry6(str, i, i2);
                    h35.b(i, i2, str);
                    this.a = ry6Var;
                    return;
                }
                this.a = new ry6(str, i, i2);
                return;
            }
            u36.j("packageName should be nonempty");
            throw null;
        }
        gxc.d("package shouldn't be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ny6)) {
            return false;
        }
        return this.a.equals(((ny6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
