package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f5855a;
    public final Boolean f5856b;
    public final Boolean f5857c;
    public final Boolean d;
    public final Boolean f5858e;

    public te(a8.r7 r7Var) {
        this.f5855a = (Boolean) r7Var.d;
        this.f5856b = (Boolean) r7Var.f616e;
        this.f5857c = (Boolean) r7Var.f617f;
        this.d = (Boolean) r7Var.f614b;
        this.f5858e = (Boolean) r7Var.f615c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.k(this.f5855a, teVar.f5855a) && q6.m.k(this.f5856b, teVar.f5856b) && q6.m.k(this.f5857c, teVar.f5857c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.f5858e, teVar.f5858e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5855a, this.f5856b, this.f5857c, this.d, this.f5858e});
    }
}
