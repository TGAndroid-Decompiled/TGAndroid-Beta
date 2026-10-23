package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f16449a;
    public Method f16450b;
    public Method f16451c;

    public x2(Method method, Method method2, Method method3) {
        this.f16449a = method;
        this.f16450b = method2;
        this.f16451c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
