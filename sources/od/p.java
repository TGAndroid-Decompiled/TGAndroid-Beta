package od;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class p {
    public static final kd.d f19534a;

    static {
        String str;
        int i10 = w.f19538a;
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
            kotlin.jvm.internal.j.e(it, "<this>");
            Iterator it2 = gd.d.a(new gd.a(new gd.e(it, 1))).iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    ((kd.a) obj).getClass();
                    do {
                        ((kd.a) it2.next()).getClass();
                    } while (it2.hasNext());
                }
            }
            if (((kd.a) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    f19534a = new kd.d(kd.e.a(mainLooper), false);
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
