package defpackage;

import java.util.Arrays;
public final class sj1 extends wl5 implements rj1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final wl5[] g;

    public sj1(String str, int i, int i2, long j, long j2, wl5[] wl5VarArr) {
        super("CHAP");
        boolean z;
        String str2;
        if (i <= i2) {
            z = true;
        } else {
            z = false;
        }
        yve.f(z);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = wl5VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 < length) {
                wl5 wl5Var = wl5VarArr[i3];
                if (wl5Var instanceof jlb) {
                    jlb jlbVar = (jlb) wl5Var;
                    po5 po5Var = jlbVar.c;
                    if (jlbVar.a.equals("TIT2") && !po5Var.isEmpty()) {
                        str2 = (String) po5Var.get(0);
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
            new xy5(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = wl5VarArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && sj1.class == obj.getClass()) {
                sj1 sj1Var = (sj1) obj;
                if (this.c == sj1Var.c && this.d == sj1Var.d && this.e == sj1Var.e && this.f == sj1Var.f && this.b.equals(sj1Var.b) && Arrays.equals(this.g, sj1Var.g)) {
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
