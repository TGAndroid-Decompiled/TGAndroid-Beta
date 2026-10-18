package ge;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f11021a;

    static {
        try {
            Iterator it = Arrays.asList(new ce.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f11021a = yd.d.a(new yd.a(new yd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
