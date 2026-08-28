package h3;

import java.util.Arrays;
public final class s2 implements g {
    public static final String f9726f;
    public static final String h;
    public static final String f9727n;
    public static final String f9728r;
    public final int f9729a;
    public final j4.i1 f9730b;
    public final boolean f9731c;
    public final int[] d;
    public final boolean[] f9732e;

    static {
        int i9 = d5.f0.f4349a;
        f9726f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f9727n = Integer.toString(3, 36);
        f9728r = Integer.toString(4, 36);
    }

    public s2(j4.i1 i1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i9 = i1Var.f13481a;
        this.f9729a = i9;
        boolean z12 = false;
        if (i9 == iArr.length && i9 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        d5.a.f(z11);
        this.f9730b = i1Var;
        if (z10 && i9 > 1) {
            z12 = true;
        }
        this.f9731c = z12;
        this.d = (int[]) iArr.clone();
        this.f9732e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s2.class == obj.getClass()) {
            s2 s2Var = (s2) obj;
            if (this.f9731c == s2Var.f9731c && this.f9730b.equals(s2Var.f9730b) && Arrays.equals(this.d, s2Var.d) && Arrays.equals(this.f9732e, s2Var.f9732e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f9732e) + ((hashCode + (((this.f9730b.hashCode() * 31) + (this.f9731c ? 1 : 0)) * 31)) * 31);
    }
}
