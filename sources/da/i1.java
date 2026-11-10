package da;
public final class i1 {
    public k1 f8382a;
    public String f8383b;
    public String f8384c;
    public long d;
    public byte f8385e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f8385e == 1 && (k1Var = this.f8382a) != null && (str = this.f8383b) != null && (str2 = this.f8384c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8382a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f8383b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f8384c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f8385e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
