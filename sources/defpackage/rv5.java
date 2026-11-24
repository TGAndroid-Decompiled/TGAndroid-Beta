package defpackage;
public final class rv5 implements Comparable {
    public static final rv5 b = new rv5();
    public final int a = 131594;

    @Override
    public final int compareTo(Object obj) {
        rv5 rv5Var = (rv5) obj;
        rv5Var.getClass();
        return this.a - rv5Var.a;
    }

    public final boolean equals(Object obj) {
        rv5 rv5Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof rv5) {
            rv5Var = (rv5) obj;
        } else {
            rv5Var = null;
        }
        if (rv5Var != null && this.a == rv5Var.a) {
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
