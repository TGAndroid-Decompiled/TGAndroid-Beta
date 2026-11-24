package defpackage;
public final class yb7 {
    public final int a;
    public final int b;

    public yb7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yb7)) {
            return false;
        }
        yb7 yb7Var = (yb7) obj;
        if (this.a != yb7Var.a || this.b != yb7Var.b) {
            return false;
        }
        return true;
    }
}
