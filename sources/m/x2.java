package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class x2 {
    public Method f13388a;
    public Method f13389b;
    public Method f13390c;

    public x2(Method method, Method method2, Method method3) {
        this.f13388a = method;
        this.f13389b = method2;
        this.f13390c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
