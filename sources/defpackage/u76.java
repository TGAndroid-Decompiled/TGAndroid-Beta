package defpackage;
public final class u76 {
    public final Object a;
    public final String b;

    public u76(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof u76) {
                u76 u76Var = (u76) obj;
                if (this.a == u76Var.a && this.b.equals(u76Var.b)) {
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
