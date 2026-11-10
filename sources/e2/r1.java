package e2;

import a8.ia;
import java.util.Arrays;
public final class r1 {
    public static final String f10540f;
    public static final String f10541g;
    public static final String h;
    public static final String f10542i;
    public final int f10543a;
    public final m1 f10544b;
    public final boolean f10545c;
    public final int[] d;
    public final boolean[] f10546e;

    static {
        String str = h2.m0.f14114a;
        f10540f = Integer.toString(0, 36);
        f10541g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10542i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z9, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i7 = m1Var.f10378a;
        this.f10543a = i7;
        boolean z11 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        ia.f(z10);
        this.f10544b = m1Var;
        if (z9 && i7 > 1) {
            z11 = true;
        }
        this.f10545c = z11;
        this.d = (int[]) iArr.clone();
        this.f10546e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10545c == r1Var.f10545c && this.f10544b.equals(r1Var.f10544b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10546e, r1Var.f10546e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10546e) + ((hashCode + (((this.f10544b.hashCode() * 31) + (this.f10545c ? 1 : 0)) * 31)) * 31);
    }
}
