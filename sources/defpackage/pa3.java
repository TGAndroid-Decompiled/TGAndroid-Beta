package defpackage;

import android.text.TextUtils;
public final class pa3 {
    public final String a;
    public final go4 b;
    public final go4 c;
    public final byte d;
    public final int e;

    public pa3(String str, go4 go4Var, go4 go4Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        jte.f(z);
        jte.f(!TextUtils.isEmpty(str));
        this.a = str;
        go4Var.getClass();
        this.b = go4Var;
        go4Var2.getClass();
        this.c = go4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && pa3.class == obj.getClass()) {
                pa3 pa3Var = (pa3) obj;
                if (this.d == pa3Var.d && this.e == pa3Var.e && this.a.equals(pa3Var.a) && this.b.equals(pa3Var.b) && this.c.equals(pa3Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = ts2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + j) * 31);
    }
}
