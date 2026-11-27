package defpackage;

import android.text.TextUtils;
public final class w93 {
    public final String a;
    public final ko4 b;
    public final ko4 c;
    public final byte d;
    public final int e;

    public w93(String str, ko4 ko4Var, ko4 ko4Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        yve.f(z);
        yve.f(!TextUtils.isEmpty(str));
        this.a = str;
        ko4Var.getClass();
        this.b = ko4Var;
        ko4Var2.getClass();
        this.c = ko4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && w93.class == obj.getClass()) {
                w93 w93Var = (w93) obj;
                if (this.d == w93Var.d && this.e == w93Var.e && this.a.equals(w93Var.a) && this.b.equals(w93Var.b) && this.c.equals(w93Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = bs2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + j) * 31);
    }
}
