package defpackage;

import android.text.TextUtils;
public final class mk6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public mk6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == mk6.class) {
                mk6 mk6Var = (mk6) obj;
                if (TextUtils.equals(this.a, mk6Var.a) && this.b == mk6Var.b && this.c == mk6Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int j = ir2.j(31, 31, this.a);
        int i2 = 1237;
        if (this.b) {
            i = 1231;
        } else {
            i = 1237;
        }
        int i3 = (j + i) * 31;
        if (this.c) {
            i2 = 1231;
        }
        return i3 + i2;
    }
}
