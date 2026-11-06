package ee;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class d {
    public static final Collection f10772a;

    static {
        try {
            Iterator it = Arrays.asList(new ae.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f10772a = wd.d.a(new wd.a(new wd.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
