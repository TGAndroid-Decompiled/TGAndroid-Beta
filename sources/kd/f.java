package kd;

import android.os.Build;
import java.lang.reflect.Method;
public final class f {
    public Method f13584a;
    public Method f13585b;
    public Method f13586c;

    public f(Method method, Method method2, Method method3) {
        this.f13584a = method;
        this.f13585b = method2;
        this.f13586c = method3;
    }

    public static void a() {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
    }
}
