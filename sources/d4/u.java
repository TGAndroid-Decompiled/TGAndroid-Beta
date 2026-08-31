package d4;

import android.text.TextUtils;
public final class u {
    public final String f4276a;
    public final boolean f4277b;
    public final boolean f4278c;

    public u(String str, boolean z4, boolean z10) {
        this.f4276a = str;
        this.f4277b = z4;
        this.f4278c = z10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == u.class) {
                u uVar = (u) obj;
                if (TextUtils.equals(this.f4276a, uVar.f4276a) && this.f4277b == uVar.f4277b && this.f4278c == uVar.f4278c) {
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
        int e6 = l.d.e(31, 31, this.f4276a);
        int i11 = 1237;
        if (this.f4277b) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i12 = (e6 + i10) * 31;
        if (this.f4278c) {
            i11 = 1231;
        }
        return i12 + i11;
    }
}
