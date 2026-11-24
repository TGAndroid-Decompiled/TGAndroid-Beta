package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public final class c61 extends at7 implements Serializable {
    public final bs4 a;
    public final at7 b;

    public c61(bs4 bs4Var, at7 at7Var) {
        this.a = bs4Var;
        this.b = at7Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        bs4 bs4Var = this.a;
        return this.b.compare(bs4Var.apply(obj), bs4Var.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c61) {
                c61 c61Var = (c61) obj;
                if (this.a.equals(c61Var.a) && this.b.equals(c61Var.b)) {
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
