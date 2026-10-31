package b2;

import java.util.Arrays;
import v7.t6;
public final class v1 {
    public static final String f2350f;
    public static final String f2351g;
    public static final String h;
    public static final String f2352i;
    public final int f2353a;
    public final p1 f2354b;
    public final boolean f2355c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.l0.f6165a;
        f2350f = Integer.toString(0, 36);
        f2351g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f2352i = Integer.toString(4, 36);
    }

    public v1(p1 p1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = p1Var.f2187a;
        this.f2353a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        t6.f(z11);
        this.f2354b = p1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f2355c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && v1.class == obj.getClass()) {
            v1 v1Var = (v1) obj;
            if (this.f2355c == v1Var.f2355c && this.f2354b.equals(v1Var.f2354b) && Arrays.equals(this.d, v1Var.d) && Arrays.equals(this.e, v1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f2354b.hashCode() * 31) + (this.f2355c ? 1 : 0)) * 31)) * 31);
    }
}
