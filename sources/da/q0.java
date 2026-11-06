package da;
public final class q0 {
    public int f8474a;
    public String f8475b;
    public int f8476c;
    public long d;
    public long f8477e;
    public boolean f8478f;
    public int f8479g;
    public String h;
    public String f8480i;
    public byte f8481j;

    public final r0 a() {
        String str;
        String str2;
        String str3;
        if (this.f8481j == 63 && (str = this.f8475b) != null && (str2 = this.h) != null && (str3 = this.f8480i) != null) {
            return new r0(this.f8474a, str, this.f8476c, this.d, this.f8477e, this.f8478f, this.f8479g, str2, str3);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8481j & 1) == 0) {
            sb2.append(" arch");
        }
        if (this.f8475b == null) {
            sb2.append(" model");
        }
        if ((this.f8481j & 2) == 0) {
            sb2.append(" cores");
        }
        if ((this.f8481j & 4) == 0) {
            sb2.append(" ram");
        }
        if ((this.f8481j & 8) == 0) {
            sb2.append(" diskSpace");
        }
        if ((this.f8481j & 16) == 0) {
            sb2.append(" simulator");
        }
        if ((this.f8481j & 32) == 0) {
            sb2.append(" state");
        }
        if (this.h == null) {
            sb2.append(" manufacturer");
        }
        if (this.f8480i == null) {
            sb2.append(" modelClass");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
