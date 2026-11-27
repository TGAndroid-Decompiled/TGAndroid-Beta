package defpackage;

import j$.util.Objects;
public final class xg5 {
    public final String a;
    public final byte b;
    public final double c;
    public final String d;

    public xg5(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        yve.p(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof xg5) {
                xg5 xg5Var = (xg5) obj;
                if (this.b == xg5Var.b && Double.compare(this.c, xg5Var.c) == 0 && this.a.equals(xg5Var.a) && Objects.equals(this.d, xg5Var.d)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public xg5(String str, double d) {
        this.a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }
}
