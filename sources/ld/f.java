package ld;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f15495a;
    public Method f15496b;
    public Method f15497c;

    public f(Method method, Method method2, Method method3) {
        this.f15495a = method;
        this.f15496b = method2;
        this.f15497c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
