package h3;

import java.util.Arrays;

public final class t2 implements g {

    public static final String f8197f;
    public static final String h;

    public static final String f8198n;

    public static final String f8199r;

    public final int f8200a;

    public final j4.i1 f8201b;

    public final boolean f8202c;
    public final int[] d;

    public final boolean[] f8203e;

    static {
        int i10 = d5.g0.f4795a;
        f8197f = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        f8198n = Integer.toString(3, 36);
        f8199r = Integer.toString(4, 36);
    }

    public t2(j4.i1 i1Var, boolean z10, int[] iArr, boolean[] zArr) {
        int i10 = i1Var.f12583a;
        this.f8200a = i10;
        boolean z11 = false;
        d5.a.f(i10 == iArr.length && i10 == zArr.length);
        this.f8201b = i1Var;
        if (z10 && i10 > 1) {
            z11 = true;
        }
        this.f8202c = z11;
        this.d = (int[]) iArr.clone();
        this.f8203e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t2.class == obj.getClass()) {
            t2 t2Var = (t2) obj;
            if (this.f8202c == t2Var.f8202c && this.f8201b.equals(t2Var.f8201b) && Arrays.equals(this.d, t2Var.d) && Arrays.equals(this.f8203e, t2Var.f8203e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f8203e) + ((Arrays.hashCode(this.d) + (((this.f8201b.hashCode() * 31) + (this.f8202c ? 1 : 0)) * 31)) * 31);
    }
}
