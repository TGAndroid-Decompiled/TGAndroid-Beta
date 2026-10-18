package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f16385a;
    public Method f16386b;
    public Method f16387c;

    public x2(Method method, Method method2, Method method3) {
        this.f16385a = method;
        this.f16386b = method2;
        this.f16387c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
