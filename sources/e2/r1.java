package e2;

import a8.la;
import java.util.Arrays;
public final class r1 {
    public static final String f10718f;
    public static final String f10719g;
    public static final String h;
    public static final String f10720i;
    public final int f10721a;
    public final m1 f10722b;
    public final boolean f10723c;
    public final int[] d;
    public final boolean[] f10724e;

    static {
        String str = h2.l0.f13815a;
        f10718f = Integer.toString(0, 36);
        f10719g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10720i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10556a;
        this.f10721a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.f(z11);
        this.f10722b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10723c = z12;
        this.d = (int[]) iArr.clone();
        this.f10724e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10723c == r1Var.f10723c && this.f10722b.equals(r1Var.f10722b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10724e, r1Var.f10724e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10724e) + ((hashCode + (((this.f10722b.hashCode() * 31) + (this.f10723c ? 1 : 0)) * 31)) * 31);
    }
}
