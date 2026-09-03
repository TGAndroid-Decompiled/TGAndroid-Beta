package j3;

import java.util.Arrays;
public final class p2 implements g {
    public static final String f8768f;
    public static final String h;
    public static final String f8769n;
    public static final String f8770r;
    public final int f8771a;
    public final o4.s0 f8772b;
    public final boolean f8773c;
    public final int[] d;
    public final boolean[] e;

    static {
        int i10 = h5.d0.f6924a;
        f8768f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f8769n = Integer.toString(3, 36);
        f8770r = Integer.toString(4, 36);
    }

    public p2(o4.s0 s0Var, boolean z4, int[] iArr, boolean[] zArr) {
        boolean z10;
        int i10 = s0Var.f16400a;
        this.f8771a = i10;
        boolean z11 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        h5.a.f(z10);
        this.f8772b = s0Var;
        if (z4 && i10 > 1) {
            z11 = true;
        }
        this.f8773c = z11;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && p2.class == obj.getClass()) {
            p2 p2Var = (p2) obj;
            if (this.f8773c == p2Var.f8773c && this.f8772b.equals(p2Var.f8772b) && Arrays.equals(this.d, p2Var.d) && Arrays.equals(this.e, p2Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f8772b.hashCode() * 31) + (this.f8773c ? 1 : 0)) * 31)) * 31);
    }
}
