package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f13571a;
    public Method f13572b;
    public Method f13573c;

    public f(Method method, Method method2, Method method3) {
        this.f13571a = method;
        this.f13572b = method2;
        this.f13573c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
