package da;

import java.util.List;
public final class u0 {
    public i2 f8201a;
    public List f8202b;
    public List f8203c;
    public Boolean d;
    public j2 f8204e;
    public List f8205f;
    public int f8206g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f8201a) != null) {
            return new v0(i2Var, this.f8202b, this.f8203c, this.d, this.f8204e, this.f8205f, this.f8206g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8201a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
