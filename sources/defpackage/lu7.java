package defpackage;

import j$.util.Objects;
public final class lu7 {
    public final Object a;
    public final Object b;

    public lu7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof lu7)) {
            return false;
        }
        lu7 lu7Var = (lu7) obj;
        if (!Objects.equals(lu7Var.a, this.a) || !Objects.equals(lu7Var.b, this.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Object obj = this.a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        return "Pair{" + this.a + " " + this.b + "}";
    }
}
