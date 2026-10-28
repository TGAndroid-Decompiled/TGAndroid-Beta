package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class w2 {
    public Method f17895a;
    public Method f17896b;
    public Method f17897c;

    public w2(Method method, Method method2, Method method3) {
        this.f17895a = method;
        this.f17896b = method2;
        this.f17897c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
