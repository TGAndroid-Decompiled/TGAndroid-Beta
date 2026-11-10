package da;
public final class b1 {
    public long f8281a;
    public String f8282b;
    public String f8283c;
    public long d;
    public int f8284e;
    public byte f8285f;

    public final c1 a() {
        String str;
        if (this.f8285f == 7 && (str = this.f8282b) != null) {
            return new c1(str, this.f8284e, this.f8283c, this.f8281a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8285f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f8282b == null) {
            sb2.append(" symbol");
        }
        if ((this.f8285f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f8285f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
