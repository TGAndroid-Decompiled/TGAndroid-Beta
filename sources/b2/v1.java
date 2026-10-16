package b2;

import java.util.Arrays;
import v7.u6;
public final class v1 {
    public static final String f2450f;
    public static final String f2451g;
    public static final String h;
    public static final String f2452i;
    public final int f2453a;
    public final q1 f2454b;
    public final boolean f2455c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.m0.f8375a;
        f2450f = Integer.toString(0, 36);
        f2451g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f2452i = Integer.toString(4, 36);
    }

    public v1(q1 q1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = q1Var.f2295a;
        this.f2453a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.f2454b = q1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f2455c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f2455c == v1Var.f2455c && this.f2454b.equals(v1Var.f2454b) && Arrays.equals(this.d, v1Var.d) && Arrays.equals(this.e, v1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f2454b.hashCode() * 31) + (this.f2455c ? 1 : 0)) * 31)) * 31);
    }
}
