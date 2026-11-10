package da;
public final class f1 {
    public Double f8353a;
    public int f8354b;
    public boolean f8355c;
    public int d;
    public long f8356e;
    public long f8357f;
    public byte f8358g;

    public final g1 a() {
        if (this.f8358g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8358g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8358g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8358g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8358g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8358g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8353a, this.f8354b, this.f8355c, this.d, this.f8356e, this.f8357f);
    }
}
