package da;
public final class s0 {
    public long f8170a;
    public String f8171b;
    public k2 f8172c;
    public l2 d;
    public m2 f8173e;
    public p2 f8174f;
    public byte f8175g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8175g == 1 && (str = this.f8171b) != null && (k2Var = this.f8172c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8170a, str, k2Var, l2Var, this.f8173e, this.f8174f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8175g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8171b == null) {
            sb2.append(" type");
        }
        if (this.f8172c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
