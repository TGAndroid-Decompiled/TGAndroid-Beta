package jd;

import java.lang.reflect.Method;
import kotlin.jvm.internal.j;
public abstract class a {
    public static final Method f16238a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        j.b(methods);
        int length = methods.length;
        int i3 = 0;
        while (true) {
            method = null;
            if (i3 >= length) {
                break;
            }
            Method method2 = methods[i3];
            if (j.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                j.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (j.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i3++;
        }
        f16238a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !j.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
