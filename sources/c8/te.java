package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4994a;
    public final Boolean f4995b;
    public final Boolean f4996c;
    public final Boolean d;
    public final Boolean f4997e;

    public te(a8.r7 r7Var) {
        this.f4994a = (Boolean) r7Var.d;
        this.f4995b = (Boolean) r7Var.f619e;
        this.f4996c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f4997e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.l(this.f4994a, teVar.f4994a) && q6.m.l(this.f4995b, teVar.f4995b) && q6.m.l(this.f4996c, teVar.f4996c) && q6.m.l(this.d, teVar.d) && q6.m.l(this.f4997e, teVar.f4997e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4994a, this.f4995b, this.f4996c, this.d, this.f4997e});
    }
}
