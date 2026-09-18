package mi;
public final class b {
    public static final b f15019c = new b(Float.POSITIVE_INFINITY);
    public final float f15020a;
    public final float f15021b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f15020a = Float.POSITIVE_INFINITY;
                this.f15021b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
