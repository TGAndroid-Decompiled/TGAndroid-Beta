package ld;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f15534a;
    public Method f15535b;
    public Method f15536c;

    public f(Method method, Method method2, Method method3) {
        this.f15534a = method;
        this.f15535b = method2;
        this.f15536c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
