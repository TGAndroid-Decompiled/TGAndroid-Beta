package a8;
public abstract class r9 {
    public static float a(float f10, float f11, float f12, float f13) {
        double d = f10 - f12;
        double d2 = f11 - f13;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }

    public static float b(int i7, int i10, int i11, int i12) {
        double d = i7 - i11;
        double d2 = i10 - i12;
        return (float) Math.sqrt((d2 * d2) + (d * d));
    }
}
