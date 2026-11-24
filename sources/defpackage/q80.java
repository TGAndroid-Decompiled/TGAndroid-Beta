package defpackage;
public final class q80 {
    public long a;
    public String b;
    public t80 c;
    public d90 d;
    public e90 e;
    public i90 f;
    public byte g;

    public final r80 a() {
        String str;
        t80 t80Var;
        d90 d90Var;
        if (this.g == 1 && (str = this.b) != null && (t80Var = this.c) != null && (d90Var = this.d) != null) {
            return new r80(this.a, str, t80Var, d90Var, this.e, this.f);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.g & 1) == 0) {
            sb.append(" timestamp");
        }
        if (this.b == null) {
            sb.append(" type");
        }
        if (this.c == null) {
            sb.append(" app");
        }
        if (this.d == null) {
            sb.append(" device");
        }
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }
}
