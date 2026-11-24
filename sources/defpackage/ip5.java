package defpackage;
public final class ip5 {
    public final int a;
    public final int b;

    public ip5(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ip5.class == obj.getClass()) {
            ip5 ip5Var = (ip5) obj;
            if (this.a == ip5Var.a && this.b == ip5Var.b) {
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
        return de9.l(sb, this.b, ")");
    }
}
