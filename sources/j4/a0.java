package j4;

public class a0 {

    public final Object f12503a;

    public final int f12504b;

    public final int f12505c;
    public final long d;

    public final int f12506e;

    public a0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public final boolean a() {
        return this.f12504b != -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f12503a.equals(a0Var.f12503a) && this.f12504b == a0Var.f12504b && this.f12505c == a0Var.f12505c && this.d == a0Var.d && this.f12506e == a0Var.f12506e;
    }

    public final int hashCode() {
        return ((((((((this.f12503a.hashCode() + 527) * 31) + this.f12504b) * 31) + this.f12505c) * 31) + ((int) this.d)) * 31) + this.f12506e;
    }

    public a0(a0 a0Var) {
        this.f12503a = a0Var.f12503a;
        this.f12504b = a0Var.f12504b;
        this.f12505c = a0Var.f12505c;
        this.d = a0Var.d;
        this.f12506e = a0Var.f12506e;
    }

    public a0(int i10, int i11, int i12, long j10, Object obj) {
        this.f12503a = obj;
        this.f12504b = i10;
        this.f12505c = i11;
        this.d = j10;
        this.f12506e = i12;
    }
}
