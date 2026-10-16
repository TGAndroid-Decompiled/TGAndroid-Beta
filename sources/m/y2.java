package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class y2 {
    public Method f15035a;
    public Method f15036b;
    public Method f15037c;

    public y2(Method method, Method method2, Method method3) {
        this.f15035a = method;
        this.f15036b = method2;
        this.f15037c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
