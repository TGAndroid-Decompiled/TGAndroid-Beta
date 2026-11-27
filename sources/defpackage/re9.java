package defpackage;

import java.io.Serializable;
public final class re9 extends eu7 implements Serializable {
    public final eu7 a;

    public re9(eu7 eu7Var) {
        this.a = eu7Var;
    }

    @Override
    public final eu7 a() {
        return this.a;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        return this.a.compare(obj2, obj);
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof re9) {
            return this.a.equals(((re9) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.a.hashCode();
    }

    public final String toString() {
        return this.a + ".reverse()";
    }
}
