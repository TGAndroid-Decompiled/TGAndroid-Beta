package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4684a;
    public final Boolean f4685b;
    public final Boolean f4686c;
    public final Boolean d;
    public final Boolean f4687e;

    public te(a8.r7 r7Var) {
        this.f4684a = (Boolean) r7Var.d;
        this.f4685b = (Boolean) r7Var.f619e;
        this.f4686c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f4687e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.k(this.f4684a, teVar.f4684a) && q6.m.k(this.f4685b, teVar.f4685b) && q6.m.k(this.f4686c, teVar.f4686c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.f4687e, teVar.f4687e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4684a, this.f4685b, this.f4686c, this.d, this.f4687e});
    }
}
