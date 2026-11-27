package defpackage;
public final class bw8 {
    public final int a;
    public final boolean b;

    public bw8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && bw8.class == obj.getClass()) {
                bw8 bw8Var = (bw8) obj;
                if (this.a == bw8Var.a && this.b == bw8Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a * 31) + (this.b ? 1 : 0);
    }
}
