package defpackage;

import java.util.Arrays;
public final class lj1 extends uj5 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final uj5[] f;

    public lj1(String str, boolean z, boolean z2, String[] strArr, uj5[] uj5VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = uj5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && lj1.class == obj.getClass()) {
                lj1 lj1Var = (lj1) obj;
                if (this.c == lj1Var.c && this.d == lj1Var.d && this.b.equals(lj1Var.b) && Arrays.equals(this.e, lj1Var.e) && Arrays.equals(this.f, lj1Var.f)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
