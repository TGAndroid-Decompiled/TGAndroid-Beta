package defpackage;
public final class wx5 implements Comparable {
    public static final wx5 b = new wx5();
    public final int a = 131594;

    @Override
    public final int compareTo(Object obj) {
        wx5 wx5Var = (wx5) obj;
        wx5Var.getClass();
        return this.a - wx5Var.a;
    }

    public final boolean equals(Object obj) {
        wx5 wx5Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof wx5) {
            wx5Var = (wx5) obj;
        } else {
            wx5Var = null;
        }
        if (wx5Var != null && this.a == wx5Var.a) {
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
