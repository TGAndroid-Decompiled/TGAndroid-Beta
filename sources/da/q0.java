package da;
public final class q0 {
    public int f8137a;
    public String f8138b;
    public int f8139c;
    public long d;
    public long f8140e;
    public boolean f8141f;
    public int f8142g;
    public String h;
    public String f8143i;
    public byte f8144j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8144j == 63 && (str = this.f8138b) != null && (str2 = this.h) != null && (str3 = this.f8143i) != null) {
            return new r0(this.f8137a, str, this.f8139c, this.d, this.f8140e, this.f8141f, this.f8142g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8144j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8138b == null) {
            sb2.append(" model");
        }
        if ((this.f8144j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8144j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8144j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8144j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8144j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8143i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
