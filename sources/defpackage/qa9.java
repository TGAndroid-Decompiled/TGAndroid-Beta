package defpackage;
public final class qa9 {
    public static final qa9 c = new qa9(0, false);
    public final byte a;
    public final boolean b;

    public qa9(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && qa9.class == obj.getClass()) {
                qa9 qa9Var = (qa9) obj;
                if (this.a == qa9Var.a && this.b == qa9Var.b) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.a << 1) + (this.b ? 1 : 0);
    }
}
