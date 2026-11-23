package da;
public final class i1 {
    public k1 f8042a;
    public String f8043b;
    public String f8044c;
    public long d;
    public byte f8045e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f8045e == 1 && (k1Var = this.f8042a) != null && (str = this.f8043b) != null && (str2 = this.f8044c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8042a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f8043b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f8044c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f8045e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
