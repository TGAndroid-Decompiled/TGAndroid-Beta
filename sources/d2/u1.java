package d2;

import b8.zb;
import java.util.Arrays;
public final class u1 {
    public static final String f8441f;
    public static final String f8442g;
    public static final String h;
    public static final String f8443i;
    public final int f8444a;
    public final o1 f8445b;
    public final boolean f8446c;
    public final int[] d;
    public final boolean[] f8447e;

    static {
        String str = g2.n0.f11873a;
        f8441f = Integer.toString(0, 36);
        f8442g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f8443i = Integer.toString(4, 36);
    }

    public u1(o1 o1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i3 = o1Var.f8252a;
        this.f8444a = i3;
        boolean z12 = false;
        if (i3 == iArr.length && i3 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        zb.f(z11);
        this.f8445b = o1Var;
        if (z10 && i3 > 1) {
            z12 = true;
        }
        this.f8446c = z12;
        this.d = (int[]) iArr.clone();
        this.f8447e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class == obj.getClass()) {
            u1 u1Var = (u1) obj;
            if (this.f8446c == u1Var.f8446c && this.f8445b.equals(u1Var.f8445b) && Arrays.equals(this.d, u1Var.d) && Arrays.equals(this.f8447e, u1Var.f8447e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.f8447e) + ((hashCode + (((this.f8445b.hashCode() * 31) + (this.f8446c ? 1 : 0)) * 31)) * 31);
    }
}
