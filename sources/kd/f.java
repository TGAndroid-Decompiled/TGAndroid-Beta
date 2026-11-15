package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f17818a;
    public Method f17819b;
    public Method f17820c;

    public f(Method method, Method method2, Method method3) {
        this.f17818a = method;
        this.f17819b = method2;
        this.f17820c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
