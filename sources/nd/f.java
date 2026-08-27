package nd;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;

public abstract class f {

    public static final Collection f18484a;

    static {
        try {
            Iterator it = Arrays.asList(new jd.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f18484a = fd.d.a(new fd.a(new fd.e(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
