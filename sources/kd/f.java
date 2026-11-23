package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f18207a;
    public Method f18208b;
    public Method f18209c;

    public f(Method method, Method method2, Method method3) {
        this.f18207a = method;
        this.f18208b = method2;
        this.f18209c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
