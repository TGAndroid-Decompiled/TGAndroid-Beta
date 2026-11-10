package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f5858a;
    public final Boolean f5859b;
    public final Boolean f5860c;
    public final Boolean d;
    public final Boolean f5861e;

    public te(a8.r7 r7Var) {
        this.f5858a = (Boolean) r7Var.d;
        this.f5859b = (Boolean) r7Var.f616e;
        this.f5860c = (Boolean) r7Var.f617f;
        this.d = (Boolean) r7Var.f614b;
        this.f5861e = (Boolean) r7Var.f615c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.k(this.f5858a, teVar.f5858a) && q6.m.k(this.f5859b, teVar.f5859b) && q6.m.k(this.f5860c, teVar.f5860c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.f5861e, teVar.f5861e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5858a, this.f5859b, this.f5860c, this.d, this.f5861e});
    }
}
