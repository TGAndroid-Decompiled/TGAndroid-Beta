package defpackage;
public final class e90 {
    public Double a;
    public int b;
    public boolean c;
    public int d;
    public long e;
    public long f;
    public byte g;

    public final f90 a() {
        if (this.g != 31) {
            StringBuilder sb = new StringBuilder();
            if ((this.g & 1) == 0) {
                sb.append(" batteryVelocity");
            }
            if ((this.g & 2) == 0) {
                sb.append(" proximityOn");
            }
            if ((this.g & 4) == 0) {
                sb.append(" orientation");
            }
            if ((this.g & 8) == 0) {
                sb.append(" ramUsed");
            }
            if ((this.g & 16) == 0) {
                sb.append(" diskUsed");
            }
            grb.i(bs2.o("Missing required properties:", sb));
            return null;
        }
        return new f90(this.a, this.b, this.c, this.d, this.e, this.f);
    }
}
