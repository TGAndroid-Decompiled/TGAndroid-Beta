package da;
public final class i1 {
    public k1 f7766a;
    public String f7767b;
    public String f7768c;
    public long d;
    public byte f7769e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f7769e == 1 && (k1Var = this.f7766a) != null && (str = this.f7767b) != null && (str2 = this.f7768c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f7766a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f7767b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f7768c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f7769e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
