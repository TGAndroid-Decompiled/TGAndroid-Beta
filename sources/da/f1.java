package da;
public final class f1 {
    public Double f8022a;
    public int f8023b;
    public boolean f8024c;
    public int d;
    public long f8025e;
    public long f8026f;
    public byte f8027g;

    public final g1 a() {
        if (this.f8027g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8027g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8027g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8027g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8027g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8027g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8022a, this.f8023b, this.f8024c, this.d, this.f8025e, this.f8026f);
    }
}
