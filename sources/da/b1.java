package da;
public final class b1 {
    public long f7976a;
    public String f7977b;
    public String f7978c;
    public long d;
    public int f7979e;
    public byte f7980f;

    public final c1 a() {
        String str;
        if (this.f7980f == 7 && (str = this.f7977b) != null) {
            return new c1(str, this.f7979e, this.f7978c, this.f7976a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7980f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7977b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7980f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7980f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
