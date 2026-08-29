package od;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f19511a;

    static {
        try {
            Iterator it = Arrays.asList(new kd.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f19511a = gd.d.a(new gd.a(new gd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
