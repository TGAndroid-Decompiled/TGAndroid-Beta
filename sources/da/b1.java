package da;
public final class b1 {
    public long f7665a;
    public String f7666b;
    public String f7667c;
    public long d;
    public int f7668e;
    public byte f7669f;

    public final c1 a() {
        String str;
        if (this.f7669f == 7 && (str = this.f7666b) != null) {
            return new c1(str, this.f7668e, this.f7667c, this.f7665a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7669f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7666b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7669f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7669f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
