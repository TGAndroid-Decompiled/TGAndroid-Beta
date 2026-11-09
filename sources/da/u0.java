package da;

import java.util.List;
public final class u0 {
    public i2 f8527a;
    public List f8528b;
    public List f8529c;
    public Boolean d;
    public j2 f8530e;
    public List f8531f;
    public int f8532g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8527a) != null) {
            return new v0(i2Var, this.f8528b, this.f8529c, this.d, this.f8530e, this.f8531f, this.f8532g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8527a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
