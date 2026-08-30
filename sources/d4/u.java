package d4;

import android.text.TextUtils;
import kh.a2;
public final class u {
    public final String f4204a;
    public final boolean f4205b;
    public final boolean f4206c;

    public u(String str, boolean z4, boolean z10) {
        this.f4204a = str;
        this.f4205b = z4;
        this.f4206c = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == u.class) {
                u uVar = (u) obj;
                if (TextUtils.equals(this.f4204a, uVar.f4204a) && this.f4205b == uVar.f4205b && this.f4206c == uVar.f4206c) {
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
        int e = a2.e(31, 31, this.f4204a);
        int i11 = 1237;
        if (this.f4205b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (e + i10) * 31;
        if (this.f4206c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
