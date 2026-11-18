package da;
public final class b1 {
    public long f7947a;
    public String f7948b;
    public String f7949c;
    public long d;
    public int f7950e;
    public byte f7951f;

    public final c1 a() {
        String str;
        if (this.f7951f == 7 && (str = this.f7948b) != null) {
            return new c1(str, this.f7950e, this.f7949c, this.f7947a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7951f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7948b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7951f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7951f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
