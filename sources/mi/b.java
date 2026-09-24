package mi;
public final class b {
    public static final b f15047c = new b(Float.POSITIVE_INFINITY);
    public final float f15048a;
    public final float f15049b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f15048a = Float.POSITIVE_INFINITY;
                this.f15049b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
