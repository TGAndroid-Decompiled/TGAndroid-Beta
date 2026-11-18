package da;
public final class f1 {
    public Double f8019a;
    public int f8020b;
    public boolean f8021c;
    public int d;
    public long f8022e;
    public long f8023f;
    public byte f8024g;

    public final g1 a() {
        if (this.f8024g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8024g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8024g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8024g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8024g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8024g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8019a, this.f8020b, this.f8021c, this.d, this.f8022e, this.f8023f);
    }
}
