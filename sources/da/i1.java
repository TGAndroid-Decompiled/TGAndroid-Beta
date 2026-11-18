package da;
public final class i1 {
    public k1 f8051a;
    public String f8052b;
    public String f8053c;
    public long d;
    public byte f8054e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f8054e == 1 && (k1Var = this.f8051a) != null && (str = this.f8052b) != null && (str2 = this.f8053c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f8051a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f8052b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f8053c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f8054e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
