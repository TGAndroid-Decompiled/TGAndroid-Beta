package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public final class d51 extends eu7 implements Serializable {
    public final es4 a;
    public final eu7 b;

    public d51(es4 es4Var, eu7 eu7Var) {
        this.a = es4Var;
        this.b = eu7Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        es4 es4Var = this.a;
        return this.b.compare(es4Var.apply(obj), es4Var.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof d51) {
                d51 d51Var = (d51) obj;
                if (this.a.equals(d51Var.a) && this.b.equals(d51Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.b + ".onResultOf(" + this.a + ")";
    }
}
