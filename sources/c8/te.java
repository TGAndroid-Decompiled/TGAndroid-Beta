package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f4997a;
    public final Boolean f4998b;
    public final Boolean f4999c;
    public final Boolean d;
    public final Boolean f5000e;

    public te(a8.r7 r7Var) {
        this.f4997a = (Boolean) r7Var.d;
        this.f4998b = (Boolean) r7Var.f619e;
        this.f4999c = (Boolean) r7Var.f620f;
        this.d = (Boolean) r7Var.f617b;
        this.f5000e = (Boolean) r7Var.f618c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.l(this.f4997a, teVar.f4997a) && q6.m.l(this.f4998b, teVar.f4998b) && q6.m.l(this.f4999c, teVar.f4999c) && q6.m.l(this.d, teVar.d) && q6.m.l(this.f5000e, teVar.f5000e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f4997a, this.f4998b, this.f4999c, this.d, this.f5000e});
    }
}
