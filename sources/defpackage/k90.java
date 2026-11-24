package defpackage;

import java.util.List;
public final class k90 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public m90 g;
    public la0 h;
    public ka0 i;
    public p90 j;
    public List k;
    public int l;
    public byte m;

    public final l90 a() {
        String str;
        String str2;
        m90 m90Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (m90Var = this.g) != null) {
            return new l90(str, str2, this.c, this.d, this.e, this.f, m90Var, this.h, this.i, this.j, this.k, this.l);
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
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }
}
