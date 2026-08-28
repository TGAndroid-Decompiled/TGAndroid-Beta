package j4;
public class b0 {
    public final Object f13426a;
    public final int f13427b;
    public final int f13428c;
    public final long d;
    public final int f13429e;

    public b0(Object obj, long j10) {
        this(-1, -1, -1, j10, obj);
    }

    public final boolean a() {
        if (this.f13427b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        if (this.f13426a.equals(b0Var.f13426a) && this.f13427b == b0Var.f13427b && this.f13428c == b0Var.f13428c && this.d == b0Var.d && this.f13429e == b0Var.f13429e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.f13426a.hashCode() + 527) * 31) + this.f13427b) * 31) + this.f13428c) * 31) + ((int) this.d)) * 31) + this.f13429e;
    }

    public b0(b0 b0Var) {
        this.f13426a = b0Var.f13426a;
        this.f13427b = b0Var.f13427b;
        this.f13428c = b0Var.f13428c;
        this.d = b0Var.d;
        this.f13429e = b0Var.f13429e;
    }

    public b0(int i9, int i10, int i11, long j10, Object obj) {
        this.f13426a = obj;
        this.f13427b = i9;
        this.f13428c = i10;
        this.d = j10;
        this.f13429e = i11;
    }
}
