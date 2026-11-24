package defpackage;

import java.util.Arrays;
public final class dyb {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final sxb b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = g8c.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public dyb(sxb sxbVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i2 = sxbVar.a;
        this.a = i2;
        boolean z3 = false;
        if (i2 == iArr.length && i2 == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        gre.f(z2);
        this.b = sxbVar;
        if (z && i2 > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && dyb.class == obj.getClass()) {
                dyb dybVar = (dyb) obj;
                if (this.c == dybVar.c && this.b.equals(dybVar.b) && Arrays.equals(this.d, dybVar.d) && Arrays.equals(this.e, dybVar.e)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.d);
        return Arrays.hashCode(this.e) + ((hashCode + (((this.b.hashCode() * 31) + (this.c ? 1 : 0)) * 31)) * 31);
    }
}
