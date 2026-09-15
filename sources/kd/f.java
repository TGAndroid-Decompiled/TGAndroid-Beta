package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f13581a;
    public Method f13582b;
    public Method f13583c;

    public f(Method method, Method method2, Method method3) {
        this.f13581a = method;
        this.f13582b = method2;
        this.f13583c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
