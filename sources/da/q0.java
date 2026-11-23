package da;
public final class q0 {
    public int f8175a;
    public String f8176b;
    public int f8177c;
    public long d;
    public long f8178e;
    public boolean f8179f;
    public int f8180g;
    public String h;
    public String f8181i;
    public byte f8182j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8182j == 63 && (str = this.f8176b) != null && (str2 = this.h) != null && (str3 = this.f8181i) != null) {
            return new r0(this.f8175a, str, this.f8177c, this.d, this.f8178e, this.f8179f, this.f8180g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8182j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8176b == null) {
            sb2.append(" model");
        }
        if ((this.f8182j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8182j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8182j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8182j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8182j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8181i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
