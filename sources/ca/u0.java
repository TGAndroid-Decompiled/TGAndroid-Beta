package ca;

import java.util.List;
public final class u0 {
    public i2 f4555a;
    public List f4556b;
    public List f4557c;
    public Boolean d;
    public j2 f4558e;
    public List f4559f;
    public int f4560g;
    public byte h;

    public final v0 a() {
        i2 i2Var;
        if (this.h == 1 && (i2Var = this.f4555a) != null) {
            return new v0(i2Var, this.f4556b, this.f4557c, this.d, this.f4558e, this.f4559f, this.f4560g);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4555a == null) {
            sb2.append(" execution");
        }
        if ((1 & this.h) == 0) {
            sb2.append(" uiOrientation");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
