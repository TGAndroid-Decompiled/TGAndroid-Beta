package e2;

import a8.la;
import java.util.Arrays;
public final class r1 {
    public static final String f10715f;
    public static final String f10716g;
    public static final String h;
    public static final String f10717i;
    public final int f10718a;
    public final m1 f10719b;
    public final boolean f10720c;
    public final int[] d;
    public final boolean[] f10721e;

    static {
        String str = h2.l0.f13812a;
        f10715f = Integer.toString(0, 36);
        f10716g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10717i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10553a;
        this.f10718a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.f(z11);
        this.f10719b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10720c = z12;
        this.d = (int[]) iArr.clone();
        this.f10721e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10720c == r1Var.f10720c && this.f10719b.equals(r1Var.f10719b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10721e, r1Var.f10721e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10721e) + ((hashCode + (((this.f10719b.hashCode() * 31) + (this.f10720c ? 1 : 0)) * 31)) * 31);
    }
}
