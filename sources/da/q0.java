package da;
public final class q0 {
    public int f8472a;
    public String f8473b;
    public int f8474c;
    public long d;
    public long f8475e;
    public boolean f8476f;
    public int f8477g;
    public String h;
    public String f8478i;
    public byte f8479j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8479j == 63 && (str = this.f8473b) != null && (str2 = this.h) != null && (str3 = this.f8478i) != null) {
            return new r0(this.f8472a, str, this.f8474c, this.d, this.f8475e, this.f8476f, this.f8477g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8479j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8473b == null) {
            sb2.append(" model");
        }
        if ((this.f8479j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8479j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8479j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8479j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8479j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8478i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
