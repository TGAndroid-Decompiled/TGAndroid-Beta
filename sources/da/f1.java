package da;
public final class f1 {
    public Double f7737a;
    public int f7738b;
    public boolean f7739c;
    public int d;
    public long f7740e;
    public long f7741f;
    public byte f7742g;

    public final g1 a() {
        if (this.f7742g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f7742g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f7742g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f7742g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f7742g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f7742g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f7737a, this.f7738b, this.f7739c, this.d, this.f7740e, this.f7741f);
    }
}
