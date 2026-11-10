package da;

import java.util.List;
public final class u0 {
    public i2 f8532a;
    public List f8533b;
    public List f8534c;
    public Boolean d;
    public j2 f8535e;
    public List f8536f;
    public int f8537g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8532a) != null) {
            return new v0(i2Var, this.f8533b, this.f8534c, this.d, this.f8535e, this.f8536f, this.f8537g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8532a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
