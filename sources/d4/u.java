package d4;

import android.text.TextUtils;
import kf.k0;
public final class u {
    public final String f4185a;
    public final boolean f4186b;
    public final boolean f4187c;

    public u(String str, boolean z4, boolean z10) {
        this.f4185a = str;
        this.f4186b = z4;
        this.f4187c = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == u.class) {
                u uVar = (u) obj;
                if (TextUtils.equals(this.f4185a, uVar.f4185a) && this.f4186b == uVar.f4186b && this.f4187c == uVar.f4187c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i10;
        int e = k0.e(31, 31, this.f4185a);
        int i11 = 1237;
        if (this.f4186b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (e + i10) * 31;
        if (this.f4187c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
