package da;

import java.util.List;
public final class u0 {
    public i2 f7916a;
    public List f7917b;
    public List f7918c;
    public Boolean d;
    public j2 f7919e;
    public List f7920f;
    public int f7921g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f7916a) != null) {
            return new v0(i2Var, this.f7917b, this.f7918c, this.d, this.f7919e, this.f7920f, this.f7921g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7916a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
