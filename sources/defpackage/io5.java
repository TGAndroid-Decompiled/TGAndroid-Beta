package defpackage;

import android.graphics.Insets;
public final class io5 {
    public static final io5 e = new io5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public io5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static io5 a(io5 io5Var, io5 io5Var2) {
        return b(Math.max(io5Var.a, io5Var2.a), Math.max(io5Var.b, io5Var2.b), Math.max(io5Var.c, io5Var2.c), Math.max(io5Var.d, io5Var2.d));
    }

    public static io5 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new io5(i, i2, i3, i4);
    }

    public static io5 c(Insets insets) {
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
        return rr.m(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || io5.class != obj.getClass()) {
            return false;
        }
        io5 io5Var = (io5) obj;
        if (this.d == io5Var.d && this.a == io5Var.a && this.c == io5Var.c && this.b == io5Var.b) {
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
