package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class mw6 {
    public pw6 a;

    public mw6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.a = new pw6(str, i, i2);
                    return;
                } else {
                    this.a = new pw6(str, i, i2);
                    return;
                }
            }
            w26.j("packageName should be nonempty");
            throw null;
        }
        fvc.f("package shouldn't be null");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mw6)) {
            return false;
        }
        return this.a.equals(((mw6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
