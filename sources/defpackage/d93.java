package defpackage;

import android.text.TextUtils;
public final class d93 {
    public final String a;
    public final fm4 b;
    public final fm4 c;
    public final byte d;
    public final int e;

    public d93(String str, fm4 fm4Var, fm4 fm4Var2, int i, int i2) {
        boolean z;
        if (i != 0 && i2 != 0) {
            z = false;
        } else {
            z = true;
        }
        gre.f(z);
        gre.f(!TextUtils.isEmpty(str));
        this.a = str;
        fm4Var.getClass();
        this.b = fm4Var;
        fm4Var2.getClass();
        this.c = fm4Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d93.class == obj.getClass()) {
                d93 d93Var = (d93) obj;
                if (this.d == d93Var.d && this.e == d93Var.e && this.a.equals(d93Var.a) && this.b.equals(d93Var.b) && this.c.equals(d93Var.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = ir2.j((((527 + this.d) * 31) + this.e) * 31, 31, this.a);
        return this.c.hashCode() + ((this.b.hashCode() + j) * 31);
    }
}
