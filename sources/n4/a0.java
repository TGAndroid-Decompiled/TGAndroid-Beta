package n4;

import android.os.Build;
import android.text.TextUtils;
public final class a0 {
    public c0 f16425a;

    public a0(String str, int i10, int i11) {
        if (str != null) {
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    this.f16425a = new c0(str, i10, i11);
                    return;
                } else {
                    this.f16425a = new c0(str, i10, i11);
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
        if (!(obj instanceof a0)) {
            return false;
        }
        return this.f16425a.equals(((a0) obj).f16425a);
    }

    public final int hashCode() {
        return this.f16425a.hashCode();
    }
}
