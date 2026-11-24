package defpackage;
public final class fa0 {
    public ha0 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final ga0 a() {
        ha0 ha0Var;
        String str;
        String str2;
        if (this.e == 1 && (ha0Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new ga0(ha0Var, str, str2, this.d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" rolloutVariant");
        }
        if (this.b == null) {
            sb.append(" parameterKey");
        }
        if (this.c == null) {
            sb.append(" parameterValue");
        }
        if ((this.e & 1) == 0) {
            sb.append(" templateVersion");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }
}
