package a2;

import android.os.Build;
import android.text.TextUtils;
public final class a {
    public d f49a;

    public a(String str, int i3, int i10) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    d dVar = new d(str, i3, i10);
                    b.a(i3, i10, str);
                    this.f49a = dVar;
                    return;
                }
                this.f49a = new d(str, i3, i10);
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
        return this.f49a.equals(((a) obj).f49a);
    }

    public final int hashCode() {
        return this.f49a.hashCode();
    }
}
