package defpackage;

import j$.util.Objects;
public final class xg0 {
    public final String a;
    public final String b;
    public final int c;
    public final int d;

    public xg0(int i, int i2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xg0)) {
            return false;
        }
        xg0 xg0Var = (xg0) obj;
        if (this.c == xg0Var.c && this.d == xg0Var.d && Objects.equals(this.a, xg0Var.a) && Objects.equals(this.b, xg0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c), Integer.valueOf(this.d));
    }
}
