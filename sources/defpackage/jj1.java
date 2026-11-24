package defpackage;

import java.util.Arrays;
public final class jj1 extends uj5 implements ij1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final uj5[] g;

    public jj1(String str, int i, int i2, long j, long j2, uj5[] uj5VarArr) {
        super("CHAP");
        boolean z;
        String str2;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = uj5VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                uj5 uj5Var = uj5VarArr[i3];
                if (uj5Var instanceof nhb) {
                    nhb nhbVar = (nhb) uj5Var;
                    mm5 mm5Var = nhbVar.c;
                    if (nhbVar.a.equals("TIT2") && !mm5Var.isEmpty()) {
                        str2 = (String) mm5Var.get(0);
                        break;
                    }
                }
                i3++;
            } else {
                str2 = null;
                break;
            }
        }
        if (str2 != null) {
            new sw5(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = uj5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && jj1.class == obj.getClass()) {
                jj1 jj1Var = (jj1) obj;
                if (this.c == jj1Var.c && this.d == jj1Var.d && this.e == jj1Var.e && this.f == jj1Var.f && this.b.equals(jj1Var.b) && Arrays.equals(this.g, jj1Var.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
