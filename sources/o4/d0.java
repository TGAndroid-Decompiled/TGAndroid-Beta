package o4;
public final class d0 {
    public final int f16458a;
    public final boolean f16459b;

    public d0(int i10, boolean z4) {
        this.f16458a = i10;
        this.f16459b = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && d0.class == obj.getClass()) {
                d0 d0Var = (d0) obj;
                if (this.f16458a == d0Var.f16458a && this.f16459b == d0Var.f16459b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.f16458a * 31) + (this.f16459b ? 1 : 0);
    }
}
