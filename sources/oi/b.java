package oi;
public final class b {
    public static final b f17756c = new b(Float.POSITIVE_INFINITY);
    public final float f17757a;
    public final float f17758b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f17757a = Float.POSITIVE_INFINITY;
                this.f17758b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
