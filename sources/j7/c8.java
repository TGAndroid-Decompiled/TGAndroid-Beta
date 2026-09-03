package j7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public abstract class c8 {
    public static Constructor f8942a;
    public static Method f8943b;
    public static Method f8944c;
    public static Constructor d;
    public static Method e;

    public static void a() {
        if (f8942a == null || f8943b == null || f8944c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f8942a = cls.getConstructor(null);
            f8943b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8944c = cls.getMethod("build", null);
        }
        if (d != null && e != null) {
            return;
        }
        Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
        d = cls2.getConstructor(null);
        e = cls2.getMethod("build", null);
    }
}
