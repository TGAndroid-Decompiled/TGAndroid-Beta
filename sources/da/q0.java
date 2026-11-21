package da;
public final class q0 {
    public int f8172a;
    public String f8173b;
    public int f8174c;
    public long d;
    public long f8175e;
    public boolean f8176f;
    public int f8177g;
    public String h;
    public String f8178i;
    public byte f8179j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8179j == 63 && (str = this.f8173b) != null && (str2 = this.h) != null && (str3 = this.f8178i) != null) {
            return new r0(this.f8172a, str, this.f8174c, this.d, this.f8175e, this.f8176f, this.f8177g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8179j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8173b == null) {
            sb2.append(" model");
        }
        if ((this.f8179j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8179j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8179j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8179j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8179j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8178i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
