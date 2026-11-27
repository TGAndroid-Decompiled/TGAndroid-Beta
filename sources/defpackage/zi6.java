package defpackage;

import android.os.Looper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
public abstract class zi6 {
    public static final le5 a;

    static {
        Object obj;
        int i = chb.a;
        try {
            System.getProperty("kotlinx.coroutines.fast.service.loader");
        } catch (SecurityException unused) {
        }
        try {
            Iterator it = Arrays.asList(new Object()).iterator();
            it.getClass();
            Iterator it2 = k8a.a(new lt2(new l8a(it, (byte) 1))).iterator();
            if (!it2.hasNext()) {
                obj = null;
            } else {
                Object next = it2.next();
                if (it2.hasNext()) {
                    ((dk) next).getClass();
                    do {
                        ((dk) it2.next()).getClass();
                    } while (it2.hasNext());
                    obj = next;
                } else {
                    obj = next;
                }
            }
            if (((dk) obj) != null) {
                Looper mainLooper = Looper.getMainLooper();
                if (mainLooper != null) {
                    a = new le5(me5.a(mainLooper), false);
                    return;
                } else {
                    grb.i("The main looper is not available");
                    return;
                }
            }
            grb.i("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
        } catch (Throwable th) {
            throw new ServiceConfigurationError(th.getMessage(), th);
        }
    }
}
