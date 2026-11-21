package da;
public final class f1 {
    public Double f8048a;
    public int f8049b;
    public boolean f8050c;
    public int d;
    public long f8051e;
    public long f8052f;
    public byte f8053g;

    public final g1 a() {
        if (this.f8053g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8053g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8053g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8053g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8053g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8053g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8048a, this.f8049b, this.f8050c, this.d, this.f8051e, this.f8052f);
    }
}
