package j4;

public final class q0 {

    public final int f12644a;

    public final boolean f12645b;

    public q0(int i10, boolean z10) {
        this.f12644a = i10;
        this.f12645b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q0.class != obj.getClass()) {
            return false;
        }
        q0 q0Var = (q0) obj;
        return this.f12644a == q0Var.f12644a && this.f12645b == q0Var.f12645b;
    }

    public final int hashCode() {
        return (this.f12644a * 31) + (this.f12645b ? 1 : 0);
    }
}
