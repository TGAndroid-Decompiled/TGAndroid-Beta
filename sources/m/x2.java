package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f16386a;
    public Method f16387b;
    public Method f16388c;

    public x2(Method method, Method method2, Method method3) {
        this.f16386a = method;
        this.f16387b = method2;
        this.f16388c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
