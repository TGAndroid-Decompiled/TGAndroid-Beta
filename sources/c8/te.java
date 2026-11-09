package c8;

import java.util.Arrays;
public final class te {
    public final Boolean f5853a;
    public final Boolean f5854b;
    public final Boolean f5855c;
    public final Boolean d;
    public final Boolean f5856e;

    public te(a8.r7 r7Var) {
        this.f5853a = (Boolean) r7Var.d;
        this.f5854b = (Boolean) r7Var.f616e;
        this.f5855c = (Boolean) r7Var.f617f;
        this.d = (Boolean) r7Var.f614b;
        this.f5856e = (Boolean) r7Var.f615c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof te)) {
            return false;
        }
        te teVar = (te) obj;
        if (q6.m.k(this.f5853a, teVar.f5853a) && q6.m.k(this.f5854b, teVar.f5854b) && q6.m.k(this.f5855c, teVar.f5855c) && q6.m.k(this.d, teVar.d) && q6.m.k(this.f5856e, teVar.f5856e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f5853a, this.f5854b, this.f5855c, this.d, this.f5856e});
    }
}
