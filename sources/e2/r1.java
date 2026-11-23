package e2;

import a8.ma;
import java.util.Arrays;
public final class r1 {
    public static final String f10681f;
    public static final String f10682g;
    public static final String h;
    public static final String f10683i;
    public final int f10684a;
    public final m1 f10685b;
    public final boolean f10686c;
    public final int[] d;
    public final boolean[] f10687e;

    static {
        String str = h2.l0.f13778a;
        f10681f = Integer.toString(0, 36);
        f10682g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10683i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10519a;
        this.f10684a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.f(z11);
        this.f10685b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10686c = z12;
        this.d = (int[]) iArr.clone();
        this.f10687e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10686c == r1Var.f10686c && this.f10685b.equals(r1Var.f10685b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10687e, r1Var.f10687e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10687e) + ((hashCode + (((this.f10685b.hashCode() * 31) + (this.f10686c ? 1 : 0)) * 31)) * 31);
    }
}
