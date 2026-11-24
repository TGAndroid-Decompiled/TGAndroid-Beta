package defpackage;

import j$.util.Objects;
public final class mw7 {
    public final Object a;
    public final Object b;

    public mw7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mw7)) {
            return false;
        }
        mw7 mw7Var = (mw7) obj;
        if (!Objects.equals(mw7Var.a, this.a) || !Objects.equals(mw7Var.b, this.b)) {
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
