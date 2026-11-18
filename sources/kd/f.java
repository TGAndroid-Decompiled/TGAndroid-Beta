package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f18213a;
    public Method f18214b;
    public Method f18215c;

    public f(Method method, Method method2, Method method3) {
        this.f18213a = method;
        this.f18214b = method2;
        this.f18215c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
