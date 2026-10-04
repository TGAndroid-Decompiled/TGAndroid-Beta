package ni;
public final class b {
    public static final b f16911c = new b(Float.POSITIVE_INFINITY);
    public final float f16912a;
    public final float f16913b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f16912a = Float.POSITIVE_INFINITY;
                this.f16913b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
