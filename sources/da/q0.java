package da;
public final class q0 {
    public int f7861a;
    public String f7862b;
    public int f7863c;
    public long d;
    public long f7864e;
    public boolean f7865f;
    public int f7866g;
    public String h;
    public String f7867i;
    public byte f7868j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f7868j == 63 && (str = this.f7862b) != null && (str2 = this.h) != null && (str3 = this.f7867i) != null) {
            return new r0(this.f7861a, str, this.f7863c, this.d, this.f7864e, this.f7865f, this.f7866g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7868j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f7862b == null) {
            sb2.append(" model");
        }
        if ((this.f7868j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f7868j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f7868j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f7868j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f7868j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f7867i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
