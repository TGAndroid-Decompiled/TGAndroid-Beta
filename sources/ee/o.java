package ee;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class o {
    public static final ae.e f9090a;

    static {
        String str;
        int i10 = v.f9094a;
        Object obj = null;
        try {
            str = System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
            str = null;
        }
        if (str != null) {
            Boolean.parseBoolean(str);
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            kotlin.jvm.internal.i.e(it, "<this>");
            Iterator it2 = wd.d.a(new wd.a(new wd.e(it, 1))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((ae.a) obj).getClass();
                    do {
                        ((ae.a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((ae.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f9090a = new ae.e(ae.f.a(mainLooper), false);
                    return;
                }
                throw new IllegalStateException("The main looper is not available");
            }
            throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th2) {
            throw new ServiceConfigurationError(th2.getMessage(), th2);
        }
    }
}
