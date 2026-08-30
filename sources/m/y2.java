package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class y2 {
    public Method f13696a;
    public Method f13697b;
    public Method f13698c;

    public y2(Method method, Method method2, Method method3) {
        this.f13696a = method;
        this.f13697b = method2;
        this.f13698c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
