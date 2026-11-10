package g;
public final class y {
    public static y d;
    public long f13392a;
    public long f13393b;
    public int f13394c;

    public final void a(double d2, double d10, long j3) {
        float f10;
        float f11;
        double d11;
        double d12 = (0.01720197f * (((float) (j3 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((f10 - 9.0E-4f) - d11)) + 9.0E-4f + ((-d10) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d2;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f13394c = 1;
            this.f13392a = -1L;
            this.f13393b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f13394c = 0;
            this.f13392a = -1L;
            this.f13393b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f13392a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f13393b = round;
            if (round < j3 && this.f13392a > j3) {
                this.f13394c = 0;
            } else {
                this.f13394c = 1;
            }
        }
    }
}
