package da;

import java.util.List;
public final class m0 {
    public String f8083a;
    public String f8084b;
    public String f8085c;
    public long d;
    public Long f8086e;
    public boolean f8087f;
    public b2 f8088g;
    public s2 h;
    public r2 f8089i;
    public c2 f8090j;
    public List f8091k;
    public int f8092l;
    public byte f8093m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8093m == 7 && (str = this.f8083a) != null && (str2 = this.f8084b) != null && (b2Var = this.f8088g) != null) {
            return new n0(str, str2, this.f8085c, this.d, this.f8086e, this.f8087f, b2Var, this.h, this.f8089i, this.f8090j, this.f8091k, this.f8092l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8083a == null) {
            sb2.append(" generator");
        }
        if (this.f8084b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8093m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8093m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8088g == null) {
            sb2.append(" app");
        }
        if ((this.f8093m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
