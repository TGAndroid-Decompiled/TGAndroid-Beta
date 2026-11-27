package defpackage;

import java.util.Arrays;
public final class uj1 extends wl5 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final wl5[] f;

    public uj1(String str, boolean z, boolean z2, String[] strArr, wl5[] wl5VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = wl5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && uj1.class == obj.getClass()) {
                uj1 uj1Var = (uj1) obj;
                if (this.c == uj1Var.c && this.d == uj1Var.d && this.b.equals(uj1Var.b) && Arrays.equals(this.e, uj1Var.e) && Arrays.equals(this.f, uj1Var.f)) {
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
