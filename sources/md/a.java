package md;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
public abstract class a {
    public static final Method f16219a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i10 = 0;
        while (true) {
            method = null;
            if (i10 >= length) {
                break;
            }
            Method method2 = methods[i10];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (i.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i10++;
        }
        f16219a = method;
        int length2 = methods.length;
        for (int i11 = 0; i11 < length2 && !i.a(methods[i11].getName(), "getSuppressed"); i11++) {
        }
    }
}
