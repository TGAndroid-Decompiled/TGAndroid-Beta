package da;

import java.util.List;
public final class m0 {
    public String f7806a;
    public String f7807b;
    public String f7808c;
    public long d;
    public Long f7809e;
    public boolean f7810f;
    public b2 f7811g;
    public s2 h;
    public r2 f7812i;
    public c2 f7813j;
    public List f7814k;
    public int f7815l;
    public byte f7816m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f7816m == 7 && (str = this.f7806a) != null && (str2 = this.f7807b) != null && (b2Var = this.f7811g) != null) {
            return new n0(str, str2, this.f7808c, this.d, this.f7809e, this.f7810f, b2Var, this.h, this.f7812i, this.f7813j, this.f7814k, this.f7815l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7806a == null) {
            sb2.append(" generator");
        }
        if (this.f7807b == null) {
            sb2.append(" identifier");
        }
        if ((this.f7816m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f7816m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f7811g == null) {
            sb2.append(" app");
        }
        if ((this.f7816m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
