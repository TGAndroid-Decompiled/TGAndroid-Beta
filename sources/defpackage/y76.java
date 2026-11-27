package defpackage;
public final class y76 {
    public final Object a;
    public final String b;

    public y76(Object obj, String str) {
        this.a = obj;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y76) {
                y76 y76Var = (y76) obj;
                if (this.a == y76Var.a && this.b.equals(y76Var.b)) {
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
