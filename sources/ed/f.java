package ed;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f6483a;
    public Method f6484b;
    public Method f6485c;

    public f(Method method, Method method2, Method method3) {
        this.f6483a = method;
        this.f6484b = method2;
        this.f6485c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
