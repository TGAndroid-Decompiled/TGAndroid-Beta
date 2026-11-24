package defpackage;
public final class ij2 {
    public final String a;
    public final String b;

    public ij2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ij2) {
            ij2 ij2Var = (ij2) obj;
            if (this.a.equals(ij2Var.a) && this.b.equals(ij2Var.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
