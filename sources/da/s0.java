package da;
public final class s0 {
    public long f8505a;
    public String f8506b;
    public k2 f8507c;
    public l2 d;
    public m2 f8508e;
    public p2 f8509f;
    public byte f8510g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8510g == 1 && (str = this.f8506b) != null && (k2Var = this.f8507c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8505a, str, k2Var, l2Var, this.f8508e, this.f8509f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8510g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8506b == null) {
            sb2.append(" type");
        }
        if (this.f8507c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
