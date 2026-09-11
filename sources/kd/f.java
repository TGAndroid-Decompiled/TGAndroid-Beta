package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f14894a;
    public Method f14895b;
    public Method f14896c;

    public f(Method method, Method method2, Method method3) {
        this.f14894a = method;
        this.f14895b = method2;
        this.f14896c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
