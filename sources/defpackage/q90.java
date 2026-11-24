package defpackage;
public final class q90 {
    public long a;
    public String b;
    public t90 c;
    public da0 d;
    public ea0 e;
    public ia0 f;
    public byte g;

    public final r90 a() {
        String str;
        t90 t90Var;
        da0 da0Var;
        if (this.g == 1 && (str = this.b) != null && (t90Var = this.c) != null && (da0Var = this.d) != null) {
            return new r90(this.a, str, t90Var, da0Var, this.e, this.f);
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
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }
}
