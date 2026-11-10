package da;
public final class s0 {
    public long f8510a;
    public String f8511b;
    public k2 f8512c;
    public l2 d;
    public m2 f8513e;
    public p2 f8514f;
    public byte f8515g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8515g == 1 && (str = this.f8511b) != null && (k2Var = this.f8512c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8510a, str, k2Var, l2Var, this.f8513e, this.f8514f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8515g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8511b == null) {
            sb2.append(" type");
        }
        if (this.f8512c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
