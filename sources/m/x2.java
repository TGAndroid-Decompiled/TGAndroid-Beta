package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f16380a;
    public Method f16381b;
    public Method f16382c;

    public x2(Method method, Method method2, Method method3) {
        this.f16380a = method;
        this.f16381b = method2;
        this.f16382c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
