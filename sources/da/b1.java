package da;
public final class b1 {
    public long f8276a;
    public String f8277b;
    public String f8278c;
    public long d;
    public int f8279e;
    public byte f8280f;

    public final c1 a() {
        String str;
        if (this.f8280f == 7 && (str = this.f8277b) != null) {
            return new c1(str, this.f8279e, this.f8278c, this.f8276a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f8280f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f8277b == null) {
            sb2.append(" symbol");
        }
        if ((this.f8280f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f8280f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
