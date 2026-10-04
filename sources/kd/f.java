package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f14752a;
    public Method f14753b;
    public Method f14754c;

    public f(Method method, Method method2, Method method3) {
        this.f14752a = method;
        this.f14753b = method2;
        this.f14754c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
