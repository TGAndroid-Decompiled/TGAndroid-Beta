package defpackage;
public final class ec7 {
    public final int a;
    public final int b;

    public ec7(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ec7)) {
            return false;
        }
        ec7 ec7Var = (ec7) obj;
        if (this.a != ec7Var.a || this.b != ec7Var.b) {
            return false;
        }
        return true;
    }
}
