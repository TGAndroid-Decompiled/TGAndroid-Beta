package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class w2 {
    public Method f17896a;
    public Method f17897b;
    public Method f17898c;

    public w2(Method method, Method method2, Method method3) {
        this.f17896a = method;
        this.f17897b = method2;
        this.f17898c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
