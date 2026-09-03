package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class y2 {
    public Method f13680a;
    public Method f13681b;
    public Method f13682c;

    public y2(Method method, Method method2, Method method3) {
        this.f13680a = method;
        this.f13681b = method2;
        this.f13682c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
