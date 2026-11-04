package ca;
public final class s0 {
    public long f4533a;
    public String f4534b;
    public k2 f4535c;
    public l2 d;
    public m2 f4536e;
    public p2 f4537f;
    public byte f4538g;

    public final t0 a() {
        String str;
        k2 k2Var;
        l2 l2Var;
        if (this.f4538g == 1 && (str = this.f4534b) != null && (k2Var = this.f4535c) != null && (l2Var = this.d) != null) {
            return new t0(this.f4533a, str, k2Var, l2Var, this.f4536e, this.f4537f);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((1 & this.f4538g) == 0) {
            sb2.append(" timestamp");
        }
        if (this.f4534b == null) {
            sb2.append(" type");
        }
        if (this.f4535c == null) {
            sb2.append(" app");
        }
        if (this.d == null) {
            sb2.append(" device");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
