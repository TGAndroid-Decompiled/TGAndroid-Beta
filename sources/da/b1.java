package da;
public final class b1 {
    public long f7668a;
    public String f7669b;
    public String f7670c;
    public long d;
    public int f7671e;
    public byte f7672f;

    public final c1 a() {
        String str;
        if (this.f7672f == 7 && (str = this.f7669b) != null) {
            return new c1(str, this.f7671e, this.f7670c, this.f7668a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7672f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7669b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7672f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7672f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
