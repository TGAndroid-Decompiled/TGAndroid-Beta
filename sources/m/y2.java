package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class y2 {
    public Method f17152a;
    public Method f17153b;
    public Method f17154c;

    public y2(Method method, Method method2, Method method3) {
        this.f17152a = method;
        this.f17153b = method2;
        this.f17154c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
