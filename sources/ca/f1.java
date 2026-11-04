package ca;
public final class f1 {
    public Double f4376a;
    public int f4377b;
    public boolean f4378c;
    public int d;
    public long f4379e;
    public long f4380f;
    public byte f4381g;

    public final g1 a() {
        if (this.f4381g != 31) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.f4381g & 1) == 0) {
                sb2.append(" batteryVelocity");
            }
            if ((this.f4381g & 2) == 0) {
                sb2.append(" proximityOn");
            }
            if ((this.f4381g & 4) == 0) {
                sb2.append(" orientation");
            }
            if ((this.f4381g & 8) == 0) {
                sb2.append(" ramUsed");
            }
            if ((this.f4381g & 16) == 0) {
                sb2.append(" diskUsed");
            }
            throw new IllegalStateException(t4.c.g("Missing required properties:", sb2));
        }
        return new g1(this.f4376a, this.f4377b, this.f4378c, this.d, this.f4379e, this.f4380f);
    }
}
