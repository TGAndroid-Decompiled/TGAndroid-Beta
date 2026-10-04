package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f3517f;
    public static final String f3518g;
    public static final String h;
    public static final String f3519i;
    public final int f3520a;
    public final l1 f3521b;
    public final boolean f3522c;
    public final int[] d;
    public final boolean[] f3523e;

    static {
        String str = e2.d0.f8537a;
        f3517f = Integer.toString(0, 36);
        f3518g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f3519i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f3336a;
        this.f3520a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f3521b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3522c = z12;
        this.d = (int[]) iArr.clone();
        this.f3523e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3522c == r1Var.f3522c && this.f3521b.equals(r1Var.f3521b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f3523e, r1Var.f3523e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f3523e) + ((hashCode + (((this.f3521b.hashCode() * 31) + (this.f3522c ? 1 : 0)) * 31)) * 31);
    }
}
