package defpackage;

import java.util.Arrays;
public final class e2c {
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public final int a;
    public final t1c b;
    public final boolean c;
    public final int[] d;
    public final boolean[] e;

    static {
        String str = gcc.a;
        f = "0";
        g = "1";
        h = "3";
        i = "4";
    }

    public e2c(t1c t1cVar, boolean z, int[] iArr, boolean[] zArr) {
        boolean z2;
        int i2 = t1cVar.a;
        this.a = i2;
        boolean z3 = false;
        if (i2 == iArr.length && i2 == zArr.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        yve.f(z2);
        this.b = t1cVar;
        if (z && i2 > 1) {
            z3 = true;
        }
        this.c = z3;
        this.d = (int[]) iArr.clone();
        this.e = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && e2c.class == obj.getClass()) {
                e2c e2cVar = (e2c) obj;
                if (this.c == e2cVar.c && this.b.equals(e2cVar.b) && Arrays.equals(this.d, e2cVar.d) && Arrays.equals(this.e, e2cVar.e)) {
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
