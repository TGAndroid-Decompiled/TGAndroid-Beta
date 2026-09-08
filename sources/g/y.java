package g;
public final class y {
    public static y d;
    public long f10295a;
    public long f10296b;
    public int f10297c;

    public final void a(double d10, double d11, long j3) {
        float f7;
        float f10;
        double d12;
        double d13 = (0.01720197f * (((float) (j3 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f10 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f10) * 3.4906598739326E-4d) + (Math.sin(d13) * 0.03341960161924362d) + d13 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d13) * 0.0053d) + ((float) Math.round((f7 - 9.0E-4f) - d12)) + 9.0E-4f + ((-d11) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d14 = 0.01745329238474369d * d10;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d14))) / (Math.cos(asin) * Math.cos(d14));
        if (sin3 >= 1.0d) {
            this.f10297c = 1;
            this.f10295a = -1L;
            this.f10296b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f10297c = 0;
            this.f10295a = -1L;
            this.f10296b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f10295a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f10296b = round;
            if (round < j3 && this.f10295a > j3) {
                this.f10297c = 0;
            } else {
                this.f10297c = 1;
            }
        }
    }
}
