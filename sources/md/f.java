package md;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class f {
    public static final Collection f17648a;

    static {
        try {
            Iterator it = Arrays.asList(new id.b()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            f17648a = ed.d.a(new ed.a(new ed.e(it, 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
