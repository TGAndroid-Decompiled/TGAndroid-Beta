package defpackage;
public final class s80 {
    public long a;
    public String b;
    public v80 c;
    public f90 d;
    public g90 e;
    public k90 f;
    public byte g;

    public final t80 a() {
        String str;
        v80 v80Var;
        f90 f90Var;
        if (this.g == 1 && (str = this.b) != null && (v80Var = this.c) != null && (f90Var = this.d) != null) {
            return new t80(this.a, str, v80Var, f90Var, this.e, this.f);
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
        grb.i(bs2.o("Missing required properties:", sb));
        return null;
    }
}
