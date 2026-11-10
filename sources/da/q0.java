package da;
public final class q0 {
    public int f8477a;
    public String f8478b;
    public int f8479c;
    public long d;
    public long f8480e;
    public boolean f8481f;
    public int f8482g;
    public String h;
    public String f8483i;
    public byte f8484j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8484j == 63 && (str = this.f8478b) != null && (str2 = this.h) != null && (str3 = this.f8483i) != null) {
            return new r0(this.f8477a, str, this.f8479c, this.d, this.f8480e, this.f8481f, this.f8482g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8484j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8478b == null) {
            sb2.append(" model");
        }
        if ((this.f8484j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8484j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8484j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8484j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8484j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8483i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
