package li;
public final class b {
    public static final b f14138c = new b(Float.POSITIVE_INFINITY);
    public final float f14139a;
    public final float f14140b;

    public b(float f7) {
        if (!Float.isNaN(Float.POSITIVE_INFINITY)) {
            if (!Float.isNaN(f7) && f7 >= 0.0f) {
                this.f14139a = Float.POSITIVE_INFINITY;
                this.f14140b = f7;
                return;
            }
            throw new IllegalArgumentException("epsY must be >= 0");
        }
        throw new IllegalArgumentException("epsX must be >= 0");
    }
}
