package da;

import java.util.List;
public final class u0 {
    public i2 f8227a;
    public List f8228b;
    public List f8229c;
    public Boolean d;
    public j2 f8230e;
    public List f8231f;
    public int f8232g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8227a) != null) {
            return new v0(i2Var, this.f8228b, this.f8229c, this.d, this.f8230e, this.f8231f, this.f8232g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8227a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
