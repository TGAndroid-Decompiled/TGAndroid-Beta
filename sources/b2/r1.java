package b2;

import java.util.Arrays;
public final class r1 {
    public static final String f3256f;
    public static final String f3257g;
    public static final String h;
    public static final String f3258i;
    public final int f3259a;
    public final l1 f3260b;
    public final boolean f3261c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.d0.f7871a;
        f3256f = Integer.toString(0, 36);
        f3257g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f3258i = Integer.toString(4, 36);
    }

    public r1(l1 l1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = l1Var.f3083a;
        this.f3259a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        e2.d.b(z11);
        this.f3260b = l1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f3261c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f3261c == r1Var.f3261c && this.f3260b.equals(r1Var.f3260b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.e, r1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f3260b.hashCode() * 31) + (this.f3261c ? 1 : 0)) * 31)) * 31);
    }
}
