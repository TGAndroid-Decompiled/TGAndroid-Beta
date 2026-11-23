package da;
public final class f1 {
    public Double f8013a;
    public int f8014b;
    public boolean f8015c;
    public int d;
    public long f8016e;
    public long f8017f;
    public byte f8018g;

    public final g1 a() {
        if (this.f8018g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8018g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8018g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8018g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8018g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8018g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8013a, this.f8014b, this.f8015c, this.d, this.f8016e, this.f8017f);
    }
}
