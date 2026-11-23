package da;

import java.util.List;
public final class u0 {
    public i2 f8193a;
    public List f8194b;
    public List f8195c;
    public Boolean d;
    public j2 f8196e;
    public List f8197f;
    public int f8198g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8193a) != null) {
            return new v0(i2Var, this.f8194b, this.f8195c, this.d, this.f8196e, this.f8197f, this.f8198g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8193a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
