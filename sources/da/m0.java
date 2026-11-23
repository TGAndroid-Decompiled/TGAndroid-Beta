package da;

import java.util.List;
public final class m0 {
    public String f8120a;
    public String f8121b;
    public String f8122c;
    public long d;
    public Long f8123e;
    public boolean f8124f;
    public b2 f8125g;
    public s2 h;
    public r2 f8126i;
    public c2 f8127j;
    public List f8128k;
    public int f8129l;
    public byte f8130m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8130m == 7 && (str = this.f8120a) != null && (str2 = this.f8121b) != null && (b2Var = this.f8125g) != null) {
            return new n0(str, str2, this.f8122c, this.d, this.f8123e, this.f8124f, b2Var, this.h, this.f8126i, this.f8127j, this.f8128k, this.f8129l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8120a == null) {
            sb2.append(" generator");
        }
        if (this.f8121b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8130m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8130m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8125g == null) {
            sb2.append(" app");
        }
        if ((this.f8130m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
