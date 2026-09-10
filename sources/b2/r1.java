package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f1957f;
    public static final String f1958g;
    public static final String h;
    public static final String f1959i;
    public final int f1960a;
    public final l1 f1961b;
    public final boolean f1962c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.d0.f7188a;
        f1957f = Integer.toString(0, 36);
        f1958g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f1959i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f1784a;
        this.f1960a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f1961b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f1962c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f1962c == r1Var.f1962c && this.f1961b.equals(r1Var.f1961b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.e, r1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f1961b.hashCode() * 31) + (this.f1962c ? 1 : 0)) * 31)) * 31);
    }
}
