package defpackage;

import android.graphics.Insets;
public final class mq5 {
    public static final mq5 e = new mq5(0, 0, 0, 0);
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public mq5(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public static mq5 a(mq5 mq5Var, mq5 mq5Var2) {
        return b(Math.max(mq5Var.a, mq5Var2.a), Math.max(mq5Var.b, mq5Var2.b), Math.max(mq5Var.c, mq5Var2.c), Math.max(mq5Var.d, mq5Var2.d));
    }

    public static mq5 b(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return e;
        }
        return new mq5(i, i2, i3, i4);
    }

    public static mq5 c(Insets insets) {
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
        return sr.m(this.a, this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mq5.class != obj.getClass()) {
            return false;
        }
        mq5 mq5Var = (mq5) obj;
        if (this.d == mq5Var.d && this.a == mq5Var.a && this.c == mq5Var.c && this.b == mq5Var.b) {
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
