package da;
public final class q0 {
    public int f8143a;
    public String f8144b;
    public int f8145c;
    public long d;
    public long f8146e;
    public boolean f8147f;
    public int f8148g;
    public String h;
    public String f8149i;
    public byte f8150j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8150j == 63 && (str = this.f8144b) != null && (str2 = this.h) != null && (str3 = this.f8149i) != null) {
            return new r0(this.f8143a, str, this.f8145c, this.d, this.f8146e, this.f8147f, this.f8148g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8150j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8144b == null) {
            sb2.append(" model");
        }
        if ((this.f8150j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8150j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8150j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8150j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8150j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8149i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
