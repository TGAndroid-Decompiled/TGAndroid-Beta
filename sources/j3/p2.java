package j3;

import java.util.Arrays;
public final class p2 implements g {
    public static final String f9375f;
    public static final String h;
    public static final String f9376n;
    public static final String f9377r;
    public final int f9378a;
    public final o4.s0 f9379b;
    public final boolean f9380c;
    public final int[] d;
    public final boolean[] f9381e;

    static {
        int i10 = h5.d0.f7237a;
        f9375f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f9376n = Integer.toString(3, 36);
        f9377r = Integer.toString(4, 36);
    }

    public p2(o4.s0 s0Var, boolean z4, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i10 = s0Var.f16571a;
        this.f9378a = i10;
        boolean z11 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.f9379b = s0Var;
        if (z4 && i10 > 1) {
            z11 = true;
        }
        this.f9380c = z11;
        this.d = (int[]) iArr.clone();
        this.f9381e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class == obj.getClass()) {
            p2 p2Var = (p2) obj;
            if (this.f9380c == p2Var.f9380c && this.f9379b.equals(p2Var.f9379b) && Arrays.equals(this.d, p2Var.d) && Arrays.equals(this.f9381e, p2Var.f9381e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f9381e) + ((hashCode + (((this.f9379b.hashCode() * 31) + (this.f9380c ? 1 : 0)) * 31)) * 31);
    }
}
