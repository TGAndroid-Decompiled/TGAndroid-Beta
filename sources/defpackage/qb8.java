package defpackage;

import java.lang.reflect.Method;
public abstract class qb8 {
    public static final Method a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        methods.getClass();
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (rp5.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                parameterTypes.getClass();
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (rp5.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        a = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !rp5.a(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
