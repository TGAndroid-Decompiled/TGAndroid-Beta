package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4965a;
    public final Boolean f4966b;
    public final Boolean f4967c;
    public final Boolean d;
    public final Boolean f4968e;

    public te(a8.r7 r7Var) {
        this.f4965a = (Boolean) r7Var.d;
        this.f4966b = (Boolean) r7Var.f619e;
        this.f4967c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f4968e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.l(this.f4965a, teVar.f4965a) && q6.m.l(this.f4966b, teVar.f4966b) && q6.m.l(this.f4967c, teVar.f4967c) && q6.m.l(this.d, teVar.d) && q6.m.l(this.f4968e, teVar.f4968e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4965a, this.f4966b, this.f4967c, this.d, this.f4968e});
    }
}
