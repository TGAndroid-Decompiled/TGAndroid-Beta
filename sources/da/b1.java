package da;
public final class b1 {
    public long f7979a;
    public String f7980b;
    public String f7981c;
    public long d;
    public int f7982e;
    public byte f7983f;

    public final c1 a() {
        String str;
        if (this.f7983f == 7 && (str = this.f7980b) != null) {
            return new c1(str, this.f7982e, this.f7981c, this.f7979a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7983f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7980b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7983f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7983f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
