package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f17259a;
    public Method f17260b;
    public Method f17261c;

    public f(Method method, Method method2, Method method3) {
        this.f17259a = method;
        this.f17260b = method2;
        this.f17261c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
