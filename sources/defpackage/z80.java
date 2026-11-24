package defpackage;
public final class z80 {
    public String a;
    public String b;
    public int c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;
    public l90 j;
    public g90 k;
    public d90 l;
    public byte m;

    public final a90 a() {
        if (this.m == 1 && this.a != null && this.b != null && this.d != null && this.h != null && this.i != null) {
            return new a90(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sdkVersion");
        }
        if (this.b == null) {
            sb.append(" gmpAppId");
        }
        if ((this.m & 1) == 0) {
            sb.append(" platform");
        }
        if (this.d == null) {
            sb.append(" installationUuid");
        }
        if (this.h == null) {
            sb.append(" buildVersion");
        }
        if (this.i == null) {
            sb.append(" displayVersion");
        }
        dq9.m(ts2.n("Missing required properties:", sb));
        return null;
    }
}
