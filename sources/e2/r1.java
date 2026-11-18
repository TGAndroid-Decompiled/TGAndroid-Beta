package e2;

import a8.la;
import java.util.Arrays;
public final class r1 {
    public static final String f10686f;
    public static final String f10687g;
    public static final String h;
    public static final String f10688i;
    public final int f10689a;
    public final m1 f10690b;
    public final boolean f10691c;
    public final int[] d;
    public final boolean[] f10692e;

    static {
        String str = h2.l0.f13783a;
        f10686f = Integer.toString(0, 36);
        f10687g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f10688i = Integer.toString(4, 36);
    }

    public r1(m1 m1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i7 = m1Var.f10524a;
        this.f10689a = i7;
        boolean z12 = false;
        if (i7 == iArr.length && i7 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        la.f(z11);
        this.f10690b = m1Var;
        if (z10 && i7 > 1) {
            z12 = true;
        }
        this.f10691c = z12;
        this.d = (int[]) iArr.clone();
        this.f10692e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r1.class == obj.getClass()) {
            r1 r1Var = (r1) obj;
            if (this.f10691c == r1Var.f10691c && this.f10690b.equals(r1Var.f10690b) && Arrays.equals(this.d, r1Var.d) && Arrays.equals(this.f10692e, r1Var.f10692e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f10692e) + ((hashCode + (((this.f10690b.hashCode() * 31) + (this.f10691c ? 1 : 0)) * 31)) * 31);
    }
}
