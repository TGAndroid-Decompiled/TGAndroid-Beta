package defpackage;
public final class rz6 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public rz6(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final rz6 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new rz6(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(rz6 rz6Var) {
        if (rz6Var == null) {
            return false;
        }
        if (this == rz6Var) {
            return true;
        }
        if (!this.a.equals(rz6Var.a) || this.b != rz6Var.b || this.c != rz6Var.c || this.d != rz6Var.d) {
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
        if (!(obj instanceof rz6)) {
            return false;
        }
        rz6 rz6Var = (rz6) obj;
        if (b(rz6Var) && this.e == rz6Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public rz6(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public rz6(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public rz6(Object obj) {
        this(obj, -1L);
    }
}
