package da;
public final class f1 {
    public Double f7740a;
    public int f7741b;
    public boolean f7742c;
    public int d;
    public long f7743e;
    public long f7744f;
    public byte f7745g;

    public final g1 a() {
        if (this.f7745g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f7745g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f7745g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f7745g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f7745g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f7745g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f7740a, this.f7741b, this.f7742c, this.d, this.f7743e, this.f7744f);
    }
}
