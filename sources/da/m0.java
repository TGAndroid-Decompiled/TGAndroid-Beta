package da;

import java.util.List;
public final class m0 {
    public String f8088a;
    public String f8089b;
    public String f8090c;
    public long d;
    public Long f8091e;
    public boolean f8092f;
    public b2 f8093g;
    public s2 h;
    public r2 f8094i;
    public c2 f8095j;
    public List f8096k;
    public int f8097l;
    public byte f8098m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8098m == 7 && (str = this.f8088a) != null && (str2 = this.f8089b) != null && (b2Var = this.f8093g) != null) {
            return new n0(str, str2, this.f8090c, this.d, this.f8091e, this.f8092f, b2Var, this.h, this.f8094i, this.f8095j, this.f8096k, this.f8097l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8088a == null) {
            sb2.append(" generator");
        }
        if (this.f8089b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8098m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8098m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8093g == null) {
            sb2.append(" app");
        }
        if ((this.f8098m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
