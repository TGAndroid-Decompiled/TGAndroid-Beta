package da;
public final class f1 {
    public Double f8051a;
    public int f8052b;
    public boolean f8053c;
    public int d;
    public long f8054e;
    public long f8055f;
    public byte f8056g;

    public final g1 a() {
        if (this.f8056g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8056g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8056g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8056g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8056g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8056g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8051a, this.f8052b, this.f8053c, this.d, this.f8054e, this.f8055f);
    }
}
