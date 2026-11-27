package defpackage;
public final class ek2 {
    public final String a;
    public final String b;

    public ek2(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ek2) {
            ek2 ek2Var = (ek2) obj;
            if (this.a.equals(ek2Var.a) && this.b.equals(ek2Var.b)) {
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
