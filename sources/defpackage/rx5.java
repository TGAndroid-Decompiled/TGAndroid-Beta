package defpackage;
public final class rx5 implements Comparable {
    public static final rx5 b = new rx5();
    public final int a = 131594;

    @Override
    public final int compareTo(Object obj) {
        rx5 rx5Var = (rx5) obj;
        rx5Var.getClass();
        return this.a - rx5Var.a;
    }

    public final boolean equals(Object obj) {
        rx5 rx5Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof rx5) {
            rx5Var = (rx5) obj;
        } else {
            rx5Var = null;
        }
        if (rx5Var != null && this.a == rx5Var.a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return "2.2.10";
    }
}
