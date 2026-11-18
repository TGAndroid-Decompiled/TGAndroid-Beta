package da;
public final class q0 {
    public int f8146a;
    public String f8147b;
    public int f8148c;
    public long d;
    public long f8149e;
    public boolean f8150f;
    public int f8151g;
    public String h;
    public String f8152i;
    public byte f8153j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8153j == 63 && (str = this.f8147b) != null && (str2 = this.h) != null && (str3 = this.f8152i) != null) {
            return new r0(this.f8146a, str, this.f8148c, this.d, this.f8149e, this.f8150f, this.f8151g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8153j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8147b == null) {
            sb2.append(" model");
        }
        if ((this.f8153j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8153j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8153j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8153j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8153j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8152i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
