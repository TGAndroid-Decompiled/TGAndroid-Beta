package he;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f12799a;

    static {
        try {
            Iterator it = Arrays.asList(new de.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f12799a = zd.d.a(new zd.a(new ae.j(it, 2)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
