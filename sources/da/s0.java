package da;
public final class s0 {
    public long f7894a;
    public String f7895b;
    public k2 f7896c;
    public l2 d;
    public m2 f7897e;
    public p2 f7898f;
    public byte f7899g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f7899g == 1 && (str = this.f7895b) != null && (k2Var = this.f7896c) != null && (l2Var = this.d) != null) {
            return new t0(this.f7894a, str, k2Var, l2Var, this.f7897e, this.f7898f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f7899g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f7895b == null) {
            sb2.append(" type");
        }
        if (this.f7896c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
