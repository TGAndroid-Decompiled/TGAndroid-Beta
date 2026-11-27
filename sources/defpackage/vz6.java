package defpackage;
public final class vz6 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public vz6(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final vz6 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new vz6(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b(vz6 vz6Var) {
        if (vz6Var == null) {
            return false;
        }
        if (this == vz6Var) {
            return true;
        }
        if (!this.a.equals(vz6Var.a) || this.b != vz6Var.b || this.c != vz6Var.c || this.d != vz6Var.d) {
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
        if (!(obj instanceof vz6)) {
            return false;
        }
        vz6 vz6Var = (vz6) obj;
        if (b(vz6Var) && this.e == vz6Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public vz6(long j, Object obj) {
        this(obj, -1, -1, j, -1);
    }

    public vz6(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public vz6(Object obj) {
        this(-1L, obj);
    }
}
