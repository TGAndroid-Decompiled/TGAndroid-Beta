package da;
public final class f1 {
    public Double f8350a;
    public int f8351b;
    public boolean f8352c;
    public int d;
    public long f8353e;
    public long f8354f;
    public byte f8355g;

    public final g1 a() {
        if (this.f8355g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8355g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8355g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8355g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8355g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8355g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8350a, this.f8351b, this.f8352c, this.d, this.f8353e, this.f8354f);
    }
}
