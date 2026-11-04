package ca;

import java.util.List;
public final class m0 {
    public String f4445a;
    public String f4446b;
    public String f4447c;
    public long d;
    public Long f4448e;
    public boolean f4449f;
    public b2 f4450g;
    public s2 h;
    public r2 f4451i;
    public c2 f4452j;
    public List f4453k;
    public int f4454l;
    public byte f4455m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f4455m == 7 && (str = this.f4445a) != null && (str2 = this.f4446b) != null && (b2Var = this.f4450g) != null) {
            return new n0(str, str2, this.f4447c, this.d, this.f4448e, this.f4449f, b2Var, this.h, this.f4451i, this.f4452j, this.f4453k, this.f4454l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4445a == null) {
            sb2.append(" generator");
        }
        if (this.f4446b == null) {
            sb2.append(" identifier");
        }
        if ((this.f4455m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f4455m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f4450g == null) {
            sb2.append(" app");
        }
        if ((this.f4455m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
