package defpackage;

import android.text.TextUtils;
public final class sm6 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public sm6(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && obj.getClass() == sm6.class) {
                sm6 sm6Var = (sm6) obj;
                if (TextUtils.equals(this.a, sm6Var.a) && this.b == sm6Var.b && this.c == sm6Var.c) {
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
        int j = bs2.j(31, 31, this.a);
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
