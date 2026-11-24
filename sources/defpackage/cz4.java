package defpackage;
public final class cz4 {
    public static final cz4 b = new cz4(Float.POSITIVE_INFINITY);
    public final float a;

    public cz4(float f) {
        if (!Float.isNaN(f) && f >= 0.0f) {
            this.a = f;
        } else {
            u36.j("epsY must be >= 0");
            throw null;
        }
    }
}
