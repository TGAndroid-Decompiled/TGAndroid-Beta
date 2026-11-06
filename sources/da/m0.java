package da;

import java.util.List;
public final class m0 {
    public String f8419a;
    public String f8420b;
    public String f8421c;
    public long d;
    public Long f8422e;
    public boolean f8423f;
    public b2 f8424g;
    public s2 h;
    public r2 f8425i;
    public c2 f8426j;
    public List f8427k;
    public int f8428l;
    public byte f8429m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8429m == 7 && (str = this.f8419a) != null && (str2 = this.f8420b) != null && (b2Var = this.f8424g) != null) {
            return new n0(str, str2, this.f8421c, this.d, this.f8422e, this.f8423f, b2Var, this.h, this.f8425i, this.f8426j, this.f8427k, this.f8428l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8419a == null) {
            sb2.append(" generator");
        }
        if (this.f8420b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8429m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8429m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8424g == null) {
            sb2.append(" app");
        }
        if ((this.f8429m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
