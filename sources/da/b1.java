package da;
public final class b1 {
    public long f7950a;
    public String f7951b;
    public String f7952c;
    public long d;
    public int f7953e;
    public byte f7954f;

    public final c1 a() {
        String str;
        if (this.f7954f == 7 && (str = this.f7951b) != null) {
            return new c1(str, this.f7953e, this.f7952c, this.f7950a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f7954f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f7951b == null) {
            sb2.append(" symbol");
        }
        if ((this.f7954f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f7954f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
    }
}
