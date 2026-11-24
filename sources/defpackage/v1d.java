package defpackage;

import java.util.Arrays;
public final class v1d {
    public final go a;
    public final f84 b;

    public v1d(go goVar, f84 f84Var) {
        this.a = goVar;
        this.b = f84Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v1d) {
            v1d v1dVar = (v1d) obj;
            if (cqe.a(this.a, v1dVar.a) && cqe.a(this.b, v1dVar.b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        wk4 wk4Var = new wk4(this);
        wk4Var.a(this.a, "key");
        wk4Var.a(this.b, "feature");
        return wk4Var.toString();
    }
}
