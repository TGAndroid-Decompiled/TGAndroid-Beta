package da;
public final class s0 {
    public long f8205a;
    public String f8206b;
    public k2 f8207c;
    public l2 d;
    public m2 f8208e;
    public p2 f8209f;
    public byte f8210g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f8210g == 1 && (str = this.f8206b) != null && (k2Var = this.f8207c) != null && (l2Var = this.d) != null) {
            return new t0(this.f8205a, str, k2Var, l2Var, this.f8208e, this.f8209f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f8210g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f8206b == null) {
            sb2.append(" type");
        }
        if (this.f8207c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
