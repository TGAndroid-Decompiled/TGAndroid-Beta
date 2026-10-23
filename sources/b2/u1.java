package b2;

import java.util.Arrays;
import v7.u6;
public final class u1 {
    public static final String f4062f;
    public static final String f4063g;
    public static final String h;
    public static final String f4064i;
    public final int f4065a;
    public final p1 f4066b;
    public final boolean f4067c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = e2.m0.f8259a;
        f4062f = Integer.toString(0, 36);
        f4063g = Integer.toString(1, 36);
        h = Integer.toString(3, 36);
        f4064i = Integer.toString(4, 36);
    }

    public u1(p1 p1Var, boolean z10, int[] iArr, boolean[] zArr) {
        boolean z11;
        int i10 = p1Var.f3907a;
        this.f4065a = i10;
        boolean z12 = false;
        if (i10 == iArr.length && i10 == zArr.length) {
            z11 = true;
        } else {
            z11 = false;
        }
        u6.g(z11);
        this.f4066b = p1Var;
        if (z10 && i10 > 1) {
            z12 = true;
        }
        this.f4067c = z12;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u1.class == obj.getClass()) {
            u1 u1Var = (u1) obj;
            if (this.f4067c == u1Var.f4067c && this.f4066b.equals(u1Var.f4066b) && Arrays.equals(this.d, u1Var.d) && Arrays.equals(this.e, u1Var.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.f4066b.hashCode() * 31) + (this.f4067c ? 1 : 0)) * 31)) * 31);
    }
}
