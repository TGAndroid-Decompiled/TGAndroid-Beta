package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public abstract class PlatformImplementations$ReflectThrowable {
    public static final Method addSuppressed;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        Intrinsics.checkNotNull(methods);
        int length = methods.length;
        int i = 0;
        while (true) {
            method = null;
            if (i >= length) {
                break;
            }
            Method method2 = methods[i];
            if (Intrinsics.areEqual(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
                if (Intrinsics.areEqual(parameterTypes.length == 1 ? parameterTypes[0] : null, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i++;
        }
        addSuppressed = method;
        int length2 = methods.length;
        for (int i2 = 0; i2 < length2 && !Intrinsics.areEqual(methods[i2].getName(), "getSuppressed"); i2++) {
        }
    }
}
