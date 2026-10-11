package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f3596f;
    public static final String f3597g;
    public static final String h;
    public static final String f3598i;
    public final int f3599a;
    public final l1 f3600b;
    public final boolean f3601c;
    public final int[] d;
    public final boolean[] f3602e;

    static {
        String str = e2.d0.f8531a;
        f3596f = Integer.toString(0, 36);
        f3597g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f3598i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f3415a;
        this.f3599a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f3600b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3601c = z12;
        this.d = (int[]) iArr.clone();
        this.f3602e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3601c == r1Var.f3601c && this.f3600b.equals(r1Var.f3600b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f3602e, r1Var.f3602e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f3602e) + ((hashCode + (((this.f3600b.hashCode() * 31) + (this.f3601c ? 1 : 0)) * 31)) * 31);
    }
}
