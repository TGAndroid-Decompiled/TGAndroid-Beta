package mi;
public final class b {
    public static final b f15073c = new b(Float.POSITIVE_INFINITY);
    public final float f15074a;
    public final float f15075b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f15074a = Float.POSITIVE_INFINITY;
                this.f15075b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
