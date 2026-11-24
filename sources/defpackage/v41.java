package defpackage;

import java.io.Serializable;
import java.util.Arrays;
public final class v41 extends yq7 implements Serializable {
    public final aq4 a;
    public final yq7 b;

    public v41(aq4 aq4Var, yq7 yq7Var) {
        this.a = aq4Var;
        this.b = yq7Var;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        aq4 aq4Var = this.a;
        return this.b.compare(aq4Var.apply(obj), aq4Var.apply(obj2));
    }

    @Override
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof v41) {
                v41 v41Var = (v41) obj;
                if (this.a.equals(v41Var.a) && this.b.equals(v41Var.b)) {
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
