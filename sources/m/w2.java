package m;

import android.os.Build;
import java.lang.reflect.Method;
public final class w2 {
    public Method f15282a;
    public Method f15283b;
    public Method f15284c;

    public w2(Method method, Method method2, Method method3) {
        this.f15282a = method;
        this.f15283b = method2;
        this.f15284c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
