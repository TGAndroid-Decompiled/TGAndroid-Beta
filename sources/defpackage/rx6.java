package defpackage;
public final class rx6 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public rx6(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final rx6 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new rx6(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(rx6 rx6Var) {
        if (rx6Var == null) {
            return false;
        }
        if (this == rx6Var) {
            return true;
        }
        if (!this.a.equals(rx6Var.a) || this.b != rx6Var.b || this.c != rx6Var.c || this.d != rx6Var.d) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rx6)) {
            return false;
        }
        rx6 rx6Var = (rx6) obj;
        if (b(rx6Var) && this.e == rx6Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public rx6(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public rx6(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public rx6(Object obj) {
        this(obj, -1L);
    }
}
