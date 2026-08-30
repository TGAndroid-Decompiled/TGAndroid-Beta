package j7;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
public abstract class b8 {
    public static Constructor f8954a;
    public static Method f8955b;
    public static Method f8956c;
    public static Constructor d;
    public static Method e;

    public static void a() {
        if (f8954a == null || f8955b == null || f8956c == null) {
            Class<?> cls = Class.forName("com.google.android.exoplayer2.effect.ScaleAndRotateTransformation$Builder");
            f8954a = cls.getConstructor(null);
            f8955b = cls.getMethod("setRotationDegrees", Float.TYPE);
            f8956c = cls.getMethod("build", null);
        }
        if (d != null && e != null) {
            return;
        }
        Class<?> cls2 = Class.forName("com.google.android.exoplayer2.effect.DefaultVideoFrameProcessor$Factory$Builder");
        d = cls2.getConstructor(null);
        e = cls2.getMethod("build", null);
    }
}
