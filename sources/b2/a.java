package b2;

import android.os.Build;
import android.text.TextUtils;
public final class a {
    public d f2907a;

    public a(String str, int i7, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i7, i10);
                    b.a(i7, i10, str);
                    this.f2907a = dVar;
                    return;
                }
                this.f2907a = new d(str, i7, i10);
                return;
            }
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        throw new NullPointerException("package shouldn't be null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f2907a.equals(((a) obj).f2907a);
    }

    public final int hashCode() {
        return this.f2907a.hashCode();
    }
}
