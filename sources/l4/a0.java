package l4;
public class a0 {
    public final Object f14262a;
    public final int f14263b;
    public final int f14264c;
    public final long d;
    public final int f14265e;

    public a0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public final boolean a() {
        if (this.f14263b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (this.f14262a.equals(a0Var.f14262a) && this.f14263b == a0Var.f14263b && this.f14264c == a0Var.f14264c && this.d == a0Var.d && this.f14265e == a0Var.f14265e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f14262a.hashCode() + 527) * 31) + this.f14263b) * 31) + this.f14264c) * 31) + ((int) this.d)) * 31) + this.f14265e;
    }

    public a0(a0 a0Var) {
        this.f14262a = a0Var.f14262a;
        this.f14263b = a0Var.f14263b;
        this.f14264c = a0Var.f14264c;
        this.d = a0Var.d;
        this.f14265e = a0Var.f14265e;
    }

    public a0(int i10, int i11, int i12, long j10, Object obj) {
        this.f14262a = obj;
        this.f14263b = i10;
        this.f14264c = i11;
        this.d = j10;
        this.f14265e = i12;
    }
}
