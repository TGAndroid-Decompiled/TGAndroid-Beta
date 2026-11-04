package a7;
public abstract class h {
    public static ClassLoader f152a;
    public static Thread f153b;

    public static float a(float f10, float f11, float f12, float f13) {
        double d = f10 - f12;
        double d10 = f11 - f13;
        return (float) Math.sqrt((d10 * d10) + (d * d));
    }

    public static float b(int i3, int i10, int i11, int i12) {
        double d = i3 - i11;
        double d10 = i10 - i12;
        return (float) Math.sqrt((d10 * d10) + (d * d));
    }

    public static synchronized java.lang.ClassLoader c() {
        throw new UnsupportedOperationException("Method not decompiled: a7.h.c():java.lang.ClassLoader");
    }
}
