package defpackage;
public final class ok1 {
    public static final nk1 b = new Object();
    public final Object a;

    public final boolean equals(Object obj) {
        if (obj instanceof ok1) {
            if (!this.a.equals(((ok1) obj).a)) {
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
        if (obj instanceof mk1) {
            return ((mk1) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
