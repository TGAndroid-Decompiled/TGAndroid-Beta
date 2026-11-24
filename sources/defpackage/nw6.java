package defpackage;

import android.os.Build;
import android.text.TextUtils;
public final class nw6 {
    public rw6 a;

    public nw6(String str, int i, int i2) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    rw6 rw6Var = new rw6(str, i, i2);
                    h15.b(i, i2, str);
                    this.a = rw6Var;
                    return;
                }
                this.a = new rw6(str, i, i2);
                return;
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
        if (!(obj instanceof nw6)) {
            return false;
        }
        return this.a.equals(((nw6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
