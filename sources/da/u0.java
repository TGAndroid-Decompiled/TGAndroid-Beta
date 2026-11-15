package da;

import java.util.List;
public final class u0 {
    public i2 f7919a;
    public List f7920b;
    public List f7921c;
    public Boolean d;
    public j2 f7922e;
    public List f7923f;
    public int f7924g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f7919a) != null) {
            return new v0(i2Var, this.f7920b, this.f7921c, this.d, this.f7922e, this.f7923f, this.f7924g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7919a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
