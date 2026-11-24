package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class gy2 {
    public static final Collection a;

    static {
        try {
            Iterator it = Arrays.asList(new dl()).iterator();
            it.getClass();
            a = u6a.a(new cu2(new v6a(it, (byte) 1)));
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
