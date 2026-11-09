package da;

import java.util.List;
public final class m0 {
    public String f8417a;
    public String f8418b;
    public String f8419c;
    public long d;
    public Long f8420e;
    public boolean f8421f;
    public b2 f8422g;
    public s2 h;
    public r2 f8423i;
    public c2 f8424j;
    public List f8425k;
    public int f8426l;
    public byte f8427m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8427m == 7 && (str = this.f8417a) != null && (str2 = this.f8418b) != null && (b2Var = this.f8422g) != null) {
            return new n0(str, str2, this.f8419c, this.d, this.f8420e, this.f8421f, b2Var, this.h, this.f8423i, this.f8424j, this.f8425k, this.f8426l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8417a == null) {
            sb2.append(" generator");
        }
        if (this.f8418b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8427m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8427m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8422g == null) {
            sb2.append(" app");
        }
        if ((this.f8427m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
