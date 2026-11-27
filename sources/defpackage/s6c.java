package defpackage;
public final class s6c {
    public static s6c d;
    public long a;
    public long b;
    public boolean c;

    public final void a(double d2, double d3, long j) {
        float f;
        float f2;
        double d4;
        double d5 = (0.01720197f * (((float) (j - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(f2 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f2) * 3.4906598739326E-4d) + (Math.sin(d5) * 0.03341960161924362d) + d5 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d5) * 0.0053d) + ((float) Math.round((f - 9.0E-4f) - d4)) + 9.0E-4f + ((-d3) / 360.0d);
        double asin = Math.asin(Math.sin(sin) * 0.3979486262630266d);
        double d6 = d2 * 0.01745329238474369d;
        double sin3 = ((-0.10452846616578243d) - (Math.sin(asin) * Math.sin(d6))) / (Math.cos(asin) * Math.cos(d6));
        if (sin3 >= 1.0d) {
            this.c = true;
            this.a = -1L;
            this.b = -1L;
        } else if (sin3 <= -1.0d) {
            this.c = false;
            this.a = -1L;
            this.b = -1L;
        } else {
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.b = round;
            if (round < j && this.a > j) {
                this.c = false;
            } else {
                this.c = true;
            }
        }
    }
}
