package defpackage;

import java.util.List;
public final class u80 {
    public w80 a;
    public List b;
    public List c;
    public Boolean d;
    public rz2 e;
    public List f;
    public int g;
    public byte h;

    public final v80 a() {
        w80 w80Var;
        if (this.h == 1 && (w80Var = this.a) != null) {
            return new v80(w80Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
