package da;

import java.util.List;
public final class u0 {
    public i2 f8529a;
    public List f8530b;
    public List f8531c;
    public Boolean d;
    public j2 f8532e;
    public List f8533f;
    public int f8534g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8529a) != null) {
            return new v0(i2Var, this.f8530b, this.f8531c, this.d, this.f8532e, this.f8533f, this.f8534g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8529a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
