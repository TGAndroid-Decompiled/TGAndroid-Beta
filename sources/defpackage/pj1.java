package defpackage;
public final class pj1 {
    public static final oj1 b = new Object();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof pj1) {
            if (!this.a.equals(((pj1) obj).a)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        Object obj = this.a;
        if (obj instanceof nj1) {
            return ((nj1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
