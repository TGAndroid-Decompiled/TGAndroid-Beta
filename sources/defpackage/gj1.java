package defpackage;
public final class gj1 {
    public static final fj1 b = new Object();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof gj1) {
            if (!this.a.equals(((gj1) obj).a)) {
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
        if (obj instanceof ej1) {
            return ((ej1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
