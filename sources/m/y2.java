package m;

import android.os.Build;
import java.lang.reflect.Method;

public final class y2 {

    public Method f17527a;

    public Method f17528b;

    public Method f17529c;

    public y2(Method method, Method method2, Method method3) {
        this.f17527a = method;
        this.f17528b = method2;
        this.f17529c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT >= 29) {
            throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
        }
    }
}
