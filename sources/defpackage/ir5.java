package defpackage;
public final class ir5 {
    public final int a;
    public final int b;

    public ir5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ir5.class == obj.getClass()) {
            ir5 ir5Var = (ir5) obj;
            if (this.a == ir5Var.a && this.b == ir5Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IntSize(");
        sb.append(this.a);
        sb.append(", ");
        return hg9.k(sb, this.b, ")");
    }
}
