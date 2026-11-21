package da;

import java.util.List;
public final class m0 {
    public String f8117a;
    public String f8118b;
    public String f8119c;
    public long d;
    public Long f8120e;
    public boolean f8121f;
    public b2 f8122g;
    public s2 h;
    public r2 f8123i;
    public c2 f8124j;
    public List f8125k;
    public int f8126l;
    public byte f8127m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8127m == 7 && (str = this.f8117a) != null && (str2 = this.f8118b) != null && (b2Var = this.f8122g) != null) {
            return new n0(str, str2, this.f8119c, this.d, this.f8120e, this.f8121f, b2Var, this.h, this.f8123i, this.f8124j, this.f8125k, this.f8126l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8117a == null) {
            sb2.append(" generator");
        }
        if (this.f8118b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8127m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8127m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8122g == null) {
            sb2.append(" app");
        }
        if ((this.f8127m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
