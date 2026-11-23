package da;
public final class b1 {
    public long f7941a;
    public String f7942b;
    public String f7943c;
    public long d;
    public int f7944e;
    public byte f7945f;

    public final c1 a() {
        String str;
        if (this.f7945f == 7 && (str = this.f7942b) != null) {
            return new c1(str, this.f7944e, this.f7943c, this.f7941a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7945f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7942b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7945f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7945f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
