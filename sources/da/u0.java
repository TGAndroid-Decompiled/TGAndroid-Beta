package da;

import java.util.List;
public final class u0 {
    public i2 f8192a;
    public List f8193b;
    public List f8194c;
    public Boolean d;
    public j2 f8195e;
    public List f8196f;
    public int f8197g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8192a) != null) {
            return new v0(i2Var, this.f8193b, this.f8194c, this.d, this.f8195e, this.f8196f, this.f8197g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8192a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
