package ca;
public final class b1 {
    public long f4304a;
    public String f4305b;
    public String f4306c;
    public long d;
    public int f4307e;
    public byte f4308f;

    public final c1 a() {
        String str;
        if (this.f4308f == 7 && (str = this.f4305b) != null) {
            return new c1(str, this.f4307e, this.f4306c, this.f4304a, this.d);
        }
        StringBuilder sb2 = new StringBuilder();
        if ((this.f4308f & 1) == 0) {
            sb2.append(" pc");
        }
        if (this.f4305b == null) {
            sb2.append(" symbol");
        }
        if ((this.f4308f & 2) == 0) {
            sb2.append(" offset");
        }
        if ((this.f4308f & 4) == 0) {
            sb2.append(" importance");
        }
        throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
    }
}
