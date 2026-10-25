package b2;

import a8.yb;
import java.util.Arrays;
public final class v1 {
    public static final String f3513f;
    public static final String f3514g;
    public static final String h;
    public static final String f3515i;
    public final int f3516a;
    public final q1 f3517b;
    public final boolean f3518c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.n0.f9692a;
        f3513f = Integer.toString(0, 36);
        f3514g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f3515i = Integer.toString(4, 36);
    }

    public v1(q1 q1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = q1Var.f3358a;
        this.f3516a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        yb.g(z11);
        this.f3517b = q1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3518c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f3518c == v1Var.f3518c && this.f3517b.equals(v1Var.f3517b) && Arrays.equals(this.d, v1Var.d) && Arrays.equals(this.e, v1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f3517b.hashCode() * 31) + (this.f3518c ? 1 : 0)) * 31)) * 31);
    }
}
