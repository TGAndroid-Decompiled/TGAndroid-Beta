package e2;

import a8.ma;
import java.util.Arrays;
public final class r1 {
    public static final String f10679f;
    public static final String f10680g;
    public static final String h;
    public static final String f10681i;
    public final int f10682a;
    public final m1 f10683b;
    public final boolean f10684c;
    public final int[] d;
    public final boolean[] f10685e;

    static {
        String str = h2.l0.f13778a;
        f10679f = Integer.toString(0, 36);
        f10680g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10681i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10517a;
        this.f10682a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ma.f(z11);
        this.f10683b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10684c = z12;
        this.d = (int[]) iArr.clone();
        this.f10685e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10684c == r1Var.f10684c && this.f10683b.equals(r1Var.f10683b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10685e, r1Var.f10685e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10685e) + ((hashCode + (((this.f10683b.hashCode() * 31) + (this.f10684c ? 1 : 0)) * 31)) * 31);
    }
}
