package hd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f14392a;
    public Method f14393b;
    public Method f14394c;

    public f(Method method, Method method2, Method method3) {
        this.f14392a = method;
        this.f14393b = method2;
        this.f14394c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
