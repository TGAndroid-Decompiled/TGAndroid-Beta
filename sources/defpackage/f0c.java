package defpackage;

import java.util.Arrays;
public final class f0c {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final uzb b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = hac.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public f0c(uzb uzbVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i2 = uzbVar.a;
        this.a = i2;
        boolean z3 = false;
        if (i2 == iArr.length && i2 == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        jte.f(z2);
        this.b = uzbVar;
        if (z && i2 > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && f0c.class == obj.getClass()) {
                f0c f0cVar = (f0c) obj;
                if (this.c == f0cVar.c && this.b.equals(f0cVar.b) && Arrays.equals(this.d, f0cVar.d) && Arrays.equals(this.e, f0cVar.e)) {
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
