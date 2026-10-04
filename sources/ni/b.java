package ni;
public final class b {
    public static final b f16910c = new b(Float.POSITIVE_INFINITY);
    public final float f16911a;
    public final float f16912b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f16911a = Float.POSITIVE_INFINITY;
                this.f16912b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
