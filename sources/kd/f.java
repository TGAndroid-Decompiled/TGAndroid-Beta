package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f17256a;
    public Method f17257b;
    public Method f17258c;

    public f(Method method, Method method2, Method method3) {
        this.f17256a = method;
        this.f17257b = method2;
        this.f17258c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
