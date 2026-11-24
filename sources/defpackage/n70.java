package defpackage;
public final class n70 {
    public short a;
    public short b;
    public float c;
    public long d;
    public long e;
    public long f;
    public float g;
    public int h;

    public final float a(long j) {
        long j2 = this.d;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f;
        if (j3 >= 0 && j >= j3) {
            float f = this.g;
            return (s56.b(((float) (j - j3)) / this.h, 0.0f, 1.0f) * f) + (1.0f - f);
        }
        return s56.b(((float) (j - j2)) / this.a, 0.0f, 1.0f) * 0.5f;
    }
}
