package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f18306a;
    public Method f18307b;
    public Method f18308c;

    public f(Method method, Method method2, Method method3) {
        this.f18306a = method;
        this.f18307b = method2;
        this.f18308c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
