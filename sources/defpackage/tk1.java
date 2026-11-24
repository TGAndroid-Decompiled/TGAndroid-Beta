package defpackage;

import java.util.Arrays;
public final class tk1 extends tl5 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final tl5[] f;

    public tk1(String str, boolean z, boolean z2, String[] strArr, tl5[] tl5VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = tl5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tk1.class == obj.getClass()) {
                tk1 tk1Var = (tk1) obj;
                if (this.c == tk1Var.c && this.d == tk1Var.d && this.b.equals(tk1Var.b) && Arrays.equals(this.e, tk1Var.e) && Arrays.equals(this.f, tk1Var.f)) {
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
