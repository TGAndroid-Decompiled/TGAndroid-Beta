package ld;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f15499a;
    public Method f15500b;
    public Method f15501c;

    public f(Method method, Method method2, Method method3) {
        this.f15499a = method;
        this.f15500b = method2;
        this.f15501c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
