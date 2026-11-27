package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class qx2 {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new ek()).iterator();
            it.getClass();
            a = k8a.a(new lt2(new l8a(it, (byte) 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
