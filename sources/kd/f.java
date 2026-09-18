package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f13582a;
    public Method f13583b;
    public Method f13584c;

    public f(Method method, Method method2, Method method3) {
        this.f13582a = method;
        this.f13583b = method2;
        this.f13584c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
