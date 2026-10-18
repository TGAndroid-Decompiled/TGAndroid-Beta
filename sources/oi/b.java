package oi;
public final class b {
    public static final b f17753c = new b(Float.POSITIVE_INFINITY);
    public final float f17754a;
    public final float f17755b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f17754a = Float.POSITIVE_INFINITY;
                this.f17755b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
