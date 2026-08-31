package j7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public abstract class c8 {
    public static Constructor f9569a;
    public static Method f9570b;
    public static Method f9571c;
    public static Constructor d;
    public static Method f9572e;

    public static void a() {
        if (f9569a == null || f9570b == null || f9571c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f9569a = cls.getConstructor(null);
            f9570b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f9571c = cls.getMethod("build", null);
        }
        if (d != null && f9572e != null) {
            return;
        }
        Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
        d = cls2.getConstructor(null);
        f9572e = cls2.getMethod("build", null);
    }
}
