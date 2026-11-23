package da;

import java.util.List;
public final class m0 {
    public String f8082a;
    public String f8083b;
    public String f8084c;
    public long d;
    public Long f8085e;
    public boolean f8086f;
    public b2 f8087g;
    public s2 h;
    public r2 f8088i;
    public c2 f8089j;
    public List f8090k;
    public int f8091l;
    public byte f8092m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8092m == 7 && (str = this.f8082a) != null && (str2 = this.f8083b) != null && (b2Var = this.f8087g) != null) {
            return new n0(str, str2, this.f8084c, this.d, this.f8085e, this.f8086f, b2Var, this.h, this.f8088i, this.f8089j, this.f8090k, this.f8091l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8082a == null) {
            sb2.append(" generator");
        }
        if (this.f8083b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8092m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8092m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8087g == null) {
            sb2.append(" app");
        }
        if ((this.f8092m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
