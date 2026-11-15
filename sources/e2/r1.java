package e2;

import a8.ja;
import java.util.Arrays;
public final class r1 {
    public static final String f10371f;
    public static final String f10372g;
    public static final String h;
    public static final String f10373i;
    public final int f10374a;
    public final m1 f10375b;
    public final boolean f10376c;
    public final int[] d;
    public final boolean[] f10377e;

    static {
        String str = h2.l0.f13471a;
        f10371f = Integer.toString(0, 36);
        f10372g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10373i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10209a;
        this.f10374a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        ja.f(z11);
        this.f10375b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10376c = z12;
        this.d = (int[]) iArr.clone();
        this.f10377e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10376c == r1Var.f10376c && this.f10375b.equals(r1Var.f10375b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10377e, r1Var.f10377e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10377e) + ((hashCode + (((this.f10375b.hashCode() * 31) + (this.f10376c ? 1 : 0)) * 31)) * 31);
    }
}
