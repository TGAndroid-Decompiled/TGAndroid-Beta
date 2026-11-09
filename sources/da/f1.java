package da;
public final class f1 {
    public Double f8348a;
    public int f8349b;
    public boolean f8350c;
    public int d;
    public long f8351e;
    public long f8352f;
    public byte f8353g;

    public final g1 a() {
        if (this.f8353g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8353g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8353g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8353g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8353g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8353g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8348a, this.f8349b, this.f8350c, this.d, this.f8351e, this.f8352f);
    }
}
