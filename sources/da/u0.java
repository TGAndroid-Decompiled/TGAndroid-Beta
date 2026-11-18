package da;

import java.util.List;
public final class u0 {
    public i2 f8198a;
    public List f8199b;
    public List f8200c;
    public Boolean d;
    public j2 f8201e;
    public List f8202f;
    public int f8203g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8198a) != null) {
            return new v0(i2Var, this.f8199b, this.f8200c, this.d, this.f8201e, this.f8202f, this.f8203g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8198a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
