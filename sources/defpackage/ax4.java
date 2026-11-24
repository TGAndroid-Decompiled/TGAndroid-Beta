package defpackage;
public final class ax4 {
    public static final ax4 b = new ax4(Float.POSITIVE_INFINITY);
    public final float a;

    public ax4(float f) {
        if (!Float.isNaN(f) && f >= 0.0f) {
            this.a = f;
        } else {
            w26.j("epsY must be >= 0");
            throw null;
        }
    }
}
