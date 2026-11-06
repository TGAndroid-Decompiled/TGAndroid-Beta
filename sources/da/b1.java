package da;
public final class b1 {
    public long f8278a;
    public String f8279b;
    public String f8280c;
    public long d;
    public int f8281e;
    public byte f8282f;

    public final c1 a() {
        String str;
        if (this.f8282f == 7 && (str = this.f8279b) != null) {
            return new c1(str, this.f8281e, this.f8280c, this.f8278a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8282f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f8279b == null) {
            sb2.append(" symbol");
        }
        if ((this.f8282f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f8282f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
