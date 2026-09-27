package ni;
public final class b {
    public static final b f15503c = new b(Float.POSITIVE_INFINITY);
    public final float f15504a;
    public final float f15505b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f15504a = Float.POSITIVE_INFINITY;
                this.f15505b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
