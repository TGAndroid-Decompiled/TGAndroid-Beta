package da;
public final class s0 {
    public long f8171a;
    public String f8172b;
    public k2 f8173c;
    public l2 d;
    public m2 f8174e;
    public p2 f8175f;
    public byte f8176g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8176g == 1 && (str = this.f8172b) != null && (k2Var = this.f8173c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8171a, str, k2Var, l2Var, this.f8174e, this.f8175f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8176g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8172b == null) {
            sb2.append(" type");
        }
        if (this.f8173c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
