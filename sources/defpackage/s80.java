package defpackage;

import java.util.List;
public final class s80 {
    public u80 a;
    public List b;
    public List c;
    public Boolean d;
    public wy2 e;
    public List f;
    public int g;
    public byte h;

    public final t80 a() {
        u80 u80Var;
        if (this.h == 1 && (u80Var = this.a) != null) {
            return new t80(u80Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }
}
