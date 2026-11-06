package e2;

import a8.ia;
import java.util.Arrays;
public final class r1 {
    public static final String f10535f;
    public static final String f10536g;
    public static final String h;
    public static final String f10537i;
    public final int f10538a;
    public final m1 f10539b;
    public final boolean f10540c;
    public final int[] d;
    public final boolean[] f10541e;

    static {
        String str = h2.m0.f14112a;
        f10535f = Integer.toString(0, 36);
        f10536g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10537i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z9, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i7 = m1Var.f10373a;
        this.f10538a = i7;
        boolean z11 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        this.f10539b = m1Var;
        if (z9 && i7 > 1) {
            z11 = true;
        }
        this.f10540c = z11;
        this.d = (int[]) iArr.clone();
        this.f10541e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10540c == r1Var.f10540c && this.f10539b.equals(r1Var.f10539b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10541e, r1Var.f10541e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10541e) + ((hashCode + (((this.f10539b.hashCode() * 31) + (this.f10540c ? 1 : 0)) * 31)) * 31);
    }
}
