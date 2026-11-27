package defpackage;
public final class gz4 {
    public static final gz4 b = new gz4(Float.POSITIVE_INFINITY);
    public final float a;

    public gz4(float f) {
        if (!Float.isNaN(f) && f >= 0.0f) {
            this.a = f;
        } else {
            lq5.j("epsY must be >= 0");
            throw null;
        }
    }
}
