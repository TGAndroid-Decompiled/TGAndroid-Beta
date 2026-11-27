package defpackage;

import java.util.List;
public final class m80 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public o80 g;
    public n90 h;
    public m90 i;
    public r80 j;
    public List k;
    public int l;
    public byte m;

    public final n80 a() {
        String str;
        String str2;
        o80 o80Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (o80Var = this.g) != null) {
            return new n80(str, str2, this.c, this.d, this.e, this.f, o80Var, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" generator");
        }
        if (this.b == null) {
            sb.append(" identifier");
        }
        if ((this.m & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.m & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.g == null) {
            sb.append(" app");
        }
        if ((this.m & 4) == 0) {
            sb.append(" generatorType");
        }
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
