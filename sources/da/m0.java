package da;

import java.util.List;
public final class m0 {
    public String f7809a;
    public String f7810b;
    public String f7811c;
    public long d;
    public Long f7812e;
    public boolean f7813f;
    public b2 f7814g;
    public s2 h;
    public r2 f7815i;
    public c2 f7816j;
    public List f7817k;
    public int f7818l;
    public byte f7819m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f7819m == 7 && (str = this.f7809a) != null && (str2 = this.f7810b) != null && (b2Var = this.f7814g) != null) {
            return new n0(str, str2, this.f7811c, this.d, this.f7812e, this.f7813f, b2Var, this.h, this.f7815i, this.f7816j, this.f7817k, this.f7818l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7809a == null) {
            sb2.append(" generator");
        }
        if (this.f7810b == null) {
            sb2.append(" identifier");
        }
        if ((this.f7819m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f7819m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f7814g == null) {
            sb2.append(" app");
        }
        if ((this.f7819m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
