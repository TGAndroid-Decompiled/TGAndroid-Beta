package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class my6 {
    public py6 a;

    public my6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new py6(str, i, i2);
                    return;
                } else {
                    this.a = new py6(str, i, i2);
                    return;
                }
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
        if (!(obj instanceof my6)) {
            return false;
        }
        return this.a.equals(((my6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
