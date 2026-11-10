package da;

import java.util.List;
public final class m0 {
    public String f8422a;
    public String f8423b;
    public String f8424c;
    public long d;
    public Long f8425e;
    public boolean f8426f;
    public b2 f8427g;
    public s2 h;
    public r2 f8428i;
    public c2 f8429j;
    public List f8430k;
    public int f8431l;
    public byte f8432m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8432m == 7 && (str = this.f8422a) != null && (str2 = this.f8423b) != null && (b2Var = this.f8427g) != null) {
            return new n0(str, str2, this.f8424c, this.d, this.f8425e, this.f8426f, b2Var, this.h, this.f8428i, this.f8429j, this.f8430k, this.f8431l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8422a == null) {
            sb2.append(" generator");
        }
        if (this.f8423b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8432m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8432m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8427g == null) {
            sb2.append(" app");
        }
        if ((this.f8432m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
