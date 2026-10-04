package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f14753a;
    public Method f14754b;
    public Method f14755c;

    public f(Method method, Method method2, Method method3) {
        this.f14753a = method;
        this.f14754b = method2;
        this.f14755c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
