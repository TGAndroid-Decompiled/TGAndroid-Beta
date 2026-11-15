package da;
public final class s0 {
    public long f7897a;
    public String f7898b;
    public k2 f7899c;
    public l2 d;
    public m2 f7900e;
    public p2 f7901f;
    public byte f7902g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f7902g == 1 && (str = this.f7898b) != null && (k2Var = this.f7899c) != null && (l2Var = this.d) != null) {
            return new t0(this.f7897a, str, k2Var, l2Var, this.f7900e, this.f7901f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f7902g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f7898b == null) {
            sb2.append(" type");
        }
        if (this.f7899c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
