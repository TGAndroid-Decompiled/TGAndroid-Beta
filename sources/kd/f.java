package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f12425a;
    public Method f12426b;
    public Method f12427c;

    public f(Method method, Method method2, Method method3) {
        this.f12425a = method;
        this.f12426b = method2;
        this.f12427c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
