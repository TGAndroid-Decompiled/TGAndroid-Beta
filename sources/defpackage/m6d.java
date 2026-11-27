package defpackage;

import java.util.Arrays;
public final class m6d {
    public final ho a;
    public final a94 b;

    public m6d(ho hoVar, a94 a94Var) {
        this.a = hoVar;
        this.b = a94Var;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m6d) {
            m6d m6dVar = (m6d) obj;
            if (vue.a(this.a, m6dVar.a) && vue.a(this.b, m6dVar.b)) {
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
        um4 um4Var = new um4(this);
        um4Var.a(this.a, "key");
        um4Var.a(this.b, "feature");
        return um4Var.toString();
    }
}
