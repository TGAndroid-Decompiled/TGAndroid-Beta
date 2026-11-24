package defpackage;
public final class f90 {
    public h90 a;
    public String b;
    public String c;
    public long d;
    public byte e;

    public final g90 a() {
        h90 h90Var;
        String str;
        String str2;
        if (this.e == 1 && (h90Var = this.a) != null && (str = this.b) != null && (str2 = this.c) != null) {
            return new g90(h90Var, str, str2, this.d);
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
        sc8.j(ir2.o("Missing required properties:", sb));
        return null;
    }
}
