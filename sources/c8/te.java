package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4681a;
    public final Boolean f4682b;
    public final Boolean f4683c;
    public final Boolean d;
    public final Boolean f4684e;

    public te(a8.r7 r7Var) {
        this.f4681a = (Boolean) r7Var.d;
        this.f4682b = (Boolean) r7Var.f619e;
        this.f4683c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f4684e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.k(this.f4681a, teVar.f4681a) && q6.m.k(this.f4682b, teVar.f4682b) && q6.m.k(this.f4683c, teVar.f4683c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.f4684e, teVar.f4684e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4681a, this.f4682b, this.f4683c, this.d, this.f4684e});
    }
}
