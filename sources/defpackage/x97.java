package defpackage;
public final class x97 {
    public final int a;
    public final int b;

    public x97(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof x97)) {
            return false;
        }
        x97 x97Var = (x97) obj;
        if (this.a != x97Var.a || this.b != x97Var.b) {
            return false;
        }
        return true;
    }
}
