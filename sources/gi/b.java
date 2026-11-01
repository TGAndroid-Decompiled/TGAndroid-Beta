package gi;
public final class b {
    public static final b f7534c = new b(Float.POSITIVE_INFINITY);
    public final float f7535a;
    public final float f7536b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f7535a = Float.POSITIVE_INFINITY;
                this.f7536b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
