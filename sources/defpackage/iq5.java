package defpackage;

import android.graphics.Insets;
public final class iq5 {
    public static final iq5 e = new iq5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public iq5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static iq5 a(iq5 iq5Var, iq5 iq5Var2) {
        return b(Math.max(iq5Var.a, iq5Var2.a), Math.max(iq5Var.b, iq5Var2.b), Math.max(iq5Var.c, iq5Var2.c), Math.max(iq5Var.d, iq5Var2.d));
    }

    public static iq5 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new iq5(i, i2, i3, i4);
    }

    public static iq5 c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return b(i, i2, i3, i4);
    }

    public final Insets d() {
        return rs.m(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iq5.class != obj.getClass()) {
            return false;
        }
        iq5 iq5Var = (iq5) obj;
        if (this.d == iq5Var.d && this.a == iq5Var.a && this.c == iq5Var.c && this.b == iq5Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    public final String toString() {
        return "Insets{left=" + this.a + ", top=" + this.b + ", right=" + this.c + ", bottom=" + this.d + '}';
    }
}
