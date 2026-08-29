package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class y2 {
    public Method f16749a;
    public Method f16750b;
    public Method f16751c;

    public y2(Method method, Method method2, Method method3) {
        this.f16749a = method;
        this.f16750b = method2;
        this.f16751c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
