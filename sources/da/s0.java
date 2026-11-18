package da;
public final class s0 {
    public long f8176a;
    public String f8177b;
    public k2 f8178c;
    public l2 d;
    public m2 f8179e;
    public p2 f8180f;
    public byte f8181g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8181g == 1 && (str = this.f8177b) != null && (k2Var = this.f8178c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8176a, str, k2Var, l2Var, this.f8179e, this.f8180f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8181g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8177b == null) {
            sb2.append(" type");
        }
        if (this.f8178c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
