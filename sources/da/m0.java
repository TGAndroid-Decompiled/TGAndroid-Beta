package da;

import java.util.List;
public final class m0 {
    public String f8091a;
    public String f8092b;
    public String f8093c;
    public long d;
    public Long f8094e;
    public boolean f8095f;
    public b2 f8096g;
    public s2 h;
    public r2 f8097i;
    public c2 f8098j;
    public List f8099k;
    public int f8100l;
    public byte f8101m;

    public final n0 a() {
        String str;
        String str2;
        b2 b2Var;
        if (this.f8101m == 7 && (str = this.f8091a) != null && (str2 = this.f8092b) != null && (b2Var = this.f8096g) != null) {
            return new n0(str, str2, this.f8093c, this.d, this.f8094e, this.f8095f, b2Var, this.h, this.f8097i, this.f8098j, this.f8099k, this.f8100l);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8091a == null) {
            sb2.append(" generator");
        }
        if (this.f8092b == null) {
            sb2.append(" identifier");
        }
        if ((this.f8101m & 1) == 0) {
            sb2.append(" startedAt");
        }
        if ((this.f8101m & 2) == 0) {
            sb2.append(" crashed");
        }
        if (this.f8096g == null) {
            sb2.append(" app");
        }
        if ((this.f8101m & 4) == 0) {
            sb2.append(" generatorType");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
