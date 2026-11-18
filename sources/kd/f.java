package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f18210a;
    public Method f18211b;
    public Method f18212c;

    public f(Method method, Method method2, Method method3) {
        this.f18210a = method;
        this.f18211b = method2;
        this.f18212c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
