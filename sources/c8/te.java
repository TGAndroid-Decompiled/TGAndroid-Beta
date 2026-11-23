package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4962a;
    public final Boolean f4963b;
    public final Boolean f4964c;
    public final Boolean d;
    public final Boolean f4965e;

    public te(a8.r7 r7Var) {
        this.f4962a = (Boolean) r7Var.d;
        this.f4963b = (Boolean) r7Var.f618e;
        this.f4964c = (Boolean) r7Var.f619f;
        this.d = (Boolean) r7Var.f616b;
        this.f4965e = (Boolean) r7Var.f617c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.l(this.f4962a, teVar.f4962a) && q6.m.l(this.f4963b, teVar.f4963b) && q6.m.l(this.f4964c, teVar.f4964c) && q6.m.l(this.d, teVar.d) && q6.m.l(this.f4965e, teVar.f4965e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4962a, this.f4963b, this.f4964c, this.d, this.f4965e});
    }
}
