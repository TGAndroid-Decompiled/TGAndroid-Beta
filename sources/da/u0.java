package da;

import java.util.List;
public final class u0 {
    public i2 f8230a;
    public List f8231b;
    public List f8232c;
    public Boolean d;
    public j2 f8233e;
    public List f8234f;
    public int f8235g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8230a) != null) {
            return new v0(i2Var, this.f8231b, this.f8232c, this.d, this.f8233e, this.f8234f, this.f8235g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8230a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
