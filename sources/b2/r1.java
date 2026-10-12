package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f3594f;
    public static final String f3595g;
    public static final String h;
    public static final String f3596i;
    public final int f3597a;
    public final l1 f3598b;
    public final boolean f3599c;
    public final int[] d;
    public final boolean[] f3600e;

    static {
        String str = e2.d0.f8529a;
        f3594f = Integer.toString(0, 36);
        f3595g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f3596i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f3413a;
        this.f3597a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f3598b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3599c = z12;
        this.d = (int[]) iArr.clone();
        this.f3600e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3599c == r1Var.f3599c && this.f3598b.equals(r1Var.f3598b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f3600e, r1Var.f3600e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f3600e) + ((hashCode + (((this.f3598b.hashCode() * 31) + (this.f3599c ? 1 : 0)) * 31)) * 31);
    }
}
