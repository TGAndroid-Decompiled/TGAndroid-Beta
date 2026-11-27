package defpackage;
public final class lr5 {
    public final int a;
    public final int b;

    public lr5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lr5.class == obj.getClass()) {
            lr5 lr5Var = (lr5) obj;
            if (this.a == lr5Var.a && this.b == lr5Var.b) {
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
        return uh9.l(sb, this.b, ")");
    }
}
