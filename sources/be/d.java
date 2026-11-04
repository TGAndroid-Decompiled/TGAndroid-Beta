package be;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class d {
    public static final Collection f3260a;

    static {
        try {
            Iterator it = Arrays.asList(new xd.b()).iterator();
            kotlin.jvm.internal.j.e(it, "<this>");
            f3260a = td.d.a(new td.a(new td.e(it, 1)));
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
