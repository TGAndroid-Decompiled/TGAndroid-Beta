package da;
public final class q0 {
    public int f8138a;
    public String f8139b;
    public int f8140c;
    public long d;
    public long f8141e;
    public boolean f8142f;
    public int f8143g;
    public String h;
    public String f8144i;
    public byte f8145j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8145j == 63 && (str = this.f8139b) != null && (str2 = this.h) != null && (str3 = this.f8144i) != null) {
            return new r0(this.f8138a, str, this.f8140c, this.d, this.f8141e, this.f8142f, this.f8143g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8145j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8139b == null) {
            sb2.append(" model");
        }
        if ((this.f8145j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8145j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8145j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8145j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8145j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8144i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
