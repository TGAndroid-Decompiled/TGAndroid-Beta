package defpackage;

import java.util.List;
public final class k80 {
    public String a;
    public String b;
    public String c;
    public long d;
    public Long e;
    public boolean f;
    public m80 g;
    public l90 h;
    public k90 i;
    public p80 j;
    public List k;
    public int l;
    public byte m;

    public final l80 a() {
        String str;
        String str2;
        m80 m80Var;
        if (this.m == 7 && (str = this.a) != null && (str2 = this.b) != null && (m80Var = this.g) != null) {
            return new l80(str, str2, this.c, this.d, this.e, this.f, m80Var, this.h, this.i, this.j, this.k, this.l);
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
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }
}
