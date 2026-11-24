package defpackage;
public final class u56 {
    public final Object a;
    public final String b;

    public u56(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u56) {
                u56 u56Var = (u56) obj;
                if (this.a == u56Var.a && this.b.equals(u56Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (System.identityHashCode(this.a) * 31);
    }
}
