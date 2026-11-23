package da;
public final class f1 {
    public Double f8014a;
    public int f8015b;
    public boolean f8016c;
    public int d;
    public long f8017e;
    public long f8018f;
    public byte f8019g;

    public final g1 a() {
        if (this.f8019g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f8019g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f8019g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f8019g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f8019g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f8019g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(a8.p0.q("Missing required properties:", sb2));
        }
        return new g1(this.f8014a, this.f8015b, this.f8016c, this.d, this.f8017e, this.f8018f);
    }
}
