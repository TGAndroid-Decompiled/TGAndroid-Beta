package li;
public final class b {
    public static final b f14126c = new b(Float.POSITIVE_INFINITY);
    public final float f14127a;
    public final float f14128b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f14127a = Float.POSITIVE_INFINITY;
                this.f14128b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
