package da;
public final class s0 {
    public long f8507a;
    public String f8508b;
    public k2 f8509c;
    public l2 d;
    public m2 f8510e;
    public p2 f8511f;
    public byte f8512g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8512g == 1 && (str = this.f8508b) != null && (k2Var = this.f8509c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8507a, str, k2Var, l2Var, this.f8510e, this.f8511f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8512g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8508b == null) {
            sb2.append(" type");
        }
        if (this.f8509c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
