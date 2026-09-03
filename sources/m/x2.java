package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f13390a;
    public Method f13391b;
    public Method f13392c;

    public x2(Method method, Method method2, Method method3) {
        this.f13390a = method;
        this.f13391b = method2;
        this.f13392c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
