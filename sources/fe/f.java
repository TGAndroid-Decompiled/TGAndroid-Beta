package fe;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f9893a;

    static {
        try {
            Iterator it = Arrays.asList(new be.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f9893a = xd.d.a(new xd.a(new xd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
