package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f2350f;
    public static final String f2351g;
    public static final String h;
    public static final String f2352i;
    public final int f2353a;
    public final l1 f2354b;
    public final boolean f2355c;
    public final int[] d;
    public final boolean[] f2356e;

    static {
        String str = e2.d0.f8765a;
        f2350f = Integer.toString(0, 36);
        f2351g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f2352i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f2169a;
        this.f2353a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f2354b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f2355c = z12;
        this.d = (int[]) iArr.clone();
        this.f2356e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f2355c == r1Var.f2355c && this.f2354b.equals(r1Var.f2354b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f2356e, r1Var.f2356e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f2356e) + ((hashCode + (((this.f2354b.hashCode() * 31) + (this.f2355c ? 1 : 0)) * 31)) * 31);
    }
}
