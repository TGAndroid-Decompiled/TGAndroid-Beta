package j3;

import java.util.Arrays;
public final class s2 implements g {
    public static final String f10763f;
    public static final String h;
    public static final String f10764n;
    public static final String f10765r;
    public final int f10766a;
    public final l4.j1 f10767b;
    public final boolean f10768c;
    public final int[] d;
    public final boolean[] f10769e;

    static {
        int i10 = f5.d0.f6579a;
        f10763f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f10764n = Integer.toString(3, 36);
        f10765r = Integer.toString(4, 36);
    }

    public s2(l4.j1 j1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = j1Var.f14347a;
        this.f10766a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        f5.a.f(z11);
        this.f10767b = j1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f10768c = z12;
        this.d = (int[]) iArr.clone();
        this.f10769e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s2.class == obj.getClass()) {
            s2 s2Var = (s2) obj;
            if (this.f10768c == s2Var.f10768c && this.f10767b.equals(s2Var.f10767b) && Arrays.equals(this.d, s2Var.d) && Arrays.equals(this.f10769e, s2Var.f10769e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10769e) + ((hashCode + (((this.f10767b.hashCode() * 31) + (this.f10768c ? 1 : 0)) * 31)) * 31);
    }
}
