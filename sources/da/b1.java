package da;
public final class b1 {
    public long f7942a;
    public String f7943b;
    public String f7944c;
    public long d;
    public int f7945e;
    public byte f7946f;

    public final c1 a() {
        String str;
        if (this.f7946f == 7 && (str = this.f7943b) != null) {
            return new c1(str, this.f7945e, this.f7944c, this.f7942a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7946f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7943b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7946f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7946f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
