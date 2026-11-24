package defpackage;
public final class tu8 {
    public final int a;
    public final boolean b;

    public tu8(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && tu8.class == obj.getClass()) {
                tu8 tu8Var = (tu8) obj;
                if (this.a == tu8Var.a && this.b == tu8Var.b) {
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
