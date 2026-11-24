package defpackage;

import java.util.List;
public final class s90 {
    public u90 a;
    public List b;
    public List c;
    public Boolean d;
    public h03 e;
    public List f;
    public int g;
    public byte h;

    public final t90 a() {
        u90 u90Var;
        if (this.h == 1 && (u90Var = this.a) != null) {
            return new t90(u90Var, this.b, this.c, this.d, this.e, this.f, this.g);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" execution");
        }
        if ((this.h & 1) == 0) {
            sb.append(" uiOrientation");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }
}
