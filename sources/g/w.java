package g;
public final class w {
    public static w d;
    public long f7042a;
    public long f7043b;
    public int f7044c;

    public final void a(double d9, double d10, long j10) {
        float f10;
        float f11;
        double d11;
        double d12 = (0.01720197f * (((float) (j10 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f11 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f11) * 3.4906598739326E-4d) + (Math.sin(d12) * 0.03341960161924362d) + d12 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d12) * 0.0053d) + ((float) Math.round((f10 - 9.0E-4f) - d11)) + 9.0E-4f + ((-d10) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d13 = 0.01745329238474369d * d9;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d13))) / (Math.cos(asin) * Math.cos(d13));
        if (sin3 >= 1.0d) {
            this.f7044c = 1;
            this.f7042a = -1L;
            this.f7043b = -1L;
        } else if (sin3 <= -1.0d) {
            this.f7044c = 0;
            this.f7042a = -1L;
            this.f7043b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f7042a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f7043b = round;
            if (round < j10 && this.f7042a > j10) {
                this.f7044c = 0;
            } else {
                this.f7044c = 1;
            }
        }
    }
}
