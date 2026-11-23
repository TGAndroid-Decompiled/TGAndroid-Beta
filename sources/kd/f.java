package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f18244a;
    public Method f18245b;
    public Method f18246c;

    public f(Method method, Method method2, Method method3) {
        this.f18244a = method;
        this.f18245b = method2;
        this.f18246c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
