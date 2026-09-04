package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f2323f;
    public static final String f2324g;
    public static final String h;
    public static final String f2325i;
    public final int f2326a;
    public final l1 f2327b;
    public final boolean f2328c;
    public final int[] d;
    public final boolean[] f2329e;

    static {
        String str = e2.d0.f8737a;
        f2323f = Integer.toString(0, 36);
        f2324g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f2325i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f2142a;
        this.f2326a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f2327b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f2328c = z12;
        this.d = (int[]) iArr.clone();
        this.f2329e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f2328c == r1Var.f2328c && this.f2327b.equals(r1Var.f2327b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f2329e, r1Var.f2329e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f2329e) + ((hashCode + (((this.f2327b.hashCode() * 31) + (this.f2328c ? 1 : 0)) * 31)) * 31);
    }
}
