package da;
public final class s0 {
    public long f8179a;
    public String f8180b;
    public k2 f8181c;
    public l2 d;
    public m2 f8182e;
    public p2 f8183f;
    public byte f8184g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8184g == 1 && (str = this.f8180b) != null && (k2Var = this.f8181c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8179a, str, k2Var, l2Var, this.f8182e, this.f8183f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8184g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8180b == null) {
            sb2.append(" type");
        }
        if (this.f8181c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
