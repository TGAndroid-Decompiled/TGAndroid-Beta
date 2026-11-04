package ca;
public final class i1 {
    public k1 f4405a;
    public String f4406b;
    public String f4407c;
    public long d;
    public byte f4408e;

    public final j1 a() {
        k1 k1Var;
        String str;
        String str2;
        if (this.f4408e == 1 && (k1Var = this.f4405a) != null && (str = this.f4406b) != null && (str2 = this.f4407c) != null) {
            return new j1(k1Var, str, str2, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4405a == null) {
            sb2.append(" rolloutVariant");
        }
        if (this.f4406b == null) {
            sb2.append(" parameterKey");
        }
        if (this.f4407c == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f4408e) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
