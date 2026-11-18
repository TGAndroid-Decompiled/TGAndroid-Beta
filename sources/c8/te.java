package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4968a;
    public final Boolean f4969b;
    public final Boolean f4970c;
    public final Boolean d;
    public final Boolean f4971e;

    public te(a8.r7 r7Var) {
        this.f4968a = (Boolean) r7Var.d;
        this.f4969b = (Boolean) r7Var.f619e;
        this.f4970c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f4971e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.l(this.f4968a, teVar.f4968a) && q6.m.l(this.f4969b, teVar.f4969b) && q6.m.l(this.f4970c, teVar.f4970c) && q6.m.l(this.d, teVar.d) && q6.m.l(this.f4971e, teVar.f4971e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4968a, this.f4969b, this.f4970c, this.d, this.f4971e});
    }
}
